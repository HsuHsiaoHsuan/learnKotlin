fun main(args: Array<String>) {
    // TODO 1.
//    println("Hello, World!!")
    // TODO 2.
//    if (args.size == 0) {
//        println("Please provide a name as a command-line argument")
//        return
//    }
//    println("Hello, ${args[0]}")
    // TODO 3.
//    val list = listOf("A", "B", "C")
//    for (name in list) {
//        println("Hello, $name!")
//    }
    // TODO 4.
//    val lang = if (args.size == 0) "EN" else args[0]
//    println(when (lang) {
//        "EN" -> "Hello!"
//        "FR" -> "Salut!"
//        "IT" -> "Ciao!"
//        else -> "Sorry, I can't greet you in $lang yet"
//    })
    // TODO 5. an object-oriented Hello, no new keyword used to create an object.
//    Greeter("Freeman").greet()
    // TODO 6. use a conditional expression
//    println(max(4, 3))
//    println(max(args[0].toInt(), args[1].toInt()))
    // TODO 7. null-checks
//    val x = parseInt("3")
//    val y = parseInt("4")
//
//    if (x != null && y != null) {
//        print(x * y)
//    } else {
//        println("One of the arguments is null")
//    }
    // TODO 8. is-checks and smart casts
//    println(getStringLength("aaa"))
//    println(getStringLength(1))
    // TODO 9. use a while-loop
//    var i = 0
//    while (i < 4) {
//        println(i++)
//    }
    // TODO 10. use a for-loop
//    val data = listOf("a", "b", "c")
//    for (i in data.indices) {
//        println(data[i])
//    }
//    for (x in data) {
//        println(x)
//    }
}

// TODO 5.
//class Greeter(val name: String) {
//    fun greet() {
//        println("Hello, $name")
//    }
//}

// TODO 6.
//fun max(a: Int, b: Int) = if (a > b) a else b

// TODO 7.
//fun parseInt(str: String): Int? {
//    try {
//        return str.toInt()
//    } catch (e: NumberFormatException) {
//        println("One of the arguments isn't Int")
//    }
//    return null
//}

// TODO 8. is-checks and smart casts
//fun getStringLength(obj: Any): Int? {
//    if (obj is String) {
//        return obj.length
//    }
//    return null
//}