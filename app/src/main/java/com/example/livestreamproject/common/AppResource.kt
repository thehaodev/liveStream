package com.example.livestreamproject.common

import android.app.Application
import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.*
import androidx.core.content.ContextCompat

object AppResource {

    lateinit var application: Application

    fun init(application: Application) {
        AppResource.application = application
    }

    fun getViewInflater(@LayoutRes layoutRes: Int, container: ViewGroup?): View {
        application.let {
            val inflater = application.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            return inflater.inflate(layoutRes, container, false)
        }
    }

    fun getColor(@ColorRes colorRes: Int): Int {
        application.let {
            return ContextCompat.getColor(it, colorRes)
        }
    }

    fun getDrawable(@DrawableRes drawableRes: Int): Drawable? {
        application.let {
            return ContextCompat.getDrawable(it, drawableRes)
        }
    }

    fun getString(@StringRes stringRes: Int): String {
        application.let {
            return it.getString(stringRes)
        }
    }

    fun getArrayString(@ArrayRes arrayRes: Int): Array<String> {
        application.let {
            return application.resources.getStringArray(arrayRes)
        }
    }

    fun getStringFormat(@StringRes stringRes: Int, args: Any): String {
        application.let {
            return String.format(application.getString(stringRes), args)
        }
    }

    @JvmStatic
    fun getDimensionOffset(@DimenRes dimenRes: Int): Int {
        application.let {
            return it.resources.getDimensionPixelOffset(dimenRes)
        }
    }
}
