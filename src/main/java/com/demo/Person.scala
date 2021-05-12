package com.demo

/**
 * @author Evgeny Borisov
 */
class Person(var name: String = "Jeka") {

  def apply(x: Int): Unit = println(x)

  def apply(x: Int, y: Int): Unit = println(x + y)


  def printName(name: String = this.name): Unit = println(name)

  println(name)

}

object Person {

  def apply(name: String) = new Person(name.toUpperCase)


}
