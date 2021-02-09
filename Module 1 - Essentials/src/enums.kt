enum class Color(val rgb : Int){

    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF); //tem q ter ;

    fun getColor() : String {
        return this.toString()
    }
}

fun main() {
    println(Color.BLUE.getColor())
}

/*
isso aqui eh usado pra declarar varias variaveis e ter uma forma mais
legível de utilizá-las
 */