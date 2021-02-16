/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val listNumber = 1..100

    listNumber.forEach {
        // TODO 1
        if (it % 2 == 0) return@forEach

        // TODO 2
        if (it > 15) return

        // TODO 3
        val result = it * (it + 10)
        println("range result is $result")
    }
}