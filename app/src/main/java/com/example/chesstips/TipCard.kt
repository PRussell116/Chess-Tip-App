package com.example.chesstips

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandIn
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chesstips.Model.ChessTip
import com.example.chesstips.ui.theme.ChessTipsTheme

@Composable
fun ChessTipCard(chessTip: ChessTip, num: Int) {
    var expanded by remember { mutableStateOf(false) }
    ElevatedCard (
        elevation =CardDefaults.cardElevation(defaultElevation = 5.dp),
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ){
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,

                modifier = Modifier
                    .padding(8.dp)
                    .background(MaterialTheme.colorScheme.primaryContainer)
                    .fillMaxWidth()
            )
            {

                Text(
                    text = num.toString(),
                    modifier = Modifier.padding(start = 8.dp),
                    style = MaterialTheme.typography.headlineMedium
                )


                Text(
                    text = stringResource(chessTip.tipTitleRes),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.headlineMedium

                )

                TipItemButton(expanded = expanded) { expanded = !expanded }
            }
                AnimatedVisibility(
                    visible = expanded,
                    enter = expandIn(),
                    exit = shrinkOut()
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,

                        ) {
                        Image(
                            painter = painterResource(chessTip.imgRes),
                            contentDescription = "Image of a chess board",
                        )
                        Text(
                            textAlign = TextAlign.Center,
                            text = stringResource(chessTip.tipText),
                            modifier = Modifier
                                .padding(horizontal = 6.dp),

                            overflow = TextOverflow.Ellipsis,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
        }

    }

}

@Composable
fun TipItemButton(
    expanded: Boolean,
    onClick: () -> Unit
)
{
    IconButton(onClick = onClick) {
        Icon(
            imageVector = if(expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
            contentDescription = stringResource(R.string.iconButtonDes) )
    }
}

@Preview
@Composable
fun CardPreview(){
    ChessTipsTheme {
        ChessTipCard(
            chessTip = ChessTip(R.string.tip1,R.drawable.controlcenter,R.string.tipText1),
            1
        )

    }
}