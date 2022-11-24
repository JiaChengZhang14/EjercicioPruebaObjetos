package models


/**
 * se define la clase con el modelo de alumno
 */
class Alumnos{
    //estados
    var nombre: String = "Juan"
    var edad: String = "18"
    var posicionLista: String = "12"
    var nota= (1..10).random()
    //comportamientos
    fun presentarse(){
        println("Hola! Me llamo $nombre, tengo $edad años y soy el número $posicionLista en la lista y he sacado un $nota ")
    }

    fun aprovado(): Boolean{
        if (nota >= 5){
            println("Aprovado")
            return true
        }
        println("Suspenso")
        return false

    }

}

class Coches{
    //estados
    var matricula = "J123FX"
    var marca = "Renault"
    var fabricacion = "2022"
    //comportamientos
    fun info(){
        println("Hola! El coche tiene matricula: $matricula, es de la marca $marca y se fabricó en el año $fabricacion")
    }
}