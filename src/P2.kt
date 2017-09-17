/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to find the sum of first 10 natural numbers.

fun main(args: Array<String>) {
  var sum = 0
  for (number in 1..10) {
    sum = sum + number
  }
  println("Sum of first 10 natural numbers is equal to $sum.")
}