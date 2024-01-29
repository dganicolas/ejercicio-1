class rectangulo(val nombre: String,val base:Int, val altura:Int){
    var operacion = 0

    fun calcular_area(){
        operacion = this.base * this.altura
        println("el area del rectangulo ${this.nombre} es: ${operacion}")
    }
    fun calcular_perimetro(){
        operacion = 2 * (this.base + this.altura)
        println("el perimetro del rectangulo  ${this.nombre} es: ${operacion}")
    }

}
fun main() {
// * Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para
// calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.
//
// Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "".
// (Pulsa Ctrl+o)
// se me ralla
// En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
// *
    val rectangulo1 = rectangulo("paco",12,34)
    val rectangulo2 = rectangulo("rombo",3,4)
    val rectangulo3 = rectangulo("XD",2,454)
    val rectangulo4 = rectangulo("apruebame",122342,34)
    val rectangulo5 = rectangulo("diego",12342,34234)
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