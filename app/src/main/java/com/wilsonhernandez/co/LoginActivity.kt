package com.wilsonhernandez.co

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout


class LoginActivity : AppCompatActivity(),LoginActivityMVP.View {
    @BindView(R.id.textfield_loginactivity_email)
    lateinit var textfield_loginactivity_email: TextInputLayout

    @BindView(R.id.textfield_loginactivity_password)
    lateinit var textfield_loginactivity_password: TextInputLayout

    @BindView(R.id.contra_loginactivity_contenedor)
    lateinit var contra_loginactivity_contenedor : View

    @OnClick(R.id.button_loginactivity_login)
    fun validarLoginView(view:View){
        present?.validarLoginPresent()
    }
    private var present:LoginActivityMVP.Present?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide()
        present=LoginActivityPresent(this);
        ButterKnife.bind(this)
    }

    override fun getEMail(): String {
        return textfield_loginactivity_email.editText?.text.toString()
    }

    override fun getPassword(): String {
        return textfield_loginactivity_password.editText?.text.toString()

    }

    override fun mensaje(mensaje: String) {
        Snackbar.make(contra_loginactivity_contenedor,mensaje,Snackbar.LENGTH_LONG).show()
    }

    override fun disableUI() {
        TODO("Not yet implemented")
    }

    override fun enableUI() {
        TODO("Not yet implemented")
    }

    override fun errorLogin() {
        TODO("Not yet implemented")
    }

    override fun exitoLogin() {
        TODO("Not yet implemented")
    }
}