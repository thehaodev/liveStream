package com.example.livestreamproject.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.livestreamproject.R
import com.example.livestreamproject.databinding.ViewOutlineTextInputBinding


class OutlineTextInput @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    private val binding: ViewOutlineTextInputBinding = ViewOutlineTextInputBinding.inflate(
        LayoutInflater.from(context), this, true)

    init {
        loadAttrs(attrs)
    }

    private fun loadAttrs(attrs: AttributeSet?) {
        context.obtainStyledAttributes(attrs, R.styleable.OutlineTextInput).apply {
            val hint: String? = getString(R.styleable.OutlineTextInput_oti_hint)
            val prefixText: String? = getString(R.styleable.OutlineTextInput_oti_prefixText)
            val inputType: Int = getInteger(R.styleable.OutlineTextInput_oti_inputType, 0x00000001)
            recycle()


        }
    }

}
