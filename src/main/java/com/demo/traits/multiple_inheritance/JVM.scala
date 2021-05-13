package com.demo.traits.multiple_inheritance

/**
 * @author Evgeny Borisov
 */
trait JVM {
  override def toString: String = super.toString+ " runs on JVM "
}
