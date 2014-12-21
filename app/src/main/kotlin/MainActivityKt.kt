package com.example.syobochim.syobochimapp

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Button
import android.view.View
import android.widget.EditText

class MainActivity() : Activity(), View.OnClickListener {

    var btn: Button? = null
    var printText: TextView? = null
    var editText: EditText? = null

    var talk = StringBuilder("しょぼちむだよー！")

    override fun onCreate(saveInstanceState: Bundle?) {
        super<Activity>.onCreate(saveInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button01) as Button
        printText = findViewById(R.id.textView) as TextView
        editText = findViewById(R.id.editText01) as EditText

        btn?.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        talk.append("\r\n")
        talk.append(editText?.getText())
        printText?.setText(talk.toString())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        if (id == R.id.action_settings) {
            return true
        }
        return super<Activity>.onOptionsItemSelected(item)
    }
}