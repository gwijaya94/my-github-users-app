package id.gwijaya94.mygithubusersapp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.gwijaya94.mygithubusersapp.model.User

class ListUserAdapter(private val listUsers: List<User>) :
    RecyclerView.Adapter<ListUserAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = listUsers.size
}