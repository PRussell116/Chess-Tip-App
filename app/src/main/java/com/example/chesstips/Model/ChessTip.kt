package com.example.chesstips.Model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.chesstips.R

data class ChessTip(
    @StringRes var tipTitleRes: Int,
    @DrawableRes var imgRes: Int,
    @StringRes var tipText : Int
    ){
}

val tipsCollection = listOf<ChessTip>(
    ChessTip(tipTitleRes = R.string.tip1, imgRes = R.drawable.controlcenter, tipText = R.string.tipText1),
    ChessTip(tipTitleRes = R.string.tip2, imgRes = R.drawable.developpieces, tipText = R.string.tipText2),
    ChessTip(tipTitleRes = R.string.tip3, imgRes = R.drawable.castleearly, tipText = R.string.tipText3),

    ChessTip(tipTitleRes = R.string.tip4,R.drawable.t4,R.string.tipText4),
    ChessTip(tipTitleRes = R.string.tip5,R.drawable.t5,R.string.tipText5),
    ChessTip(tipTitleRes = R.string.tip6,R.drawable.t6,R.string.tipText6),
    ChessTip(tipTitleRes = R.string.tip7,R.drawable.t7,R.string.tipText7),
    ChessTip(tipTitleRes = R.string.tip8,R.drawable.t8,R.string.tipText8),
    ChessTip(tipTitleRes = R.string.tip9,R.drawable.t9,R.string.tipText9),
    ChessTip(tipTitleRes = R.string.tip10,R.drawable.t10,R.string.tipText10),
    //TODO add more tips


)
