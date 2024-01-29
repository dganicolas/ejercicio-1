/**
 * Clase rectaangulo
 * @param nombre nombre del rectangulo para que yo sepa que esta correcto
 * @param base la base del rectangulo
 * @param altura altura del rectangulo
 */
class Rectangulo(val nombre: String,val base:Int, val altura:Int){
    var operacion = 0

     /**
     * calcula el area del rectangulo, la formula es base del rectangulo por altura del mismo
     */
    fun calcular_area(){
        operacion = this.base * this.altura
        println("el area del rectangulo ${this.nombre} es: ${operacion}")
    }
    /**
     * calcula el perimetro del rectangulo, la formula es 2 por  base del rectangulo mas altura del mismo
     */
    fun calcular_perimetro(){
        operacion = 2 * (this.base + this.altura)
        println("el perimetro del rectangulo  ${this.nombre} es: ${operacion}")
    }

}

/**
 * funcion principal que esta dentro todas las llamadas a otras funciones
 */
fun main() {
// * Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para
// calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.
//
// Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "".
// (Pulsa Ctrl+o)
// se me ralla
// En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
// *
    val rectangulo1 = Rectangulo("paco",12,34)
    val rectangulo2 = Rectangulo("rombo",3,4)
    val rectangulo3 = Rectangulo("XD",2,454)
    val rectangulo4 = Rectangulo("apruebame",122342,34)
    val rectangulo5 = Rectangulo("diego",12342,34234)
    rectangulo1.calcular_area()
    rectangulo1.calcular_perimetro()
    rectangulo2.calcular_area()
    rectangulo2.calcular_perimetro()
    rectangulo3.calcular_area()
    rectangulo3.calcular_perimetro()
    rectangulo4.calcular_area()
    rectangulo4.calcular_perimetro()
    rectangulo5.calcular_area()
    rectangulo5.calcular_perimetro()
    rectangulo5.calcular_area()
    rectangulo5.calcular_perimetro()
}