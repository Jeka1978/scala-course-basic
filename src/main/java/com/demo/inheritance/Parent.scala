package com.demo.inheritance

/**
 * @author Evgeny Borisov
 */
class Parent(val name: String) {

  println(s"constructing parent part ${name}")

  def printMyPrettyName():Unit = println(name)
}
