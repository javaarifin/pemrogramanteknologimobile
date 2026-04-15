//1//
fun main() {
    // Inisialisasi awal: membuat variabel yang bisa diubah (var)
    var cartTotal = 0
    println("Total: $cartTotal") // Output: 0

    // Memperbarui nilai variabel tanpa menulis kata kunci 'var' lagi
    cartTotal = 20
    
    // Mencetak nilai terbaru setelah diperbarui
    println("Total: $cartTotal") // Output: 20
}

//2//
fun main() {
    // Menggunakan var karena jumlah pesan akan terus berubah
    var count = 10
    println("You have $count unread messages.")

    // Menggunakan operator penambahan untuk meningkatkan nilai sebanyak 1
    count++ 
    println("You have $count unread messages.") // Output: 11

    // Menggunakan operator pengurangan untuk mengurangi nilai sebanyak 1
    count--
    println("You have $count unread messages.") // Output: 10 kembali
}

