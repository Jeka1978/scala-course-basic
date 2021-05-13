package com.demo.traits

/**
 * @author Evgeny Borisov
 */
class Camel extends Animal with Serializable with Comparable[Camel]{
  override def numberOfLegs(): Int = 4

  override var age: Int = 10

  override def makeVoice(): Unit = println("Camel is quite")

  override def compareTo(o: Camel): Int = 0
}
