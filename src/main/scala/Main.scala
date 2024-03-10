import accounts.*
import cars.*
import items.*
import points.*
import shape.*

@main def hello(): Unit =
  val item1 = SimpleItem(0.99, "Item 1")
  val item2 = SimpleItem(0.99, "Item 2")
  val item3 = SimpleItem(0.99, "Item 3")
  val myBundle = Bundle("a bunch of items")
  myBundle.itemsArrayBuff ++= List(item1, item2, item3)
  print(s"Bundle price: ${myBundle.price}\n")

  val origin = LabeledPoint(0.0, 0.0, "origin")
  print(s"Origin X: ${origin.x} Origin Y: ${origin.y} Label: ${origin.label}\n")

  val circle = Circle()
  val circleCenter = circle.centerPoint(Point(-2, 4), Point(6, 16))
  print(s"Circle center: (${circleCenter.x}, ${circleCenter.y})\n")
  val rectangle = Rectangle()
  val rectCenter = rectangle.centerPoint(Point(-2, 4), Point(6, 16))
  print(s"Rectangle center: (${rectCenter.x}, ${rectCenter.y})\n")


def msg = "I was compiled by Scala 3. :)"
