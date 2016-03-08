package org.kostasp.java.scala.spring.boot

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def echo(x:String) : String = {
    return x
  }


}
