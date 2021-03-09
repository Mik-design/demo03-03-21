//fun main () {
//    val score = 60
////    if (score ==50){
////        println("score is 50")
////    }
//    when (score) {
//         in 90..100 -> println ("5")
//         in 70..89 -> println ("4")
//         in 50..69 -> println ("3")
//         in 30..49 -> println ("2")
//         in 0..29 -> println ("1")
//         else -> {
//            println ("score is invalid")
//        }
//    }
//
//    when{
//        3 < 2 -> println ("3 > 2")
//        "string".length == 6 ->println("length is 6")
//        2 > 3 -> println ("2 > 3")
//        else ->{
//            println ("else called")
//        }
//    }
//
//
//    val a = 5
//    val b = 3
//    val maxValue = when (a > b) {
//       true -> a
//       false -> b
//    }
//
//        println ("maxValue: $maxValue")
//    }
//
//fun main () {
//    val month = 5
//    println(" 5 ")
//    val days = 31
//
//
//    when {
//        month == 5 && days >= 31 -> println(" Месяц 5 - 31 дней")
//        month < 5 && days <= 28 -> println(" Месяц 2 - 28 дней")
//        else -> {
//            println("Месяцы с 30 днями")
//        }
//    }
//}

fun main() {

    val x = 5.0
    val y = -3.0
    val r = 1.0
    val h = Math.sqrt (x*x + y*y)

    when {
        h > r -> println ("Не принадлежит")
        else -> {
            println ("Принадлежит")
        }
    }
    }