import accounts.*

@main def hello(): Unit =
  val bankAccount = CheckingAccount(100)
  println(s"Balance is ${bankAccount.currentBalance}")

  bankAccount.deposit(100)
  println(s"Balance is ${bankAccount.currentBalance}")

  bankAccount.withdraw(50)
  println(s"Balance is ${bankAccount.currentBalance}")

def msg = "I was compiled by Scala 3. :)"
