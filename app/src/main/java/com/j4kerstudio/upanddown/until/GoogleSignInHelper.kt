package com.j4kerstudio.upanddown.until

import com.j4kerstudio.upanddown.R



import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.ActivityResultLauncher
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.auth

@Suppress("DEPRECATION")

class GoogleSignInHelper(private val context: Context, private val activity: Activity) : ViewModel() {
        private val auth: FirebaseAuth = Firebase.auth
        private val googleSignInClient: GoogleSignInClient

        init {
            val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(context.getString(R.string.default_web_client_id))
                .requestEmail()
                .build()

            googleSignInClient = GoogleSignIn.getClient(context, gso)
        }

        fun signIn() {
            val signInIntent = googleSignInClient.signInIntent
            activity.startActivityForResult(signInIntent, RC_SIGN_IN)
        }

        fun handleSignInResult(data: Intent?, onSuccess: (FirebaseUser?) -> Unit, onFailure: (Exception) -> Unit) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)!!
                firebaseAuthWithGoogle(account.idToken!!, onSuccess, onFailure)
            } catch (e: ApiException) {
                onFailure(e)
            }
        }

        private fun firebaseAuthWithGoogle(idToken: String, onSuccess: (FirebaseUser?) -> Unit, onFailure: (Exception) -> Unit) {
            val credential = GoogleAuthProvider.getCredential(idToken, null)
            auth.signInWithCredential(credential)
                .addOnCompleteListener(activity) { task ->
                    if (task.isSuccessful) {
                        onSuccess(auth.currentUser)
                    } else {
                        onFailure(task.exception ?: Exception("Authentication failed"))
                    }
                }
        }

        companion object {
            const val RC_SIGN_IN = 9001
        }
}