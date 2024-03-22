package com.example.baseprojectxml.common

import android.app.Activity
import com.example.baseprojectxml.CustomApplication

val Activity.customApplication: CustomApplication
get() = application as CustomApplication