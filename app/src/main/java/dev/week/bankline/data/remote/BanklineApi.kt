package dev.week.bankline.data.remote

import dev.week.bankline.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path


interface BanklineApi {

    @GET("movimentacao/{id}")
    suspend fun findBankStatement(@Path("id") accountHolderId: Int): List<Movimentacao>
}