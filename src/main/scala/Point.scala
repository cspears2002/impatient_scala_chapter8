package points:

    class Point(val x: Double, val y: Double)

    class LabeledPoint(x: Double, y: Double, val label: String) extends Point(x, y)