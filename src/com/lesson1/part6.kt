package com.lesson1

/**
 * NULL检查机制
 */
fun part6 (){
    println("kotlin的空安全设计对于声明任何可为空的参数，在使用时要进行空判断处理：")
    println("1.字段后加!!像Java一样抛出空异常")
    println("2.字段后加?可不作处理返回null或配合?:做空判断处理")
    println("类型检测及自动类型转换：可以用is运算符检测一个表达式是否是某一类型的实例。")
    println("3 is Int:${3 is Int}")
    println("区间：..${rangeTo()}")
}

//类型后面加?标示可为空
private var age:String?="23"

//抛出空指针异常
private val ages=age!!.toInt()

//不做处理返回null
private val ages1=age?.toInt()

//age为空返回-1

private val ages2 =age?.toInt()?:-1

//当一个引用类型可能为空的时候一定要标记可为null

fun parseInt(str:String):Int?{

    return null;
}

//类型检测及自动类型转换
private val isInt:Boolean=3 is Int

//区间
fun rangeTo():Unit{

    //循环输出
    for (i in 1..5) print(i)

    //设置步长
    for (i in 1..5 step 2) print(i)

    //使用downTo
    for(i in 5 downTo 1 step 2) print(i)

    //使用until排除结束元素
    for(i in 1 until 4 step 2) print(i)
}
//rangeTo()