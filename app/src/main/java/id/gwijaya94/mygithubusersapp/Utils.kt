package id.gwijaya94.mygithubusersapp

import android.content.Context
import com.google.gson.Gson
import id.gwijaya94.mygithubusersapp.model.JsonListUser

fun getJsonDataFromAsset(context: Context, fileName: String): JsonListUser {
    val gson = Gson()
    val jsonFileString = context.assets.open(fileName).bufferedReader().use { it.readText() }

    return gson.fromJson(jsonFileString, JsonListUser::class.java)
}