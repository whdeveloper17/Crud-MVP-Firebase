package com.wilsonhernandez.co.clases

class Internet {

    fun validarInternet(): Boolean? {
        try {
            val p =
                Runtime.getRuntime().exec("ping -c 1 www.google.com")
            val `val` = p.waitFor()
            return `val` == 0
        } catch (e: Exception) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }
        return false
    }
}