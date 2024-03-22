package com.example.appbase.base

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AlertDialog
import com.example.appbase.R

//class LoadingHandler(context: Context) {
//
//    private var dialog: AlertDialog
//
//    init {
//        val dialogBuilder = AlertDialog.Builder(context, R.style.LoadingDialog)
//        val dialogView: View = View.inflate(context, R.layout.layout_loading, null)
//
//        dialogBuilder.setView(dialogView)
//        dialog = dialogBuilder.create()
//        dialog.setCancelable(false)
//
//        val window: Window? = dialog.window
//        window?.setLayout(
//            WindowManager.LayoutParams.WRAP_CONTENT,
//            WindowManager.LayoutParams.WRAP_CONTENT
//        )
//        window?.setGravity(Gravity.CENTER)
//    }
//
//    fun showLoading(isLoading: Boolean) {
//        if (isLoading) {
//            showLoading()
//        } else {
//            hideLoading()
//        }
//    }
//
//    private fun showLoading() {
//        if (!dialog.isShowing) {
//            dialog.show()
//        }
//    }
//
//    private fun hideLoading() {
//        if (dialog.isShowing) {
//            dialog.dismiss()
//        }
//    }
//
//}
