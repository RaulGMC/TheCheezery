package molina.raul.practica4_thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)

        val btnStar: Button = findViewById(R.id.button_get_started) as Button

        btnStar.setOnClickListener {
            var intent: Intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


    }
}