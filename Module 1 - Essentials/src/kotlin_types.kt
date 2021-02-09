val oneByte : Byte = 1 // -128 a 127
val oneShort : Short = 1 // -32768 a 32767
val oneInt : Int = 1 // -2^31 a 2^31-1
val oneLong : Long = 1
val anotherL = 1L // also a long, without L 1 is a int

val oneFloat : Float = 1f
val oneDouble : Double = 1.0 // needs a decimal number


//val do not implicitly convert to another type

val bigNumber : Long = 1_000_000 //same as 1000000
val hexByte = 0xFF_FF_FF //this is for readability


//Boolean

val flag : Boolean = true


//Arrays

val sequencia = arrayOf(1, 2, 3, 4, 5) //creates an array, sequencia[0] is the first element
//da pra ter arrays com mais de um tipo (1, true, "a")

//Strings

val nome = "Kaique" //nome[0] == K


//Cool things about Kotlin

val descricao = """"
    fasdjflkjads
    aklsdfjalks
    aslfkjasdf
    kasflaklf
""".trimIndent()

val valor = "oneInt eh igual a: $oneInt" //vc puxa o valor da val na str

