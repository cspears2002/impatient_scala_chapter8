package valuepoint:

    import scala.compiletime.ops.long

    // We are assuming an upper bound of 100 for the first coordinate.

    class ValPoint(val coords: (Int, Int)) extends AnyVal:
        private def n = coords(0) * 100 + coords(1)

    object ValPoint:
        def apply(coords: (Int, Int)): ValPoint =
            if coords(0) < 100 then ValPoint(coords)
            else throw IllegalArgumentException()