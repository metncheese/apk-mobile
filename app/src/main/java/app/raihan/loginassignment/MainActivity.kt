package app.raihan.loginassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewMoveActivity: View = findViewById(R.id.text_move_activity)
        textViewMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.text_move_activity -> {
                val moveIntent = Intent(this@MainActivity, RegisterSignUp::class.java)
                startActivity(moveIntent)
            }
        }
    }
}