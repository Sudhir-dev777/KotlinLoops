/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to display n terms of natural number and their sum.

fun main(args: Array<String>) {
  print("Enter a natural number: ")
  val TERM = readLine()!!.toInt()
  var sum = 0
  for (number in 1..TERM) {
    print("$number ")
    sum = sum + number
  }
  println("\nSum of $TERM is equal to $sum")
}