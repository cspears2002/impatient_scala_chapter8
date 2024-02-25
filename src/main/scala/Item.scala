import scala.collection.mutable.ArrayBuffer

package item:

    abstract class Item:
        def price: Double
        def description: String

    class SimpleItem(myPrice: Double, myDesc: String) extends Item:
        def price: Double = myPrice
        def description: String = myDesc

    class Bundle(bundleDesc: String) extends Item:
        var itemsArrayBuff = ArrayBuffer[Item]()
        var price: Double =
            var sum = 0.0
            for (item <- itemsArrayBuff) {
                sum = sum + item.price
            }
            price

        def description: String = bundleDesc
