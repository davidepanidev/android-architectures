package com.github.davidepanidev.androidarchitectures.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.github.davidepanidev.androidarchitectures.R
import com.github.davidepanidev.androidarchitectures.databinding.FragmentTestViewBindingHandlerBinding


class TestViewBindingHandlerFragment : BaseViewBindingHandlerFragment() {

    private val binding: FragmentTestViewBindingHandlerBinding get() = requireViewBinding()

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