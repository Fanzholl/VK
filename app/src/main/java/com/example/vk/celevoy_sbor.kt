package com.example.vk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class celevoy_sbor : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_celevoy_sbor, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = celevoy_sbor()
    }
}