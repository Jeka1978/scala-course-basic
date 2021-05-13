package com.demo.reflections

import java.util

import org.reflections.Reflections

/**
 * @author Evgeny Borisov
 */
class AnimalFactory {
//  private var animalTypes:Set[Class[Animal]]=Nil

  private val scanner = new Reflections("com.demo")

  def initCache(): Unit = {
//    val value  = scanner.getSubTypesOf(classOf[Animal])

    println()
  }

}
