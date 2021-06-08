package com.android.architecture.ui.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.android.architecture.common.ObservableData
import com.android.architecture.common.RecycleViewItemClickListener
import com.android.architecture.data.repository.network.User
import com.android.architecture.databinding.FragmentUserBinding
import com.android.architecture.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UserFragment : BaseFragment(), RecycleViewItemClickListener<User> {

    private var _binding: FragmentUserBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    private val viewModel: UserViewModel by viewModels()

    @Inject
    lateinit var userAdapter: UserAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun configureView() {
        userAdapter.setOnClickListener(this)
        binding?.recyclerView.adapter = userAdapter
        binding?.recyclerView.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )
        viewModel
            .deals()
            .observeWithFragment(this, dealsObserver)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        userAdapter.setOnClickListener(null)
    }

    private val dealsObserver = Observer<ObservableData<MutableList<User>, Throwable>> {
        if (it.hasError()) {
            handleApiError(it.error)
        } else if (it.hasData()) {
            it.data?.let { items ->
                userAdapter.setItems(items)
                binding?.recyclerView.scheduleLayoutAnimation()
            }
        }
    }

    override fun onClick(item: User) {
        val action = UserFragmentDirections.actionFragmentUserToFragmentUserItem(item.login)
        findNavController().navigate(action)
    }
}
