package pl.mlynik

import scala.annotation.tailrec

object SuperDigit {
  @tailrec
  def apply(number: Long): Long =
    if (number >= 10) apply(sumDigits(number)) else number

  private def sumDigits(number: Long): Long =
    number.toString.foldLeft(0L)(_ + _.toInt - 48)
}
