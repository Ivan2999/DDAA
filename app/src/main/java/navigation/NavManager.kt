package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun NavManager(){
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = "Home"){}
}