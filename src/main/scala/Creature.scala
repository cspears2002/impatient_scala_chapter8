package creature:

    class Creature:
        val range: Int = 10
        val env: Array[Int] = Array.ofDim[Int](range)

    class Ant extends Creature:
        override val range = 2