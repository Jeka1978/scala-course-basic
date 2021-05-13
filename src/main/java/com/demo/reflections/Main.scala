package com.demo.reflections

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val factory = new AnimalFactory
    factory.initCache()
  }
}
