import accounts.*
import cars.*

@main def hello(): Unit =
  val bankAccount = SavingsAccount(100)
  println(s"Balance is ${bankAccount.currentBalance}")

  bankAccount.earnMonthlyInterest()
  println(s"Balance is ${bankAccount.currentBalance}")

  val myCar = Car("Toyota", "Prius", 2016, "MYCAR")
  println(s"${myCar.description}")
 
def msg = "I was compiled by Scala 3. :)"
