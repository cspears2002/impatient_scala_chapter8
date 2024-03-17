import accounts.*
import cars.*
import circle.*
import creature.*
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

  val circle1 = Circle(2.0, 0, 0)
  print(s"Circle center: ${circle1.centerPoint}\n")
  print(s"Circle radius is: ${circle1.radius}\n")
  val circle2 = Circle(2.0, 0, 0)
  print(s"Is circle1 equal to circle2? ${circle1 == circle2}\n")
  
  val rectangle = Rectangle()
  val rectCenter = rectangle.centerPoint(Point(-2, 4), Point(6, 16))
  print(s"Rectangle center: (${rectCenter.x}, ${rectCenter.y})\n")

  val square1 = Square(1, 1, 2)
  print(s"x: ${square1.x} y: ${square1.y} width: ${square1.width} height: ${square1.height}\n")
  val square2 = Square(3)
  print(s"x: ${square2.x} y: ${square2.y} width: ${square2.width} height: ${square2.height}\n")
  val square3 = Square()
  print(s"x: ${square3.x} y: ${square3.y} width: ${square3.width} height: ${square3.height}\n")

  val ant = Ant()
  print(s"This is an ant's range: ${ant.range}\n")
  print(s"Length of env: ${ant.env.length}\n")

def msg = "I was compiled by Scala 3. :)"
