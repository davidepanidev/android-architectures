package com.davidepani.architectures.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding


abstract class BaseViewBindingHandlerFragment : Fragment() {

    protected var _binding: ViewBinding? = null
        private set


    protected abstract fun provideViewBinding(inflater: LayoutInflater, container: ViewGroup?): ViewBinding
    protected inline fun <reified T: ViewBinding> requireViewBinding(): T {
        if (_binding is T) {
            return _binding as T
        } else {
            throw RuntimeException("ViewBinding must be initialized using provideViewBinding()")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = provideViewBinding(inflater = inflater, container = container)
        return _binding?.root ?: throw RuntimeException("ViewBinding must be provided using provideViewBinding()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}