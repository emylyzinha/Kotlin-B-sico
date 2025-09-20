fun numPrimo(n: Int): String{
    if (n <= 1) return "Não é número primo" // igual a 1 ou menor => não é primo

    var i = 2
    while (i < n) {// looping de todos os números de 2 até o passado como parametro
        if (n % i == 0) { // se n dividido pelo indice tiver como resto 0 o número não é primo
            return "Não é número primo"
        }
        i = i + 1
    }

    return "É número primo"
}


fun main() {
    println(numPrimo(1))  
    println(numPrimo(8))  
    println(numPrimo(7))  
}