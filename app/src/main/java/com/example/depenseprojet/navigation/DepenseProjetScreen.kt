package com.example.depenseprojet.navigation


import java.lang.IllegalArgumentException

enum class DepenseProjetScreen {
    HomeScreen,
    DetailsScreen,
    SuiviScreen,
    DepenseScreen,
    SaveScreen;//
    companion object {
        fun fromRoute(route: String?): DepenseProjetScreen
                = when(route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            SuiviScreen.name -> SuiviScreen
            DepenseScreen.name -> DepenseScreen
            SaveScreen.name -> SaveScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognised")
        }
    }

}