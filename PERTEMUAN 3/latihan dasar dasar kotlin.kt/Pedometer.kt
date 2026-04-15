fun main() {
    // Penamaan variabel menggunakan camelCase (huruf pertama kecil, kata selanjutnya besar)
    val steps = 4000
    
    // Memanggil fungsi pedometerStepsToCalories dengan mengirimkan argumen 'steps'
    val caloriesBurned = pedometerStepsToCalories(steps)
    
    // Mencetak hasil menggunakan String Template ($)
    println("Walking $steps steps burns $caloriesBurned calories") 
}


fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    // Definisi konstanta kalori per langkah menggunakan aturan camelCase
    val caloriesBurnedForEachStep = 0.04
    
    // Perhitungan total: Langkah kaki (Int) dikalikan nilai desimal (Double) menghasilkan Double
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    
    // Mengembalikan hasil perhitungan ke fungsi pemanggil
    return totalCaloriesBurned
}