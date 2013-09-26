package week2

object session {
	def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, acc+f(a))
    }
    loop(a, 0)
  }
  
  def product(f: Int => Int) (a: Int, b: Int): Int = {
  	if (a > b) 1
  	else f(a) * product(f)(a+1, b)
  }
  
  product(x => x)(2,5)
  
  def factorial(a: Int): Int = {
  	product(x => x)(1, a)
  }
  
  factorial(4)
  
  def fn(f: Int, Int => Int)(a: Int, b: Int): Int = {
  	f(a,b)
  	0
  }
}