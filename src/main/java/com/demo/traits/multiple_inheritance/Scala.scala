package com.demo.traits.multiple_inheritance

/**
 * @author Evgeny Borisov
 */
class Scala extends Language with JVM with Static {
  override val name: String = "scala"

  override def toString: String = super.toString + " wtf "
}
