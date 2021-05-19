package com.demo.reflections

import java.util

import com.demo.traits.Animal
import org.reflections.Reflections
import scala.jdk.CollectionConverters._

/**
 * @author Evgeny Borisov
 */
class AnimalFactory {
//  private var animalTypes:Set[Class[Animal]]=Nil

  private val scanner = new Reflections("com.demo")

  def initCache(): Unit = {
    val value  = scanner.getSubTypesOf(classOf[Animal]).asScala

    println()
  }

}
