package com.foolish.scala.helloworld

/**
 * version 1.0                        
 * Created by yuejia.wu on 2016/1/28.
 */
object HelloWorldObject {
  //single object
  //  println("hello,world");
  def main(args: Array[String]) {
    println("hello,world")
    mathFunction(2016)

    //the last value will be return value
    println(mathFunction(2016))

    //省去括号
    arrayFunction

  }

  // use def to declare a function
  def mathFunction(count: Int): Int = {
    println("hello,world " + count.toString)
    count * count;
  }

  def arrayFunction(): Unit = {
    var nums: Array[Int] = new Array[Int](10)
    //or
    val nums2 = new Array[Int](10)
    nums2(0) = 0
    nums2(1) = 1
    nums2(2) = 2
    //There is one more way of defining an array
    //var nums3 = Array("0", "1", "2");
    for (num <- nums2) {
      println(num)
    }
  }
}
