package com.demo.traits

import scala.util.Random

/**
 * @author Evgeny Borisov
 */


case class Dog(var age:Int) extends Animal {


  def printMe():Unit=println(123)


  //  def age: Int = Random.nextInt(15)


  override def makeVoice(): Unit = println("au au")

  var numberOfLegs: Int = Random.nextInt(10)


}
