package creature:

    class Creature:
        def range: Int = 10
        val env: Array[Int] = Array.ofDim[Int](range)

    class Ant extends Creature:
        override def range = 2