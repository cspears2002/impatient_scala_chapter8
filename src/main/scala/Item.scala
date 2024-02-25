package item:

    abstract class Item:
        def price: Double
        def description: String

    class SimpleItem(myPrice: Double, myDesc: String) extends Item:
        def price: Double = myPrice
        def description: String = myDesc