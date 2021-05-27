package com.example.pirpleexercise

/*
1. List is a bunch of items that you can't add or remove, and also you can't change any item in any index.
It's such a fixed items. All you can do is calling the item by telling which index they are. (For example, look at line 22)

2. Array have the same concept with List (look at line 26),
but the different is you can change some items by their index. (For example, look at line 29)
However, for non-mutable array or list, both items can't be added or removed.

3. The mutable list or array has definition as same as above explanation. But, if non-mutable can't add or remove item, mutable can.

So, they both can keep many items, but also they both can't be add or remove if they are non-mutable collection and they can if they are mutable collection.
For the different is one can't be change or Set the items, which is List, and one can, which is Array.
That's all the difference between them.
 */


fun main() {

//    List Example
    val monthsList = listOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    println(monthsList)

//    Array Example
    val bucketList = arrayOf("Lose weight", "go to Japan", "eat indian food", "save money until 1 billion")
    println(bucketList)

    bucketList[0] = "Lose weight until 55 kg"
    println(bucketList)

//    Conclusion: Besides the capability array can change their items, another differences between List and Array shows at their println results.
}
