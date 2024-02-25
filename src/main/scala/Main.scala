import accounts.*
import cars.*

@main def hello(): Unit =
  val bankAccount = SavingsAccount(100)
  println(s"Balance is ${bankAccount.currentBalance}")

  bankAccount.earnMonthlyInterest()
  println(s"Balance is ${bankAccount.currentBalance}")

  val myCar = Car("Toyota", "Prius", 2016, "MYCAR")
  println(s"${myCar.description}")

  val myCar1 = Car("Toyota", "Prius")
  println(s"${myCar1.description}")
  myCar1.year = 2016
  myCar1.license = "MYCAR"
  println(s"${myCar1.description}")


def msg = "I was compiled by Scala 3. :)"
