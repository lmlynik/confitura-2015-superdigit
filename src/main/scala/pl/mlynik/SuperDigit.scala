package pl.mlynik

import scala.annotation.tailrec

object SuperDigit {
  val ASCII_DIGIT_OFFSET = 48
  
  @tailrec
  def apply(number: Long): Long =
    if (number >= 10) apply(sumDigits(number)) else number

  private def sumDigits(number: Long): Long =
    number.toString.foldLeft(0L)(_ + _.toInt - ASCII_DIGIT_OFFSET)
}
