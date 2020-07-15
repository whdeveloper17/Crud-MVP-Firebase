package com.wilsonhernandez.co

interface LoginActivityMVP {
    interface View{

        // esta funcion retorna el valor obtenido en campo email
        fun getEMail() : String

        // esta funcion retorna el valor obtenido en campo password
        fun getPassword() : String

        // esta funcion informa menaje al usuario
        fun mensaje (mensaje :String)

        // esta funciona desabilita los objetos de la vista
        fun disableUI();

        // esta funcion habilita los objetos de la vista
        fun enableUI()

        // esta funcion informa login error
        fun errorLogin();

        // esta funcion informa login exitoso
        fun exitoLogin()
    }

    interface Present{

        // esta funcion valida que el la informacion ingresada cumpla las caracteristicas
        fun validarLoginPresent ()

        // esta funcion resive la respuesta de validacion de login con la db
        fun respuestaLogin()
    }

    interface Model{
        // esta funcion llama al repositorio corresto para validar el login
        fun validarLoginModel(email :String,password:String)
    }
}