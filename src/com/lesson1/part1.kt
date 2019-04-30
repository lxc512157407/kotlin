package com.lesson1

/**
 * 包声明
 */

fun part1(){
    println("1、包声明：")
    println("   代码文件的开头一般包括包的声明：")
    println("      a、kotlin源文件不需要相匹配的目录和包")
    println("      b、如果没有指定包，默认为default")
    println("      c、有多个包会默认导入到每个kotlin文件中：")
    println("           kotlin.*")
    println("           kotlin.annotation.*")
    println("           kotlin.collections.*")
    println("           kotlin.comparisons.*")
    println("           kotlin.io.*")
    println("           kotlin.ranges.*")
    println("           kotlin.sequences.*")
    println("           kotlin.text.*")
}