package com.demo.traits

/**
 * @author Evgeny Borisov
 */
object Main  {

  def main(args: Array[String]): Unit = {

    new Cat(12)
    new Cat(13)
    new Camel
    new Dog(12)

    Zoo.makeNoise()

    //    val cat = new Cat

  }
}
