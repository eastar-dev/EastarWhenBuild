package dev.eastar.whenbuild.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dev.eastar.whenbuild.BuildConfig.BUILD_TIME

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.build_time).text = BUILD_TIME
    }
}