package br.com.duti.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.duti.R

@Composable
fun MainScreen (navController: NavController) {
    Box(
        modifier = Modifier
            .background(color = Color.Cyan),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.Cyan),

            ) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxWidth()
                    .size(48.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.round_cottage_24),
                    contentDescription = "Home Icon"
                )
                Image(
                    painter = painterResource(R.drawable.baseline_add_circle_24),
                    contentDescription = "Add Icon"
                )
                Image(
                    painter = painterResource(R.drawable.sino_de_notificacao),
                    contentDescription = "Notifications Icon"
                )
                Image(
                    modifier = Modifier.clickable{(navController.navigate(route = "UserScreen"))},
                    painter = painterResource(R.drawable.round_account_circle_24),
                    contentDescription = "User Icon",
                )
            }
        }
    }
}

//@Preview
//@Composable
//fun MainPreview() {
//    MainScreen()
//}