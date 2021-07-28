package com.plasma.rdrive
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class admin_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_home)
    }
    fun addComp(v:View){
        intent = Intent(this, com.plasma.rdrive.add_comp::class.java)
        startActivity(intent)
    }

    fun viewComp(v:View){
        intent = Intent(this, com.plasma.rdrive.view_comp::class.java)
        startActivity(intent)
    }

    fun viewreg(v:View){
        intent = Intent(this, com.plasma.rdrive.viewregister::class.java)
        startActivity(intent)
    }
    fun viewplaced(v:View){
        intent = Intent(this,com.plasma.rdrive.view_placed::class.java)
        startActivity(intent)
    }
}