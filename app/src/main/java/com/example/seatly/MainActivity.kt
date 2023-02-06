package com.example.seatly



import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(
            {
                val i = Intent(this ,LoginActivity::class.java)

                startActivity(i)
                finish() },
            3000
        )
    }
}