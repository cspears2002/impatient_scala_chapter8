import accounts.*
import cars.*
import items.*

@main def hello(): Unit =
  val item1 = SimpleItem(0.99, "Item 1")
  val item2 = SimpleItem(0.99, "Item 2")
  val item3 = SimpleItem(0.99, "Item 3")
  val myBundle = Bundle("a bunch of items")
  myBundle.itemsArrayBuff ++= List(item1, item2, item3)
  print(s"Bundle price: ${myBundle.price}")


def msg = "I was compiled by Scala 3. :)"
