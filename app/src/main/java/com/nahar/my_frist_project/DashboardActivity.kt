package com.nahar.my_frist_project

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DashboardActivity : AppCompatActivity() {      // Here dicler all id name in xml page
    private lateinit var profileLayout: LinearLayout
    private lateinit var settingLayout: LinearLayout
    private lateinit var notificationLayout: LinearLayout
    private lateinit var helpLayout: LinearLayout
    private lateinit var toolbar: Toolbar

    @SuppressLint("UseSupportActionBar")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        init()

        customToolbar()


//        profile layout
        profileLayout.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }


//        settings layout
        settingLayout.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }


//        notification layout
        notificationLayout.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
//        help layout
        helpLayout.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun customToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.dashboard)
    }

    private fun init() {
        profileLayout = findViewById(R.id.profile_layout)
        settingLayout = findViewById(R.id.setting_layout)
        notificationLayout = findViewById(R.id.notification_layout)
        helpLayout = findViewById(R.id.help_layout)
        toolbar = findViewById(R.id.toolbar)
    }
}