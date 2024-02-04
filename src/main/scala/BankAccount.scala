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

    
    class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance):
        private val interest: Double = 0.05
        private val charge: Double = 1
        private var freeDeposits: Int = 3
        private var freeWithdrawals: Int = 3

        override def deposit(amount: Double): Double = {
            if freeDeposits != 0 then
                freeDeposits -= 1
                super.deposit(amount)
            else
                super.deposit(amount - charge)
        }

        override def withdraw(amount: Double): Double = {
            if freeWithdrawals != 0 then
                freeWithdrawals -= 1
                super.withdraw(amount)
            else
                super.withdraw((amount + charge))
        }

        def earnMonthlyInterest(): Double = {
            freeDeposits = 3
            freeWithdrawals = 3

            var balance = super.currentBalance
            balance + (balance * interest)
        }