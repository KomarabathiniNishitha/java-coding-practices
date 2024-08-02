package practice;



	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        if (initialBalance > 0) {
	            this.balance = initialBalance;
	        }
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000); // Initial balance of 1000
	        System.out.println("Initial Balance: " + account.getBalance());

	        account.deposit(1000);
	        System.out.println("Balance after deposit: " + account.getBalance());

	        account.withdraw(200);
	        System.out.println("Balance after withdrawal: " + account.getBalance());

	        account.withdraw(1500); // Trying to withdraw more than the balance
	        System.out.println("Balance after attempting overdraw: " + account.getBalance());
	    }
	}