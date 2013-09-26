package week3

object rationals {
  val x = new Rational(1,3)                       //> x  : week3.Rational = 1/3
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  
  val y = new Rational(5,7)                       //> y  : week3.Rational = 5/7
  x.add(y)                                        //> res2: week3.Rational = 22/21
  x.neg                                           //> res3: week3.Rational = 1/-3
  
  y.sub(x)                                        //> res4: week3.Rational = 8/21
  
  val z = new Rational(3,2)                       //> z  : week3.Rational = 3/2
  x.sub(y).sub(z)                                 //> res5: week3.Rational = -79/42
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be non-zero")
	
	def this(x:Int) = this(x,1)
	
	private def gcd(a: Int, b: Int): Int = if(b==0) a else gcd(b, a%b)
	def numer = x
	def denom = y
	
	def add(that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
	
	// Rational -> Rational
	// subtract two rational numbers
	def sub(that: Rational) = add(that.neg)
			
	override def toString = {
		val g = gcd(numer, denom)
		numer/g + "/" + denom/g
	}
	
	// x.neg -> -x
	def neg = new Rational(numer * -1, denom)
	
	 
}