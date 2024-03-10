package shape:
    import points.*

    abstract class Shape:
        def centerPoint(point1: Point, point2: Point): Point

    class Rectangle extends Shape:
        override def centerPoint(point1: Point, point2: Point): Point = 
            val x1 = point1.x
            val y1 = point1.y
            val x2 = point2.x
            val y2 = point2.y
            val xCenter = (x1 + x2) / 2
            val yCenter = (y1 + y2) / 2
            Point(xCenter, yCenter)

    class Circle extends Shape:
        override def centerPoint(point1: Point, point2: Point): Point =
            val x1 = point1.x
            val y1 = point1.y
            val x2 = point2.x
            val y2 = point2.y
            val xCenter = (x1 + x2) / 2
            val yCenter = (y1 + y2) / 2
            Point(xCenter, yCenter)

    class Square(x: Int, y: Int, width: Int) extends java.awt.Rectangle(x, y, width: Int, width: Int):
        def this(width: Int) =
            this(0, 0, width)

        def this()=
            this(0, 0, 0)
