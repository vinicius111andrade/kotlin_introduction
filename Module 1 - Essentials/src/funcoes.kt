//Funcoes

//Essas sao funcoes locais
fun dobraInt(n : Int) : Int {
    return n * 2
}

fun betterDobraInt(n : Int) : Int = n * 2

fun main(){
    println(concatenate("uma", "duas"))
    println(concatenate(b = "teste"))

}

fun concatenate(
    a : String = "Padrao",
    b : String,
) : String {
    fun getFirstChar(str : String) : Char = str[0] //soh existe dentro desta funcao
    return "$a - ${getFirstChar(b)}"
}


//Member functions, funcoes dentro de classes

class Person {
    fun getName() : String = "nome"
}

// ai pra chamar teria q instanciar o objeto