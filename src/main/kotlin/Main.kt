import models.Alumnos
import models.Coches


fun main () {
    var a1 = Alumnos()
    a1.presentarse()
    a1.aprovado()

    var a2 = Alumnos()
    a2.nombre = "Marcos"
    a2.edad = "22"
    a2.posicionLista = "25"
    a2.presentarse()
    a2.aprovado()

    var c1 = Coches()
    c1.info()

    var c2 = Coches()
    c2.marca = "Toyota"
    c2.matricula = "H124JK"
    c2.fabricacion = "2014"
    c2.info()
}