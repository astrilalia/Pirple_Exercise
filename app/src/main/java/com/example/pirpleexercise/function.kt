package com.example.pirpleexercise

fun main() {

    var artist = artist("Sooyoung")
    checkArtist(artist)


    artist = artist("Yuujin")
    checkArtist(artist)

}

fun artist(name: String): String {
    return when(name) {
        "Sooyoung" -> "SNSD"
        "Yuujin" -> "Iz-One"
        else -> "Twice"
    }
}

fun song(artistName: String): String {
    return if (artistName == "Iz-One") "La Vie en Rose"
    else "The Boys"
}

fun totalMember(artistName: String): Int {
    return if (artistName == "Iz-One") 12
    else 9
}

fun checkArtist(name: String) {
    if (name.isNotEmpty()) {
        println(name)
        println(song(name))
        println(totalMember(name))
    }
}
