package week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(31); 
  
  val y = new Rational(5,7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(11); val res$2 = 
  x.add(y);System.out.println("""res2: week3.Rational = """ + $show(res$2));$skip(8); val res$3 = 
  x.neg;System.out.println("""res3: week3.Rational = """ + $show(res$3));$skip(14); val res$4 = 
  
  y.sub(x);System.out.println("""res4: week3.Rational = """ + $show(res$4));$skip(31); 
  
  val z = new Rational(3,2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(18); val res$5 = 
  x.sub(y).sub(z);System.out.println("""res5: week3.Rational = """ + $show(res$5))}
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
