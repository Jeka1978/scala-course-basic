package com.demo.implicits.adapter_pattern

/**
 * @author Evgeny Borisov
 */
object Adapters {

  implicit class CostableToPricableAdapter(costable: Costable) extends Pricable {
    override def price(): Int = costable.cost()
  }
}
