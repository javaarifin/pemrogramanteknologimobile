//1//
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}
fun displayAlertMessage(operatingSystem: String, emailId: String): String { // Buat fungsi displayAlertMessage() yang menerima parameter operatingSystem dan parameter emailId, keduanya dari jenis String, dan menampilkan nilai String.
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}
// Define your displayAlertMessage() below this line.

//2//
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}
fun displayAlertMessage(
    operatingSystem: String = "Unknown OS",
    emailId: String
): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}
// Define your displayAlertMessage() below this line.