package accounts:

    class BankAccount(initialBalance: Double):
        private var balance = initialBalance
        def currentBalance = balance
        def deposit(amount: Double) = {balance += amount; balance}
        def withdraw(amount: Double) = {balance -= amount; balance}

    
    class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance):

        private val charge: Double = 1
        override def deposit(amount: Double): Double = {
            super.deposit(amount - charge)
        }

        override def withdraw(amount: Double): Double = {
            super.withdraw((amount + charge))
        }