package com.mynus01.unikotest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.mynus01.unikotest.R
import com.mynus01.unikotest.databinding.FragmentBottomBinding
import com.mynus01.unikotest.viewmodel.BottomViewModel

class BottomFragment : Fragment() {
    private lateinit var binding: FragmentBottomBinding
    private val viewModel: BottomViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bottom, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.imageOutput.observe(viewLifecycleOwner) { url ->
            Glide.with(requireContext())
                .load(url)
                .into(binding.ivUserPicture)
        }
    }
}