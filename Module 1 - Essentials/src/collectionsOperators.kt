fun main(){

}
// Transformacoes sobre collections

// vc consegue alterar uma colecao inteira seguindo uma logica especifica
// toda transformacao nao altera a colecao original
// ela retorna uma nova colecao com as alteracoes

fun transformations(){
    val numbers = setOf(1, 2, 3)

    //isso eh uma lambda function
    //cada elemento vem como it, vc pode renomear pra qlqr coisa como abaixo
    println(numbers.map {
        it * 10
    })

    println(numbers.map { number -> //isso eh uma lambda function
        number * 10
    })

    println(numbers.mapIndexed { idx, value -> //usando index
        println(idx)
        value * idx
    })

    //se o resultado da tranformacao for null ele desconsidera
    //o output ficaria [3, 9] ao inves de [3, null, 9]
    println(numbers.mapNotNull { number ->
        if ( number == 2)
            null
        else
            number * 3
    })
    //tbm existe o .mapIndexedNotNull
}


// Filtros de colecoes

fun filters(){
    val numbers = listOf("one", "two", "three", "four")

    val longerThan3 = numbers.filter { number ->
        number.length > 3
    }
    // .filterIndexed tbm existe

    val startsT = numbers.filter { number ->
        number.startsWith("t")
    }
}


// Soma, subtracao de colecoes

// isso n altera a colecao original, ela cria uma nova lista
// n pode mudar variaveis do tipo val
fun addLists(){
    val numbers = listOf("one", "two", "three", "four")

    val pluslist = numbers + "five"
    val minuslist = numbers - listOf("three", "four")
}


// Ordenaçao de Collections

// colecoes de numeros e chars sao ordenaveis

fun order(){
    val numbers = listOf(1, 2, 3, 4)

    println("Sorted ascending: ${numbers.sorted()}")
    println("Sorted descending: ${numbers.sortedDescending()}")

    val numberNames = listOf("one", "two", "three", "four")

    //para criar uma regra customizada
    val sortedNumberNames = numberNames.sortedBy { item ->
        item.length
    }
    //tbm existe a .sortedByDescending
}

fun otherHelpfulFunctions(){
    val numbers = listOf(6, 42, 10, 4)

    println("Count elements: ${numbers.count()}")
    println("Max element or null: ${numbers.maxOrNull()}")
    println("Min element or null: ${numbers.minOrNull()}")
    println("Average: ${numbers.average()}")
    println("Sum: ${numbers.sum()}")
}