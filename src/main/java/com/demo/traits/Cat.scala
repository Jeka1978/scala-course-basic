package com.demo.traits

/**
 * @author Evgeny Borisov
 */
class Cat(var age:Int) extends Animal {
//  override def age: Int =10

  override def makeVoice(): Unit = println("may may")

  override def myInitדניאל(): Unit = println("I'm a crazy cat!!!")

  override def numberOfLegs(): Int = 4
}
