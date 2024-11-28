package com.example.animationinrecylerview
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val context : MainActivity,  val arnames: ArrayList<name>) :RecyclerView.Adapter<CustomAdapter.Myviewholder>() {
private var lastindex = -1
    //holds the view and sends to bind function
    class Myviewholder(view: View) : RecyclerView.ViewHolder(view) {
        val details: TextView = view.findViewById(R.id.textview)

    }

    //inflate a layout to create view holder and return the view to viewholder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        val myviews = LayoutInflater.from(context).inflate(R.layout.eachitem, parent, false)
        return Myviewholder(myviews)
    }

    //return the size of the array
    override fun getItemCount(): Int {
        return arnames.size

    }

    //bind all the data with each card views correspondingly
    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        val currentItem = arnames[position]
        holder.details.text = currentItem.names
        //pass the itemview to the animation function
//        When you create a ViewHolder by extending RecyclerView.ViewHolder, it automatically has a property called itemView. This property refers to the root view of the layout that is passed into the ViewHolder.
//        In your Myviewholder class, you passed a View as a parameter to its constructor, which then gets assigned to the itemView property.
          setAnimation(holder.itemView,position)
       // itemView is automatically available when you create a ViewHolder because it's part of the base RecyclerView.ViewHolder class.
      //  You do not need to explicitly declare itemView in your custom ViewHolder class, as it's already provided.
    }
//set animation for the view
    private fun setAnimation(viewtoanimate:View , position:Int) {
    if (position > lastindex) {
        val animatedview: Animation =
            AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left)
        viewtoanimate.startAnimation(animatedview)
        lastindex = position

    }

}
}
