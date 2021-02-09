import java.util.*

//Classes

/*
ORIENTACAO A OBJETOS

    - paradigma de programacao baseado no conceito de Objeto
    - Objetos podem ou nao conter atributos (dados) e métodos (procedimentos)
    - Objetos sao instancias de classes
    - Um Objeto eh uma abstracao de uma entidade

Classes:

    - descricoes que abstraem um conjunto de objetos com caracteristicas similares
    - descrevem as propriedades/estados (atributos) possiveis e
            as acoes/comportamentos (metodos) de um conjunto de objetos

Exemplo:

classe cliente
    atributos
        Nome
        Sobrenome
        Data de Nascimento
        Data de Cadastro
    metodos
        getIdade
        getNomeCompleto
        getDataCadastro
 */

// as classes no kotlin sao por padrao publicas, no Java sao por padrao privadas
// se quisesse uma classe privada escreveria -- private class
class Cliente (
    val nome : String,
    val sobrenome : String,
    val dataNascimento : Date,
    val dataCadastro : Date
){
    init {
        println("executa quando a classe eh inicializada, quando vira objeto")
    }
    fun getNomeCompleto() : String {
        return "$nome $sobrenome"
    }
}

fun main(){
    val cliente = Cliente(
        "Vinicius",
        "Andrade",
        Date(),
        Date() //ver como usar Date()
    )
    println(cliente.nome)
    println(cliente.getNomeCompleto())
}

// Assessores Customizados no Kotlin

class Cliente2 (
    val nome : String,
    val sobrenome : String,
    val idade : Int,
    val dataCadastro : Date
){
    val isMaiorIdade : Boolean // ele calcula a val quando chamadas
        get(){
            return this.idade >= 18
        }
}

// Estrutura de Dir e Pacotes no Kotlin

//package br.com.cursodekotlin.pacote1 //era pra estar no topo
// o nome do package costuma ser o nome do dir, mas n precisa ser
// usando alt+enter vc consegue criar o dir automaticamente

class Cliente3 (
    val nome : String,
    val sobrenome : String,
    val idade : Int,
    val dataCadastro : Date
)