package com.mtraina

import scala.collection.JavaConverters._

object App {

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))

    println(new Book("dictionary", List(Chapter("Chapter 2")).asJava))
  }
}
