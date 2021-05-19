package com.demo.quoters

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
 * @author Evgeny Borisov
 */
object Start {
  def main(args: Array[String]): Unit = {
    val context = new AnnotationConfigApplicationContext("com.demo")

    context.getBean(classOf[ValidatorAggregator]).printAll()
    println()
  }
}
