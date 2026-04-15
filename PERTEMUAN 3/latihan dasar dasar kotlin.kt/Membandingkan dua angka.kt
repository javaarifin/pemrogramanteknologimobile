fun main() {
    // Test Case 1: Hari ini lebih lama (300 > 250) -> Hasil: true
    println("Apakah hari ini lebih lama dari kemarin? " + compareTime(300, 250))
    
    // Test Case 2: Waktu sama (300 > 300) -> Hasil: false
    println("Apakah hari ini lebih lama dari kemarin? " + compareTime(300, 300))
    
    // Test Case 3: Hari ini lebih sebentar (200 > 220) -> Hasil: false
    println("Apakah hari ini lebih lama dari kemarin? " + compareTime(200, 220))
}


fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    // Operator '>' secara otomatis menghasilkan nilai Boolean (true/false)
    val isMoreThanYesterday = timeSpentToday > timeSpentYesterday
    
    return isMoreThanYesterday
}