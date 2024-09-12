package com.appsnica.menunavegacionlateral

//Estructura de los datos
data class User(val idUser: Int, val name: String, val address: String, val avatar: String)

//Definimos la lista con los valores
var listaUsuarios = mutableListOf(
    User(1,"Juan Perez", "Managua","https://loremflickr.com/200/200?random=1")
    ,User(2,"Maria Lopez", "Masaya","https://loremflickr.com/200/200?random=1")
    , User(3,"Jose Molina", "León","https://loremflickr.com/200/200?random=1")
)