package br.com.duti.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.duti.R

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopBar()
        },
        bottomBar = {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxWidth()
                    .height(48.dp) // Ajustar a altura para 48dp
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
                    contentDescription = "Notifications Icon",
                    modifier = Modifier.clickable { }
                )
                Image(
                    modifier = Modifier.clickable { navController.navigate(route = "UserScreen") },
                    painter = painterResource(R.drawable.round_account_circle_24),
                    contentDescription = "User Icon",
                )
            }
        },

        ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            //CONTÚDO PRINCIPAL
            HorizontalDivider(color = Color(0xFF000854), thickness = 2.dp)


        }
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth()
            .height(50.dp)
            .padding(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.round_search_24),
            contentDescription = "Menu Search"
        )
    }

}

