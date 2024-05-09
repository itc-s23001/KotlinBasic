package org.example

import kotlin.random.Random
import kotlin.random.nextUInt

fun main(args: Array<String>) {
    println("１：グー　２：チョキ　３：パー　を選んでください:")
    //入力は１，２，３ですが、０，１，２となるよう工夫してください
    val player = readln().toInt() -1

    val cpu = Random.nextInt(0,3) //0,1,2のどれかになる


    //勝敗判定
  val diff = (player - cpu + 3) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "負け"
        2 -> "勝ち"
        else -> "?"
    }
    //勝敗の結果
    println("CPU: ${cpu + 1} --- $judge")
    //勝ち
    //負け
    //あいこ
}