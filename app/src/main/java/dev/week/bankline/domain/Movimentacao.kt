package dev.week.bankline.domain

data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,
    //TODO mapear idConta como idCorrentista
    val idCorrentista: Int
)
