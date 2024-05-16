package br.com.jho.enquete

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import br.com.jho.enquete.login.SingInScreen
import br.com.jho.enquete.login.WelcomeScreen



    object Destinations{
        const val WELCOME_ROUTE = "welcome"
        const val SIGIN_UP_ROUTE = "signup/{email}"
        const val SIGIN_IN_ROUTE = "signin/{email}"
        const val SURVEY_ROUTE = "survey"
        const val SURVEY_RESULTS_ROUTE = "surveyresults"

    }

    @Composable
    fun Navigation(
        navcontroler:NavHostController = rememberNavController(),
    ){
        NavHost(
            navController = navcontroler,
            startDestination = "welcome"
        ){

            composable("welcome"){
                WelcomeScreen(onClikSingIn = {navcontroler.navigate("singin")})
            }
            composable("singin"){
                SingInScreen(onClickWelcome = { navcontroler.navigate("welcome") }) {

                }
            }
         /*   Composable(WELCOME_ROUTE){
                WelcomeRoute(
                    onNavigateToSignIn = {
                        navcontroler.navigate("signin/{$it}")
                    },
                    onNavigateToSignUp = {
                        navcontroler.navigate("signup/{$it}")
                    },
                    onSignInAsGuest = {
                        navcontroler.navigate(SURVEY_ROUTE)
                    }
                )
            }

          */


        }
    }
