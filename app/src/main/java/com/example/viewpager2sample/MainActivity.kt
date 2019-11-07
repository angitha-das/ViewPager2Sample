package com.example.viewpager2sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2sample.DummyImageData.images
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PhotoAdapter()
        viewPager2.adapter = adapter
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        adapter.setItem(images)
    }
}
