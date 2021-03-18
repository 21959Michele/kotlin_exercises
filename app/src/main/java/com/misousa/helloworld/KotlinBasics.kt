package com.misousa.helloworld

import kotlin.jvm.internal.Ref

fun main () {
//
//    var x = 100
//
//    while (x >= 0){
//        println("$x")
//        x -= 2
//    }
//    println("\nwhile loop is done")


//

//    var feltTemp = "cold"
//    var roomTemp = 10
//    while (feltTemp == "cold"){
//        roomTemp++
//        if(roomTemp >=20){
//            feltTemp = "comfy"
//            println("It's comfy now")
//        }
//    }

//    for(i in 1 until 10){
//        print("$i")
//    }
//

//    for (i in 1 until 1000) {
//        if (i == 901) {
//            print("IT'S OVER 9000!!!")
//        }
//    }

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }
}


