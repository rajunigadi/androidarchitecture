package com.android.architecture.ui.payment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.DialogFragment
import com.android.architecture.data.utils.validateCreditCard
import com.android.architecture.databinding.DialogPaymentBinding

/**
 * Dialog that displays a minimal credit card entry form.
 *
 * Your task here is to enable the "submit" button when the credit card number is valid and
 * disable the button when the credit card number is not valid.
 *
 * You do not need to input any of your actual credit card information. See `Validators.kt` for
 * info to help you get fake credit card numbers.
 *
 * You do not need to make any changes to the layout of this screen (though you are welcome to do
 * so if you wish).
 */
class PaymentDialogFragment : DialogFragment() {

    private var _binding: DialogPaymentBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DialogPaymentBinding.inflate(inflater, container, false)
        binding.cancel.setOnClickListener { dismiss() }
        binding.submit.setOnClickListener { dismiss() }

        binding.cardNumber.doAfterTextChanged {
            val isValidCard = validateCreditCard(it.toString())
            binding.submit.isEnabled = isValidCard
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}