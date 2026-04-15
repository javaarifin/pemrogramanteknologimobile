//1//
fun main() {
    // Deklarasi variabel jarak untuk setiap bagian perjalanan
    // Menggunakan 'val' karena nilai jarak tiap bagian ini bersifat statis (tidak berubah)
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72

    // Memperbaiki variabel totalTripLength
    // Menghapus inisialisasi 0.0 dan menggantinya dengan penjumlahan trip1 + trip2 + trip3
    val totalTripLength: Double = trip1 + trip2 + trip3//penjumlahan

    // Mencetak hasil akhir menggunakan String Template ($)
    println("$totalTripLength miles left to destination")
}

//2//
fun main() {
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    
    // Menggabungkan variabel String dan teks manual
    val reminder = nextMeeting + date + " at work"
    println(reminder)

    // Contoh penggunaan Escape Sequence untuk mencetak tanda kutip
    println("Say \"hello\"")
}

//3//
fun main() {
    // Mendeklarasikan status notifikasi
    val notificationsEnabled = false
    
    // Menampilkan status boolean yang digabung dengan teks
    println("Are notifications enabled? " + notificationsEnabled)
}

