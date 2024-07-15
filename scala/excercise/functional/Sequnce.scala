package excercise.functional

object Sequnce extends App{
    // Sequence

    val aseq = Seq(5,7,3,4,8,9,9,7)
    println("Sequence: " + aseq)
    println(aseq.reverse)
    println("Sum: " + aseq.sum)
    println("Product: " + aseq.product)
    //println("Average: " + aseq.average)
    println("Max: " + aseq.max)
    println("Min: " + aseq.min)
    println("Sorted: " + aseq.sorted)
    println("Distinct: " + aseq.distinct)
    println("Count: " + aseq.count(_ % 2 == 0))
    println("Filter: " + aseq.filter(_ % 2 == 0))
    println("Count: " + aseq.count)
    println(aseq(4))
    println(aseq.contains(9))
    println(aseq.take(3))
    println(aseq.drop(3))
    println(aseq.slice(1, 4))
    println(aseq ++ Seq(12,11,11))
}
