package valdez.francisco.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import valdez.francisco.thecheezery.R.id.btnColdDrinks
import valdez.francisco.thecheezery.R.id.btnHotDrinks
import valdez.francisco.thecheezery.R.id.btnSweets
import valdez.francisco.thecheezery.R.id.btnSalties

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnColdDrinks: Button = findViewById(btnColdDrinks)
        var btnHotDrinks: Button = findViewById(btnHotDrinks)
        var btnSweets: Button = findViewById(btnSweets)
        var btnSalties: Button = findViewById(btnSalties)

        btnColdDrinks.setOnClickListener{
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "cold")
            startActivity(intent)
        }

        btnHotDrinks.setOnClickListener{
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "hot")
            startActivity(intent)
        }

        btnSweets.setOnClickListener{
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "sweets")
            startActivity(intent)
        }

        btnSalties.setOnClickListener{
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "salties")
            startActivity(intent)
        }

    }
}