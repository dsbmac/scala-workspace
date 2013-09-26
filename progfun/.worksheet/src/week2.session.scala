package week2

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(197); 
	def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, acc+f(a))
    }
    loop(a, 0)
  };System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(112); 
  
  def product(f: Int => Int) (a: Int, b: Int): Int = {
  	if (a > b) 1
  	else f(a) * product(f)(a+1, b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(26); val res$0 = 
  
  product(x => x)(2,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(65); 
  
  def factorial(a: Int): Int = {
  	product(x => x)(1, a)
  };System.out.println("""factorial: (a: Int)Int""");$skip(18); val res$1 = 
  
  factorial(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(76); 
  
  def fn(f: Int, Int => Int)(a: Int, b: Int): Int = {
  	f(a,b)
  	0
  };System.out.println("""fn: (f: Int, Int: <error>)Unit""")}
}
