package circle:
    import scala.language.strictEquality

    class Circle(val radius: Double, val x: Double, val y: Double):
        def centerPoint = (x, y)
        final override def equals(other: Any) =
            other match
                case a: Circle => radius == a.radius && centerPoint == a.centerPoint
        override def hashCode(): Int = radius.hashCode() + x.hashCode() + y.hashCode()
            