package dev.week.bankline.ui.statement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
//import dev.week.bankline.R
import dev.week.bankline.databinding.ActivityBankStatementBinding
import dev.week.bankline.databinding.ActivityWelcomeBinding
import dev.week.bankline.domain.Correntista
import dev.week.bankline.domain.Movimentacao
import dev.week.bankline.domain.TipoMovimentacao

class BankStatementActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ACCOUNT_HOLDER = "dev.week.bankline.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER) ?: throw IllegalArgumentException()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvBankStatement.layoutManager = LinearLayoutManager(this)

        findBankStatement()


    }

    private fun findBankStatement() {
        val dataSet = ArrayList<Movimentacao>()
        dataSet.add(Movimentacao(1, "03/05/2022","Exemplo", 1000.00, TipoMovimentacao.RECEITA, 1))
        dataSet.add(Movimentacao(1, "04/05/2022","Exemplo", 100.00, TipoMovimentacao.DESPESA, 1))

        binding.rvBankStatement.adapter = BankStatementAdapter(dataSet)

    }
}