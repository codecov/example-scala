package com.awesomeness

class Awesomeness {
  def main(args: Array[String]) {
    println("Hello, world! " + args.toList)
  }
  def square(x:Int): Int= {
    x*x
  }
  def multiple(x:Int,y:Int): Int= {
    x*y
  }
}


object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world! " + args.toList)
  }
}
