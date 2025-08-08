package cloudace.ca.androiduniversityappv1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedDispatcher
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView
    private lateinit var toolbar: MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)
        toolbar = findViewById(R.id.topAppBar)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Load DashboardFragment initially
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, DashboardFragment())
            .commit()

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_courses -> {
                    // Replace with your courses fragment or activity
                    Toast.makeText(this, "Courses clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_instructors -> {
                    Toast.makeText(this, "Instructors clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_students -> {
                    Toast.makeText(this, "Students clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_markings -> {
                    Toast.makeText(this, "Markings clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_assignments -> {
                    Toast.makeText(this, "Assignments clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_notifications -> {
                    Toast.makeText(this, "Notifications clicked", Toast.LENGTH_SHORT).show()
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }




    }
}
