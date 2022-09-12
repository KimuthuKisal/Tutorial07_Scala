import scala.io.StdIn._

object RatioanalNumber {

    class Rational ( nume:Int, deno:Int ){
        def numerator = nume
        def denominator = deno

        def neg = new Rational( -this.numerator, this.denominator )
        override def toString = numerator + "/" + denominator
    }

    def main( args: Array[String] ) = {

        print("Enter the numerator : ")
        var n = readInt()
        print("Enter the denominator : ")
        var d = readInt()
        val num = new Rational( n, d )

        println("Rational Number : " + num)
        println("Negative value : " + num.neg)

    }    
}