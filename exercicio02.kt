fun imparPar (n: Int){
    if (n % 2 == 0){
        println("É par")
    } else {
        println("É impar")
    }
}

fun main() {
    imparPar(5)  // Vai imprimir: É impar
    imparPar(8)  // Vai imprimir: É par
}
