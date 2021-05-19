package com.demo.quoters

import org.springframework.stereotype.Component

/**
 * @author Evgeny Borisov
 */
@Component
class Validator4 extends Validator {
  override def validate(): Unit = println("validataing 44444")
}
