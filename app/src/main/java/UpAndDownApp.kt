import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.upanddown.presentation.navigation.UpAndDownNavHost

@Composable
fun UpAndDownApp(navHostController: NavHostController = rememberNavController()) {
    UpAndDownNavHost(navController = navHostController)
}