package id.gwijaya94.mygithubusersapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.gwijaya94.mygithubusersapp.databinding.ActivityDetailUserBinding

class DetailUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailUserBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}