fun main(){

    val scoreFirstGame = 10
    val scoreSecondGame = 13

    val sumTotal = { a: Int, b: Int -> //uma variavel cujo valor eh uma funcao
        a + b
    }
    println(sumTotal(scoreFirstGame, scoreSecondGame))
}

// o lambda vc usa pra passar uma funcao como se fosse um valor
// vc pode receber uma funcao dentro de uma funcao desse jeito,
// vc pode passar dentro de um if, dentro de um when