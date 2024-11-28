package com.example.animationinrecylerview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var rec:RecyclerView
    lateinit var arlist : ArrayList<String>
    lateinit var arnames :ArrayList<name>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        rec = findViewById(R.id.rec)
        arnames = ArrayList()
        arlist = arrayListOf("Animation 1","Animation 2","Animation 3", "Animation 4","Animation 5","Animation 6","Animation 7","Animation 8","Animation 9"," Animation 10","Animation 11","Animation 1","Animation 2","Animation 3", "Animation 4","Animation 5","Animation 6","Animation 7","Animation 8","Animation 9"," Animation 10","Animation 11")

        for(idx in arlist.indices){
            val values = name(arlist[idx])
            arnames.add(values)

        }

        rec.layoutManager = LinearLayoutManager(this)
        val myadapter = CustomAdapter(this,arnames)
        rec.adapter = myadapter



}
}