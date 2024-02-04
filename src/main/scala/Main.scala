import accounts.*

@main def hello(): Unit =
  val bankAccount = SavingsAccount(100)
  println(s"Balance is ${bankAccount.currentBalance}")

def msg = "I was compiled by Scala 3. :)"
