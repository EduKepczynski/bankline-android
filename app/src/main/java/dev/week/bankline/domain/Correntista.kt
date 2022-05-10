package dev.week.bankline.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Correntista(
    val id: Int     // São variáveis que não vão ser alteradas, como as final no java.
) : Parcelable
