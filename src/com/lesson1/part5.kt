package com.lesson1

/**
 * 字符串模版
 */
fun part5(){
    println("\$标示一个变量或者变量值")
    println("\$varName标示变量值")
    println("\${varName.fun()}标示变量的方法返回值")
}
var a=1
// 模版中的简单名称
val s1="a is $a"
// 模版中的任意表达式

val s2 = "${s1.replace("is","was")},but now is ${a+2}"