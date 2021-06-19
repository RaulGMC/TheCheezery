package molina.raul.practica4_thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var intent = Intent(this, ProductosActivity::class.java)

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button
        var btnSweet: Button = findViewById(R.id.button_sweets) as Button
        var btnSalties: Button = findViewById(R.id.button_salties) as Button
        //var imagenTitulo : ImageView? = findViewById(R.id.title_products) as ImageView

        btnCold.setOnClickListener {
            intent.putExtra("type", "coldDrinks")
            //imagenTitulo?.setImageResource(R.drawable.cold_drinks)
            startActivity(intent)
        }
        btnHot.setOnClickListener {
            intent.putExtra("type", "hotDrinks")
            //imagenTitulo?.setImageResource(R.drawable.hot_drinks)
            startActivity(intent)
        }
        btnSweet.setOnClickListener {
            intent.putExtra("type", "sweets")
            //imagenTitulo?.setImageResource(R.drawable.sweets)
            startActivity(intent)
        }
        btnSalties.setOnClickListener {
            intent.putExtra("type", "salties")
            //imagenTitulo?.setImageResource(R.drawable.salties)
            startActivity(intent)
        }

    }
}