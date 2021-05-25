package com.example.pirpleexercise

fun main() {
//    Favorite Song
    var songTitle: String = "Whistle"
    println(songTitle)

//    artist
    var artist: String = "BlackPink"
    println(artist)

//    Debut
    var yearDebut: Int = 2016
    println(yearDebut)

//    Genre
    var genre: String = "K-pop"
    println(genre)

//    Duration
    var duration: Double = 3.50
    println(duration)

//    Solo or Group
    var isSolo: Boolean = false
    println(isSolo)

    var isGroup: Boolean = true
    println(isGroup)

//    From
    var from: String = "Korea"
    println(from)

    var statement: String = "I like $artist's song, which called by $songTitle. $artist's debut in $yearDebut. They are from $from and their genre is $genre. This song has duration around $duration minutes."
    println(statement)

//    Twice's Profile
    songTitle = "Likey"
    println(songTitle)

    artist = "Twice"
    println(artist)

    yearDebut = 2017
    println(yearDebut)

    genre = "Pop"
    println(genre)

    duration = 3.28
    println(duration)

    isSolo = true
    println(isSolo)

    isGroup = false
    println(isGroup)

    from = "Korea-Japan"
    println(from)

    statement = "I like $artist's song, which called by $songTitle. $artist's debut in $yearDebut. They are from $from and their genre is $genre. This song has duration around $duration minutes."
    println(statement)
}
