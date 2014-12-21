package com.example.syobochim.syobochimapp

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity() : Activity() {
    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)

        val helloSyobochim = TextView(this)
        helloSyobochim.setText("syobochim app だぜー！！！")

        setContentView(helloSyobochim)
    }

    override fun onCreateOptionsMenu(menu : Menu): Boolean {
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        if (id == R.id.action_settings) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}