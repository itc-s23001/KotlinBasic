package org.example

fun main(args: Array<String>) {
   val age2: Int = 10

   val range21: IntRange = 0 .. 6
   var range22: IntRange = 7 .. 12
   var range23: IntRange = 13 .. 15

   var flag21 = age2 in range21
   var flag22 = age2 in range22
   var flag23 = age2 in range23

   println("${age2}歳の子供は就学前 ${flag21}")
   println("${age2}歳の子供は小学生 ${flag22}")
   println("${age2}歳の子供は中学生 ${flag23}")

   println("----10.3----")
   val flag31 = age2 !in range21
   val flag32 = age2 !in range22
   val flag33 = age2 !in range23
   println("${age2}歳の子供は就学前ではない ${flag31}")
   println("${age2}歳の子供は小学生ではない ${flag32}")
   println("${age2}歳の子供は中学生ではない ${flag33}")

   println("----10.4----")
   var rangeA: LongRange = 0 .. 10000000000L
   var rangeB: CharRange = 'A' .. 'E'
   var rangeC: CharRange = 'あ' .. 'お'

   val flagA = 500 in rangeA
   val flagB = 'D' in rangeB
   val flagC = 'え' in rangeC

   println("flagA = $flagA")
   println("flagB = $flagB")
   println("flagC = $flagC")

   println("----10.a----")
   val rangeD: IntRange = 0 until 6
   val rangeE: IntRange = 0..<6
   println(rangeD)
   println(rangeE)
}