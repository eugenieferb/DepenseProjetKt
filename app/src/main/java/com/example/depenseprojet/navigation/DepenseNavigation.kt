package com.example.depenseprojet.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.depenseprojet.screen.depense.DepenseScreen
import com.example.depenseprojet.screen.details.DetailsScreen
import com.example.depenseprojet.screen.home.HomeScreen
import com.example.depenseprojet.screen.save.SaveScreen
import com.example.depenseprojet.screen.suivi.SuiviScreen



@Composable
fun DepenseNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = DepenseProjetScreen.HomeScreen.name ){
        composable(DepenseProjetScreen.HomeScreen.name){
            HomeScreen(
                navController = navController
            )
        }

        composable(
            DepenseProjetScreen.DetailsScreen.name+"/{depense}",
            arguments = listOf(navArgument(name = "depense"){type = NavType.StringType})
        ){
                backStackEntry ->
            DetailsScreen(navController = navController, backStackEntry.arguments?.getString("depense"))
        }
        composable(DepenseProjetScreen.DepenseScreen.name){
            DepenseScreen(
                navController = navController
            )
        }
        composable(DepenseProjetScreen.SaveScreen.name){
            SaveScreen(
                navController = navController
            )
        }
        composable(DepenseProjetScreen.SuiviScreen.name){
            SuiviScreen(
                navController = navController
            )
        }
    }
}