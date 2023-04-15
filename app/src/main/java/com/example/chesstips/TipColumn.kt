package com.example.chesstips

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import com.example.chesstips.Model.ChessTip

@Composable
fun TipColumn(tips: List<ChessTip>){
    LazyColumn {
        itemsIndexed(tips){ index, tip ->
            ChessTipCard(
                chessTip = tip,

                num = index + 1

            )
        }
    }
}
