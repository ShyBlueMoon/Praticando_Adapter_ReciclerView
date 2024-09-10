package com.luanasilva.praticandoadaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter (
    private val lista:List<Mensagem>
) : Adapter<MensagemAdapter.MensagemViewHolder>() {



    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder(itemView){

        val textNome: TextView = itemView.findViewById(R.id.txtNome)
        val textUltima: TextView = itemView.findViewById(R.id.textUltimo)
        val textHorario: TextView = itemView.findViewById(R.id.textHorario)


    }

    //Cria a visualização do xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        //Pegar um xml e converter em objeto View
        val itemView = layoutInflater.inflate(R.layout.item_lista,parent,false)

        return MensagemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val mensagem = lista[position]
        holder.textNome.text = mensagem.nome
        holder.textNome.text = mensagem.ultimaMensagem
        holder.textNome.text = mensagem.horario

    }
}