package org.example

fun main(args: Array<String>) {
    val score = readln().toInt()
    var message = ""
    message = if(score in 0 .. 59) {
        "評価：D"
    } else if (score in 60 .. 69) {
        "評価：C"
    } else if (score in 70 .. 79) {
        "評価：B"
    } else if (score in 80 .. 89) {
        "評価：A"
    } else if (score in 90 .. 100) {
        "評価：S"
    } else {
        "error"
    }
  //  println(message)
  //  println("----パターン2")
   // val rank2 = if (score !in 0 .. 100) {
   //     "error"
    //}
}