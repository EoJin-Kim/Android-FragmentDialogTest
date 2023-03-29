package com.ej.fragmentdialogtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment


class DialogFragment2 : DialogFragment() {
    lateinit var onclickCallback : () -> Unit

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<Button>(R.id.frag2_btn)
        btn.setOnClickListener {
            onclickCallback()
            dismiss()
        }
    }

    @JvmName("setOnclickCallback2")
    fun setOnclickCallback(onclickCallback: () -> Unit) {
        this.onclickCallback = onclickCallback
    }
    companion object {

        @JvmStatic
        fun newInstance() = DialogFragment2()

    }
}