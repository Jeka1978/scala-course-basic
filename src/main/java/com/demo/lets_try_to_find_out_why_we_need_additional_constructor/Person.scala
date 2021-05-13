package com.demo.lets_try_to_find_out_why_we_need_additional_constructor

/**
 * @author Evgeny Borisov
 */
class Person(var name: String = "", age: Int = -1, salary: Int = 1000) {

  if(age<0){
    name="Targrarien"
  }


}
