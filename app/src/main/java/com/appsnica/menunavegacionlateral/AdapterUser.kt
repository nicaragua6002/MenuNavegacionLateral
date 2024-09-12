package com.appsnica.menunavegacionlateral

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.appsnica.menunavegacionlateral.databinding.SimpleitemlistBinding

class AdapterUser(context: Context, resource: Int, lista: MutableList<User>) :
    ArrayAdapter<User>(context, resource,lista) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val binding: SimpleitemlistBinding
        var itemview: View
        if(convertView == null) {
            binding = SimpleitemlistBinding.inflate(LayoutInflater.from(context),parent, false)
            //itemview = LayoutInflater.from(context).inflate(R.layout.simpleitemlist, parent, false)
            itemview=binding.root
            // Usamos tag para guardar el binding y reutilizarlo
            itemview.tag = binding
        } else {
            // Recuperamos el binding guardado
            itemview = convertView
            binding = itemview.tag as SimpleitemlistBinding
        }
        val usuario= getItem(position)
        binding.txtNombre.text= usuario!!.name
        binding.txtAddress.text= usuario.address

        return itemview
    }
}