package com.demo.quoters

import org.springframework.stereotype.Component

/**
 * @author Evgeny Borisov
 */
@Component
class Validator1 extends Validator {
  override def validate(): Unit = println("validataing 1111111")
}
