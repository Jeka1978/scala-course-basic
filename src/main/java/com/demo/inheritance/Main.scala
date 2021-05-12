package com.demo.inheritance

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val son = new Son(name = "David", 40)

    println(son.name)

  }
}
