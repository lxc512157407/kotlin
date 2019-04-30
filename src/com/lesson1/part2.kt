package com.lesson1

/**
 * 函数定义
 */
fun part2(){
    println("2.函数定义：")
    println("   a.函数定义使用关键子fun，参数格式为：参数:类型")
}
//表达式作为函数题返回类型自动推断
fun sum(a:Int,b:Int)=a+b

//public 方法则必须返回类型
fun sumType(a:Int,b: Int):Int = a + b

//无返回值的函数(类似Java中的void)

fun printSum(a:Int,b:Int):Unit{
    println("无返回值的a+b=${a+b}")
}

//如果返回Unit类型，则可以省略（对于public也一样,）
fun printSumType(a:Int,b:Int){
    println("如果返回类型Unit,则可以省略（public方法也是这样）a+b=${a+b}")
}

//可变长参数函数可以用varargg关键字进行标示
fun vars(vararg v:Int){
    for(vt in v){
        println(vt)
    }
}

//lambda表达实例
var sumLambda:(Int,Int)->Int={x,y->x+y}