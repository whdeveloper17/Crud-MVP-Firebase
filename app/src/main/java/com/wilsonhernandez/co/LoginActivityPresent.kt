package com.wilsonhernandez.co

import android.util.Patterns
import com.wilsonhernandez.co.clases.Internet
import java.util.regex.Pattern


class LoginActivityPresent(view : LoginActivityMVP.View ) : LoginActivityMVP.Present {

    private  var internet: Internet = Internet()
    private var view: LoginActivityMVP.View=view
    private var model:LoginActivityMVP.Model=LoginActivityModel(this)
    override fun validarLoginPresent() {
        if (view!=null){
            if (internet.validarInternet()!!){
                if (!view.getEMail().isEmpty() || !view.getPassword().isEmpty()){
                    if (validarEmail(view.getEMail())){
                        if (view.getPassword().length>=8){
                            model.validarLoginModel(view.getEMail(),view.getPassword())
                        }else{
                            view.mensaje("Contraseña menor a 8 caracteres");
                        }
                    }else{
                        view.mensaje("Correo no valido");
                    }
                }else{
                    view.mensaje("No se puede degar campo vacios");
                }
            }else{
                view.mensaje("No hay internet");
            }
        }
    }

    override fun respuestaLogin() {
        view.mensaje("adas")
    }
    private fun validarEmail(email: String): Boolean {
        val pattern: Pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(email).matches()
    }
}