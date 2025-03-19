package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.rollDiceButton).setOnClickListener {

            if (savedInstanceState == null) {
                val dieFragment = DieFragment.newInstance(10)

                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, dieFragment)
                    .commit()
            }
        }

    }
}
