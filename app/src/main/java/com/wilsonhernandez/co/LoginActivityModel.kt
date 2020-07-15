package com.wilsonhernandez.co

class LoginActivityModel(present:LoginActivityMVP.Present) : LoginActivityMVP.Model {

    private val present:LoginActivityMVP.Present=present
    private var repositorio:RepositorioFirebaseLogin=RepositorioFirebaseLoginImp(present)
    override fun validarLoginModel(email: String, password: String) {
        repositorio.validarLogin(email,password)
    }
}