package com.demo.quoters




import scala.jdk.CollectionConverters._
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.List
/**
 * @author Evgeny Borisov
 */
@Component
class ValidatorAggregator {

  @Autowired
  var validators:List[Validator]=null


  def printAll():Unit={
    val scalaList = validators.asScala
    scalaList.foreach(_.validate())
  }
}
