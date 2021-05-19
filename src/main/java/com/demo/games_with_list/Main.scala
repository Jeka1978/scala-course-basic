package com.demo.games_with_list

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val list:List[Double] = Nil

    val newList = list.filter(number => number < 3)
    println(newList)


    val sum: Double = list.reduce(_+_)

    println(sum)
  }
}
