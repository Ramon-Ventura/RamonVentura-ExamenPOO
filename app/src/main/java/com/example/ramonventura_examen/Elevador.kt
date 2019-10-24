package com.example.ramonventura_examen

enum class EstadoElevador(){
    ARRIBA,DETENIDO,ABAJO
}
class Elevador (var piso: Int, var estado: EstadoElevador) {

    fun Subir(piso_usuario:Int){
        estado = EstadoElevador.ARRIBA
        while(piso<piso_usuario){
            timeState()
            println("Estado del elevador $estado, piso $piso")
            piso++
        }
        estado = EstadoElevador.DETENIDO
        println("Estado del elevador $estado, en el piso $piso_usuario")
        piso = piso_usuario
    }

    fun Bajar(piso_usuario: Int){

    }
    fun timeState(){
        Thread.sleep(1000)
    }
}