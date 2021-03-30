package me.saket.baseandroidproject

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.view.View.SCROLLBARS_INSIDE_OVERLAY
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val sv = findViewById<View>(R.id.scrollviewfoo)
    sv.isVerticalScrollBarEnabled = true
    sv.scrollBarStyle = SCROLLBARS_INSIDE_OVERLAY
  }
}

class NestedScrollViewWithBars(
  context: Context,
  attrs: AttributeSet
) : NestedScrollView(context, attrs, android.R.attr.scrollViewStyle)