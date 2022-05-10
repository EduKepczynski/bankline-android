package dev.week.bankline.ui.statement

import androidx.lifecycle.ViewModel
import dev.week.bankline.data.BanklineRepository

class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) = BanklineRepository.findBankStatement(accountHolderId)
}