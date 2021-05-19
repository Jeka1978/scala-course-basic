package com.demo.quoters

import org.springframework.stereotype.Component

/**
 * @author Evgeny Borisov
 */
@Component
class Validator2 extends Validator {
  override def validate(): Unit = println("validataing 22222")
}
