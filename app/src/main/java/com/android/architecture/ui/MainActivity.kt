package com.android.architecture.ui

import android.view.Menu
import android.view.MenuItem
import androidx.navigation.Navigation
import com.android.architecture.R
import com.android.architecture.ui.base.BaseActivity
import com.android.architecture.ui.payment.PaymentDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    override val layoutResourceId: Int get() = R.layout.activity_main

    override fun onSupportNavigateUp() =
        Navigation
            .findNavController(this, R.id.fragmentNavHost)
            .navigateUp()

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.credit_card -> {
                PaymentDialogFragment().show(supportFragmentManager, "CreditCardValidation")
                true
            }
            else -> false
        }
    }
}
