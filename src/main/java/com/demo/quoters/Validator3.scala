package com.demo.quoters

import org.springframework.stereotype.Component

/**
 * @author Evgeny Borisov
 */
@Component
class Validator3 extends Validator {
  override def validate(): Unit = println("validataing 33333")
}
