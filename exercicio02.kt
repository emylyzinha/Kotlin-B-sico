fun imparPar (n: Int){
    if (n % 2 == 0){ 
        println("É par")
    } else {
        println("É impar")
    }
}

 

fun main() {
    for (i in 1..20) { // i vale 1 e vai interando até 20
        imparPar(i)  // apresenta 1
    }
}
