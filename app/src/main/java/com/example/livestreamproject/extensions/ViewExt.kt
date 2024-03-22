package com.example.livestreamproject.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.LayoutRes
import androidx.core.view.doOnLayout
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

fun View.setMargins(left: Int? = null, top: Int? = null, right: Int? = null, bottom: Int? = null) {
    val marginParam: ViewGroup.MarginLayoutParams = this.layoutParams as ViewGroup.MarginLayoutParams

    marginParam.setMargins(
        left ?: 0,
        top ?: 0,
        right ?: 0,
        bottom ?: 0
    )
}

fun View.setPaddings(left: Int? = null, top: Int? = null, right: Int? = null, bottom: Int? = null) {
    setPadding(
        left ?: 0,
        top ?: 0,
        right ?: 0,
        bottom ?: 0
    )
}

fun ImageView.loadNetworkImage(url: String?) {
    val options: RequestOptions = RequestOptions()
        .centerCrop()
        .error(R.drawable.ic_no_image)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .priority(Priority.HIGH)
        .dontAnimate()
        .dontTransform()

    Glide.with(this)
        .load(url)
        .apply(options)
        .into(this)
}

/**
 * [url] is remote path and local path
 */
fun ImageView.loadFromPath(url: String?) {
    val options: RequestOptions = RequestOptions()
        .centerCrop()
        .error(R.drawable.ic_no_image)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .priority(Priority.HIGH)
        .dontAnimate()
        .dontTransform()

    Glide.with(this)
        .load(url)
        .apply(options)
        .into(this)
}


fun ImageView.loadLocalImage(pathPhoto: String?) {
    val options: RequestOptions = RequestOptions()
        .centerCrop()
        .error(R.drawable.ic_no_image)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .priority(Priority.HIGH)
        .dontAnimate()
        .dontTransform()

    Glide.with(this)
        .load(pathPhoto)
        .apply(options)
        .into(this)
}

fun ViewGroup.setContentView(@LayoutRes layoutId: Int) {
    LayoutInflater.from(context).inflate(layoutId, this, true)
}

fun View.show() {
    this.isVisible = true
}

@BindingAdapter("")
fun goneUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}


fun View.hide() {
    this.isVisible = false
}

fun View.notAble() {
    this.alpha = 0.5f
    this.isFocusable = false
    this.isClickable = false
}

fun View.able() {
    this.alpha = 1f
    this.isFocusable = true
    this.isClickable = true
}

fun View.gone() {
    this.visibility = View.GONE
}

fun View.invisible() {
    this.isInvisible = true
}

fun View.setWidthHeight(width: Int, height: Int) {
    layoutParams.width = width
    layoutParams.height = height
    requestLayout()
}

fun View.setHeight(height: Int) {
    layoutParams.height = height
    requestLayout()
}

fun View.setWidth(width: Int) {
    layoutParams.width = width
    requestLayout()
}

//fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
//    val safeClickListener = SafeClickListener {
//        onSafeClick(it)
//    }
//    setOnClickListener(safeClickListener)
//}
//
//fun View.setOnFinishedClickListener(listener: OnFinishedClickListener) {
//    val finishedClickListener = FinishedClickListener(listener)
//    setOnClickListener(finishedClickListener)
//}

fun <T: View> T.requestInfo(listenerCompleted: (T) -> Unit) {
    this.doOnLayout {
        listenerCompleted.invoke(this)
    }
}
