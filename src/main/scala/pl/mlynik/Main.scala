package pl.mlynik

import scala.util.{Failure, Success, Try}


object Main extends App {
  Try(args(0).toInt) match {
    case Success(number) => println(SuperDigit(number))
    case Failure(e: ArrayIndexOutOfBoundsException) => println("Please provide the number to superdigitize")
    case Failure(_) => println(s"${args(0)} is not an Integer")
  }
}
