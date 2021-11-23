package id.gwijaya94.mygithubusersapp.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import id.gwijaya94.mygithubusersapp.ListUserAdapter
import id.gwijaya94.mygithubusersapp.databinding.ActivityMainBinding
import id.gwijaya94.mygithubusersapp.getJsonDataFromAsset
import id.gwijaya94.mygithubusersapp.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listUserData: List<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var jsonListUser = getJsonDataFromAsset(this, "githubuser.json")
        listUserData = jsonListUser.users

        val listUsersAdapter = ListUserAdapter(listUserData)
        binding.rvListUsers.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = listUsersAdapter
        }
    }
}