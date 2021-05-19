package com.demo.implicits.methods

/**
 * @author Evgeny Borisov
 */
case class Person(name:String){
  def printMe():Unit=println(name)
}
