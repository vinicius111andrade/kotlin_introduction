// Collections

/*
List - elementos ordenados e com indices
Set - mesma coisa q lista porém todos elementos sao unicos
Map - um dicionario basicamente

Tipos de coleçoes:

 - Read-Only
 - Mutable
 */

fun main(){

}

//Lists
fun listReadOnly(){

    val numbers = listOf("um", "dois", "tres", "quatro") //read-only
    println("Total de elementos: ${numbers.size}")
    println("Terceiro elemento: ${numbers.get(2)}")
    println("Quarto elemento: ${numbers[3]}")
    println("Indice do elemento \"dois\" ${numbers.indexOf("dois")}")
}

fun listMutable(){
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    println(numbers)
    numbers.shuffle()
    println(numbers)
}

//Sets
fun setExemplo(){
    val numbers = setOf(1, 2, 3, 4, 2, 2, 2, 2, 2, 2)
    println("Total de elementos: ${numbers.size}") //esse set tem 4 elementos, os repetidos sao ignorados
    if (numbers.contains(1)) println("1 estah no set")

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("Os sets sao iguais: ${numbers == numbersBackwards}") //ele checa se tem os mesmos elementos, n importa ordem

    println(numbers.first())
    println(numbersBackwards.first()) //a ordem n eh alterada, eh a mesma da ordem de criacao
}

//Maps
fun mapReadOnly(){
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("Todas as chaves: ${numbersMap.keys}")
    println("Todas os valores: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Valor pela chave \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("O valor 1 esta no map")
    if (numbersMap.containsValue(1)) println("O valor 1 esta no map")
}

fun mapMutable(){
    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
    numbersMap.put("three", 3)
    numbersMap["one"] = 11
    println(numbersMap)
}
