package com.mousom.gmeetclone

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{
    private lateinit var newMeetingButtomSheet: NewMeetingButtomSheet
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newMeetingButtomSheet = NewMeetingButtomSheet()
        val hamMenu = findViewById<ImageButton>(R.id.menu_button)
        val button = findViewById<Button>(R.id.join_code)
        button.setOnClickListener{
            val intent = Intent(this, JoinWithCode::class.java)
            startActivity(intent)
        }

        hamMenu.setOnClickListener {
            val navDrawer = findViewById<DrawerLayout>(R.id.drawer_layout)
            if (!navDrawer.isDrawerOpen(Gravity.LEFT)) navDrawer.openDrawer(Gravity.LEFT) else navDrawer.closeDrawer(
                Gravity.RIGHT
            )
        }

//        val toolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar)
//        setSupportActionBar(toolbar)
//        val drawer: DrawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
//        val toggle = ActionBarDrawerToggle(
//            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
//        )
//        drawer.addDrawerListener(toggle)
//        toggle.syncState()
//        val navigationView: NavigationView = findViewById<NavigationView>(R.id.nav_view)
//        navigationView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
//        val id: Int = item.getItemId()
//        if (id == R.id.nav_about_us) {
//            //write your code here for what to do when item clicked
//        } else if (id == R.id.nav_rate_us) {
//        } else if (id == R.id.nav_share) {
//        } else if (id == R.id.nav_send) {
//        }
//        val drawer: DrawerLayout = findViewById(R.id.drawer_layout) as DrawerLayout
//        drawer.closeDrawer(GravityCompat.START)
       return true
    }


    fun NewMeeting(view: View) {
        newMeetingButtomSheet.show(supportFragmentManager, "Dialog")
    }

    fun CloseFragment(view: View){
       newMeetingButtomSheet.dismiss()

    }

    fun JoinWithCode(view: View){


    }


}