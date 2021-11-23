package id.gwijaya94.mygithubusersapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import id.gwijaya94.mygithubusersapp.ListUserAdapter
import id.gwijaya94.mygithubusersapp.databinding.ActivityMainBinding
import id.gwijaya94.mygithubusersapp.getJsonDataFromAsset
import id.gwijaya94.mygithubusersapp.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userData: List<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var jsonListUser = getJsonDataFromAsset(this, "githubuser.json")
        userData = jsonListUser.users

        val listUsersAdapter = ListUserAdapter(userData)
        binding.rvListUsers.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = listUsersAdapter
        }
    }
}