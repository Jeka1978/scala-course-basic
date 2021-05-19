package com.demo.implicits.methods

import com.demo.traits.Dog

/**
 * @author Evgeny Borisov
 */
object ImplicitMethods {

  implicit def convertStringToPerson(string: String): Person = {
    Person(string)
  }

  implicit def convertStringToDog(int: Int): Dog = {
    Dog(int)
  }
}
