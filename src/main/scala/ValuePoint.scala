package valuepoint:

    import scala.compiletime.ops.long

    // We are assuming an upper bound of 100 for the first coordinate.
    
    class Point(val coords: (Int, Int)) extends AnyVal:
        def n = coords(0) * 100 + coords(1)

    object Point:
        def apply(coords: (Int, Int)): Point =
            if coords(0) < 100 then Point(coords)
            else throw IllegalArgumentException()