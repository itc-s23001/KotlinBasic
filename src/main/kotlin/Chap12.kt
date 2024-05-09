package org.example

fun main(args: Array<String>) {
    val x = "Hello"
    when (x) {
        "Good Morning" -> println("おはようございます")
        "Hello" -> println("こんにちは")
        "Good Evening" -> println("こんにちは")
        else -> println("どうも!")
    }
    println("----12.2----")
    val x2 = 2
    when (x2) {
      //  1 -> println("ワン")
      //  2 -> println("ツー")
        1, 2 -> {
            println("ワン、ツーのどちらかです")
            println("こんにちは")
        }
        3 -> {
            println("スリー")
            println("ありがとう！")
        }
        else -> {
            println("ワン、ツー、スリー以外の数字です")
            println("さようなら")
        }
    }
    println("----12.5----")
    val x5 = 2
     when {
         (x5 == 1 || x5 == 2)
                 -> println("ワンかツーのどちらか")

         (x5 == 3)
                 -> println("スリー")

         else
             -> println("1,2,3以外の数字")
    }
}