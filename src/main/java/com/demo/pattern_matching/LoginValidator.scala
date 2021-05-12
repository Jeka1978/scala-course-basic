package com.demo.pattern_matching

/**
 * @author Evgeny Borisov
 */
object LoginValidator {


  def validate(login: NewLogin): Unit = {
    val answer = login match {
      case NewLogin("admin", _, _) => "admin can't be name of user"
      case NewLogin(_, pass, _) if (pass.startsWith("z")) => s" password is: $pass can't start with Z"
      case NewLogin(userName, pass, _) if (userName == pass) => "username = pass, not good"
      case NewLogin(_, pass, _) if (pass.forall(_.isDigit)) => s"your password is: $pass contains only digits"
      case NewLogin(_, pass, confirm) if (pass!=confirm) => "pass and confirmation are not the same"
      case _ =>"ok"
    }

    println(answer)
  }
}
