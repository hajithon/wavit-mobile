package com.example.challengeapp.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.challengeapp.ui.theme.Blue
import com.example.challengeapp.ui.theme.ChallengeAppTheme
import com.example.challengeapp.ui.theme.Grey400
import com.example.challengeapp.ui.theme.LightBlue
import com.example.challengeapp.ui.theme.White
import com.example.challengeapp.util.CustomTextStyle
import com.example.challengeapp.util.getTextStyle

val navBarItems = listOf<BottomNavItem> (
    BottomNavItem.MainScreen,
    BottomNavItem.HistoryScreen,
    BottomNavItem.FeedScreen,
    BottomNavItem.MyPageScreen
)



@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomNavigation (
        modifier = Modifier,
        backgroundColor = White,
        contentColor = LightBlue
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        navBarItems.forEach { item ->
            BottomNavigationItem(
                selected = currentRoute == item.screenRoute,
                onClick = {
                    navController.navigate(item.screenRoute) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        tint = if (currentRoute == item.screenRoute) Blue else Grey400
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        style = getTextStyle(style = CustomTextStyle.H7)
                            .copy(
                                fontSize = 11.sp,
                                color = if (currentRoute == item.screenRoute) Blue else Grey400
                            )
                    )
                }
            )
        }
    }
}

@Composable
@Preview
fun BottomNavigationBarPreview() {
    val context = LocalContext.current
    val navController = NavHostController(context)

    ChallengeAppTheme {
        BottomNavigationBar(navController = navController)
    }
}