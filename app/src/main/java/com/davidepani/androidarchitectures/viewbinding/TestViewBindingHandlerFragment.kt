package com.davidepani.androidarchitectures.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.davidepani.androidarchitectures.R
import com.davidepani.androidarchitectures.databinding.FragmentTestViewBindingHandlerBinding
import com.davidepani.architectures.viewbinding.BaseViewBindingHandlerFragment


class TestViewBindingHandlerFragment : BaseViewBindingHandlerFragment() {

    val binding: FragmentTestViewBindingHandlerBinding get() = requireViewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        with (binding) {
            tvText.text = getString(R.string.viewbinding_fragment_handler_text)
        }
    }


    override fun inflateViewBinding(inflater: LayoutInflater, container: ViewGroup?): ViewBinding {
        return FragmentTestViewBindingHandlerBinding.inflate(inflater, container, false)
    }

}