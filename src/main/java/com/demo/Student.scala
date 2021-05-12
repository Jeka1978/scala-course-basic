package com.demo

/**
 * @author Evgeny Borisov
 */
case class Student(var name:String="default name",age:Int=18){
  override def toString: String = s"student class: ${name}"
}
