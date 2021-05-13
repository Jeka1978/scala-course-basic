package com.demo.traits

/**
 * @author Evgeny Borisov
 */
trait Animal {

  myInitדניאל()
  registerInZoo()


  final def registerInZoo(): Unit = Zoo.addAnimal(this)

  def numberOfLegs(): Int

  var age: Int


  def makeVoice(): Unit


  def printX(): Unit = println("X")


  def printMyAge(): Unit = {
    println(this.age)
  }

  def myInitדניאל(): Unit = {
    println(s"${getClass.getSimpleName} was born. Age is: $age")
  }

}


