package com.demo.traits.multiple_inheritance

/**
 * @author Evgeny Borisov
 */
trait Language {
  val name:String

  override def toString: String = name
}
