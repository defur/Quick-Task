package ua.digijed2.android.android_quick_task_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ua.digijed2.android.android_quick_task_1.databinding.ActivityMainBinding
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}