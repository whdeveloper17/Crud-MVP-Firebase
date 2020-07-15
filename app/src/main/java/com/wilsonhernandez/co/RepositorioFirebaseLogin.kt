package com.wilsonhernandez.co

interface RepositorioFirebaseLogin {

    // esta funcion valida el login con la db
    fun validarLogin(email:String,password:String)
}