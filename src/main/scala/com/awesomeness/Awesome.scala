package com.awesomeness

object Awesome {
  def main(args: Array[String]): Unit = {
    println("Hello, world! " + args.toList)
  }

  def square(x: Int): Int = {
    x * x
  }

  def multiple(x: Int, y: Int): Int = {
    x * y
  }
}
