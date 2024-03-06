package br.com.duti.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.duti.R
import br.com.duti.ui.theme.Poppins


@Composable
fun UserScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF000854))
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .padding(start = 12.dp, end = 30.dp)
                    .clickable { navController.navigate(route = "MainScreen") },
                painter = painterResource(id = R.drawable.round_arrow_back_24),
                contentDescription = "Arrow Back"
            )

            Text(
                text = "Meu Perfil",
                color = Color.White,
                fontSize = 19.sp,
                fontFamily = Poppins
            )
        }

        HorizontalDivider()

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .background(color = Color(0xFF000854)),
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.telacinza),
                contentDescription = "Grey Circle",
                modifier = imageModifier,
                contentScale = ContentScale.Crop,
            )

            FloatingActionButton(
                onClick = { /*TODO*/ },
                modifier = fabModifier,
                shape = CircleShape,
                containerColor = Color(0xFFA1A1A1)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.round_camera_alt_24),
                    contentDescription = "Camera Icon",
                    modifier = CamIconModifier
                )
            }
            Text(
                text = "Usuário",
                modifier = textUserModifier,
                fontSize = 25.sp,
                fontFamily = Poppins,
                color = Color.White,
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(color = Color.White)

        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(top = 15.dp, bottom = 15.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Nome Completo",
                        fontFamily = Poppins,
                        modifier = Modifier
                            .padding(end = 12.dp)
                    )
                    HorizontalDivider(
                        modifier = Modifier
                            .width(250.dp),
                        color = Color.Gray
                    )

                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .clip(shape = RoundedCornerShape(CornerSize(5.dp)))
                    .background(color = Color.Gray)
                ) {

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(top = 15.dp, bottom = 15.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "E-mail",
                        fontFamily = Poppins,
                        modifier = Modifier
                            .padding(end = 12.dp)
                    )
                    HorizontalDivider(
                        modifier = Modifier
                            .width(350.dp),
                        color = Color.Gray
                    )

                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .clip(shape = RoundedCornerShape(CornerSize(5.dp)))
                    .background(color = Color.Gray)
                ) {

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(top = 15.dp, bottom = 15.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "CPF",
                        fontFamily = Poppins,
                        modifier = Modifier
                            .padding(end = 12.dp)
                    )
                    HorizontalDivider(
                        modifier = Modifier
                            .width(350.dp),
                        color = Color.Gray
                    )

                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .clip(shape = RoundedCornerShape(CornerSize(5.dp)))
                    .background(color = Color.Gray)
                ) {

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(top = 15.dp, bottom = 15.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {

                    Text(
                        text = "Telefone",
                        fontFamily = Poppins,
                        modifier = Modifier
                            .padding(end = 12.dp)
                    )
                    HorizontalDivider(
                        modifier = Modifier
                            .width(300.dp),
                        color = Color.Gray
                    )

                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .clip(shape = RoundedCornerShape(CornerSize(5.dp)))
                    .background(color = Color.Gray)
                ) {

                }
            }
        }
    }
}

val imageModifier = Modifier
    .offset(x = 0.dp, y = (-35).dp)
    .size(140.dp)
    .clip(CircleShape)
    .border(BorderStroke(4.dp, Color.White), CircleShape)

val fabModifier = Modifier
    .offset(x = 60.dp, y = 7.dp)

val textUserModifier = Modifier
    .offset(x = 0.dp, y = 80.dp)

val CamIconModifier = Modifier
    .offset(x = 0.dp, y = 1.dp)