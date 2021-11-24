package id.gwijaya94.mygithubusersapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.gwijaya94.mygithubusersapp.databinding.ItemUserDataRowBinding
import id.gwijaya94.mygithubusersapp.model.User

class ListUserAdapter(private val listUsers: List<User>) :
    RecyclerView.Adapter<ListUserAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClicked(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    class ListViewHolder(var binding: ItemUserDataRowBinding) :
        RecyclerView.ViewHolder(binding.root)

    interface OnItemClickCallback {
        fun onItemClicked(data: User)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            ItemUserDataRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val userData = listUsers[position]
        val parentContext = holder.itemView.context
        val imgResource =
            parentContext.resources.getIdentifier(userData.avatar, null, parentContext.packageName)

        Glide.with(parentContext).load(imgResource).circleCrop()
            .into(holder.binding.imgItemPhoto)
        holder.binding.apply {
            listItemFollower.text = userData.follower
            listItemName.text = userData.name

        }
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(userData) }

    }

    override fun getItemCount(): Int = listUsers.size
}