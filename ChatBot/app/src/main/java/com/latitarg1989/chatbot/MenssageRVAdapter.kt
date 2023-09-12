package com.latitarg1989.chatbot

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenssageRVAdapter (private val listaMensajes: ArrayList<MessageRVModal>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // Mensaje del usuario
    class UserMessageViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val userMsgTV : TextView = itemView.findViewById(R.id.TVUsuario)
    }
    // Mensaje del bot
    class BotMessageViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val botMsgTV : TextView = itemView.findViewById(R.id.TVBot)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        TODO("Not yet implemented")
        return  listaMensajes.size
    }


}