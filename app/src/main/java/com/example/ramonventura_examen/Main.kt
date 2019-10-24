package com.example.ramonventura_examen

fun main(){
    val elevador = Elevador(1,EstadoElevador.DETENIDO)
    while(true){
        print("Ingrese el piso al que desea ir: ")
        val pisoUsuario: String? = readLine()
        if (pisoUsuario != null) {
            if(pisoUsuario.toInt()>elevador.piso){
                elevador.Subir(pisoUsuario.toInt())
            }else{

            }
        }
    }
}
