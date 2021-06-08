package com.android.architecture.ui.userinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.RequestManager
import com.android.architecture.R
import com.android.architecture.common.ObservableData
import com.android.architecture.common.applyStrikeSpannableString
import com.android.architecture.data.repository.network.Product
import com.android.architecture.data.repository.network.User
import com.android.architecture.databinding.FragmentUserInfoBinding
import com.android.architecture.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class UserItemFragment: BaseFragment() {

    private var _binding: FragmentUserInfoBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    private val viewModel: UserItemViewModel by viewModels()

    private val args: UserItemFragmentArgs by navArgs()

    @Inject
    lateinit var requestManager: RequestManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun configureView() {
        if(args.login.isNullOrEmpty()) {
            showSnackBar(binding.clContent, "User login is empty")
        } else {
            viewModel
                .dealItem(args.login!!)
                .observeWithFragment(this, dealsItemObserver)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private val dealsItemObserver = Observer<ObservableData<User, Throwable>> {
        if (it.hasError()) {
            handleApiError(it.error)
        } else if (it.hasData()) {
            binding.item = it.data!!
            it.data?.avatarUrl?.let { imageUrl ->
                requestManager
                    .load(imageUrl)
                    .override(200, 200)
                    .into(binding?.imageView)
            }
        }
    }
}