package com.demo.pattern_matching

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {


    val someInt: Some[Int] = Some(12)

    val login = NewLogin("Regina", "abc123", "abc123")
    val maybeTuple: Option[(String, String, String)] = NewLogin.unapply(login)
    LoginValidator.validate(login)
  }
}
