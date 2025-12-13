package com.spinandgg.app.ui.logica

import com.spinandgg.app.ui.modelos.Usuario

object GestorUsuarios {
    val usuariosRegistrados = mutableListOf<Usuario>()
    var usuarioActivo: Usuario? = null      //usuario que en este momento está logueado en la app

    fun cargarUsuarios() {
        usuariosRegistrados.add(
            Usuario(
                "juanjo123",
                "Juan José Gómez Cobo",
                "juanjo@gmail.com",
                "+34 612 345 678",
                "15 de Noviembre, 2024",
                "1234"
            )
        )

        usuariosRegistrados.add(
            Usuario(
                "alvaro666",
                "Álvaro Pérez Sánchez",
                "alvaro@gmail.com",
                "+34 678 901 234",
                "20 de Octubre, 2024",
                "abcd"
            )
        )

        usuariosRegistrados.add(
            Usuario(
                "carlito07",
                "Carlos Rodríguez López",
                "carlos@gmail.com",
                "+34 611 223 344",
                "05 de Septiembre, 2024",
                "pass"
            )
        )    }

    fun login(usernameOrEmail: String, password: String): Usuario? {
        return usuariosRegistrados.find {
            (it.username == usernameOrEmail || it.email == usernameOrEmail)
                    && it.password == password
        }
    }

    fun crearSesion(usuarioLogueado: Usuario) {
        usuarioActivo = usuarioLogueado
    }

}