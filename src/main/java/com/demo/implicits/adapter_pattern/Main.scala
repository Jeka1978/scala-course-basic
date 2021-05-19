package com.demo.implicits.adapter_pattern

import java.util

import Adapters._

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val calculator = new Calculator


    val list:util.List[Pricable] = new util.ArrayList[Pricable]()

    val factory = new ProductFactory

    list.add(factory.createProduct())
    list.add(factory.createProduct())
    list.add(factory.createProduct())
    list.add(factory.createProduct())



    println(calculator.total(list))
  }
}
