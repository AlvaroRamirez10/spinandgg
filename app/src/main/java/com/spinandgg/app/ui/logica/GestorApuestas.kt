package com.spinandgg.app.ui.logica

import com.spinandgg.app.ui.modelos.Apuesta

object GestorApuestas {
    val apuestasExistentes = mutableListOf<Apuesta>()

    fun cargarApuestas() {
        apuestasExistentes.add(Apuesta(1, "fotopartido", "Madrid", "Barca", 1.25, 4.30, 3.50))
        apuestasExistentes.add(Apuesta(1, "fotopartido", "T1", "G2", 1.25, 4.30, 3.50))
        apuestasExistentes.add(Apuesta(1, "fotopartido", "Betis", "Sevilla", 1.25, 4.30, 3.50))
    }
}