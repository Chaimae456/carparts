package com.example.carpartsalpha.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class CarpartsButton(context: Context,attrs:AttributeSet) : AppCompatButton(context,attrs) {
    init {
        applyFont()

    }
    private fun applyFont(){
        val typeface: Typeface = Typeface.createFromAsset(context.assets,"alibaba_sans_heavy.ttf")
        setTypeface(typeface)
    }
}