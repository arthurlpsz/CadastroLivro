package br.edu.fatecpg.cadastrolivro

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetalhesActivity : AppCompatActivity(R.layout.activity_detalhes) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txvLivro = findViewById<TextView>(R.id.txv_livro)
        val fabVolta = findViewById<FloatingActionButton>(R.id.fab_volta)
        txvLivro.text = intent.getStringExtra("livro")
        fabVolta.setOnClickListener {
            finish()
        }
    }
}