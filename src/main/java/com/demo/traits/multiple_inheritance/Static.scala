package com.demo.traits.multiple_inheritance

/**
 * @author Evgeny Borisov
 */
trait Static {
  override def toString: String = " is static " + super.toString
}
