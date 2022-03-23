package com.davidepani.androidarchitectures.viewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.davidepani.androidarchitectures.databinding.FragmentTestViewBindingHandlerBinding
import com.davidepani.architectures.viewbinding.BaseViewBindingHandlerFragment


class TestViewBindingHandlerFragment : BaseViewBindingHandlerFragment() {

    val binding: FragmentTestViewBindingHandlerBinding get() = requireViewBinding()


    override fun provideViewBinding(inflater: LayoutInflater, container: ViewGroup?): ViewBinding {
        return FragmentTestViewBindingHandlerBinding.inflate(inflater, container, false)
    }

}