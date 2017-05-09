 // square root function 
object wrk {
    1+2
    def abs(x: Double) = if (x < 0) -x else x
    def sqrt(x: Double) = {
        def sqrtIter(guess: Double): Double =
        if (isGoodEnough(guess)) guess
        else sqrtIter(improve(guess))

        def isGoodEnough(guess: Double) =
        abs(guess * guess - x) / x < 0.01

        def improve(guess: Double) =
        (guess + x / guess) / 2

        sqrtIter(1.0)
    }
sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e60)
sqrt(0.001)
sqrt(1e-20)
}

// same square root function , but more detailed code:
/*
    object wrk {
    1+2
    def abs(x: Double) = if (x < 0) -x else x
    def sqrt(x: Double) = {
            def sqrtIter(guess: Double, x: Double): Double =
            if (isGoodEnough(guess, x)) guess
            else sqrtIter(improve(guess, x), x)

            def isGoodEnough(guess: Double, x: Double) =
            abs(guess * guess - x) / x < 0.01

            def improve(guess: Double, x: Double) =
            (guess + x / guess) / 2

            sqrtIter(1.0, x)
        }
    sqrt(2)
    sqrt(4)
    sqrt(1e-6)
    sqrt(1e60)
    sqrt(0.001)
    sqrt(1e-20)
    }
*/