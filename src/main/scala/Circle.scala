package circle:
    import scala.language.strictEquality

    class Circle(val radius: Double, val x: Double, val y: Double):
        def centerPoint = (x, y)
        final override def equals(other: Any) =
            other match
                case that: Circle => radius == that.radius && centerPoint == that.centerPoint
            