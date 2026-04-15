
//1//
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val total = firstNumber + secondNumber // menambahkan "val total = firstNumber + secondNumber"
    println("$firstNumber + $secondNumber = $total")
}

//2//
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    // Memanggil fungsi add() dan mengirimkan dua angka sebagai argumen
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}
fun add(a: Int, b: Int): Int {
    return a + b
}

//3//
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    // menganti fungsi add menjadi subtract 
    val result = subtract(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}
//fun add(a: Int, b: Int): Int {
  //  return a + b
//}

fun subtract(a: Int, b: Int): Int {
    return a - b
}