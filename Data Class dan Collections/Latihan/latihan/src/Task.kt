/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {

    // TODO 1
    val vehicles = mapOf(
        "type" to "Motorcycle",
        "maxSpeed" to "230Km/s",
        "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = vehicles["type"]
    val maxSpeed = vehicles["maxSpeed"]
    val maxTank = vehicles["maxTank"]

    // TODO 3
    val vehicle = """
        Vehicle
        Type: $type
        Maximal Speed: $maxSpeed
        Maximal Tank: $maxTank
    """.trimIndent()
    println(vehicle)

}