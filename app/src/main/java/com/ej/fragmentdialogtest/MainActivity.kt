package com.ej.fragmentdialogtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        showDialog1()
        showDialog2()
    }

    private fun showDialog1() {
        val dialog1 =DialogFragment1()
        dialog1.setOnclickCallback {
            val frag1Result = findViewById<TextView>(R.id.frag1_result)
            frag1Result.text = "frag1 close"
//            val intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)
//            finish()
        }
        dialog1.show(supportFragmentManager,"dialog1")
    }
    private fun showDialog2() {
        val dialog2 =DialogFragment2()
        dialog2.setOnclickCallback{
            val frag2Result = findViewById<TextView>(R.id.frag2_result)
            frag2Result.text = "frag2 close"
        }
        dialog2.show(supportFragmentManager,"dialog2")
    }
//    private fun showDialog3() {
//        val dialog3 =DialogFragment3()
//        dialog3.show(supportFragmentManager,"dialog3")
//    }
}
