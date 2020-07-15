package com.wilsonhernandez.co

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verifyZeroInteractions
import org.mockito.Mockito.`when` as mockitoWhen


class ValidacionesLoginTest {
    var present:LoginActivityPresent?=null;

    lateinit var mockedModel:LoginActivityMVP.Model
    lateinit var mockedView:LoginActivityMVP.View
    @Before
    fun initialization(){
        mockedView=mock(LoginActivityMVP.View::class.java)
        mockedModel=mock(LoginActivityMVP.Model::class.java)
        mockitoWhen(mockedView.getEMail()).thenReturn("wil@gmail.com")
        mockitoWhen(mockedView.getPassword()).thenReturn("wilasdsa")
        present= LoginActivityPresent(mockedView);

    }
    @Test
    fun verificar_emailpassword_cuemple_caracter(){
        present!!.validarLoginPresent()
        verifyZeroInteractions(mockedView)
    }


}
