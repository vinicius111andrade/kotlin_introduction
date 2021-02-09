fun main(){
    whenComoVal()
}

//Controle de fluxo - IF

fun ifSimples(){

    val idade = 10
    val idadeMinima = 18

    if(idade < idadeMinima){
        println("Menor de idade")
    }else{
        println("Maior de idade")
    }
}

fun ifMelhorzinho(){

    val idade = 10
    val idadeMinima = 18

    val mensagem = if(idade < idadeMinima){ //if pra atribuir valor numa val/var
        println("A")
        "Menor de idade"
    }else{
        println("B")
       "Maior de idade"
    }
    println(mensagem)
}

// Controle de Fluxo = WHEN

fun whenSimples(){

    val x = 1

    when (x) {
        1 -> println("x == 1")
        2 -> {
            println("x == 2")
        }
        else -> println("n eh 1 nem 2")
    }
}

fun whenComoVal(){

    val x = 1

    val message = when (x) {
        1 -> "x == 1"
        2 -> {
            "x == 2"
        }
        else -> "n eh 1 nem 2"
    }
    println(message)
}

fun whenVer3(){
    val x = 1

    when (x) {
        !in 1..10 -> println("x n estah entre 1 e 10") // ! eh negacao
        1, 2 -> println("x == 1 ou 2")
        else -> println("n eh 1 nem 2")
    }
}

//Controle de Fluxo - laço FOR

// usado para iterar sobre uma lista de itens ou sobre uma sequencia de numeros

fun forComLista(){
    val names = listOf<String>("Kaique", "Luan", "Ocanha") //<String> força a lista a ser somente de strings

    for (item in names) println(item)
}

fun forComSequencia(){
    for (i in 1..3){
        println(i)
    }
}

fun forComSteps(){ // vai de 6 ate 0, descendo, de dois em dois, step = 2
    for (i in 6 downTo 0 step 2) println(i)
}

fun forComUntil(){
    val number = arrayListOf(1,2,3,4,5,6)

    for (i in 0 until number.size){
        println(number[i])
    }
}


// Controle de Fluxo - laços WHILE

fun whileSimples(){
    var x : Int = 10

    while (x > 0){
        println(x)
        x--
    }
}

fun dowhileSimples(){
    var x : Int = 10

    do { //o codigo eh sempre executado pelo menos uma vez, independente da condicao
        println(x)
        x--
    } while (x > 10)
}


// Controle de Fluxo - BREAK e CONTINUE

// BREAK -- usado pra parar a execucao de um laço
// CONTINUE -- usado pra executar o proximo passo do laço e pular o atual

fun exemploBreak(){
    val n = listOf<Int>(1,2,3,4,5,6)

    for (item in n){
        if (item == 3)
            break
        println(item)
    }
}

fun exemploContinue(){
    val n = listOf<Int>(1,2,3,4,5,6)

    for (item in n){
        if (item == 3)
            continue
        println(item)
    }
}