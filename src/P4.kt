/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to read 10 numbers from keyboard and find their sum and average.

fun main(args: Array<String>) {
  var number = 0
  var sum = 0
  for (index in 1..10) {
    print("Enter number $index : ")
    number = readLine()!!.toInt()
    sum += number
  }
  println("Sum of 10 number is $sum and the average is ${sum/10}")
}