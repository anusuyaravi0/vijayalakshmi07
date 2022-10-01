package entity1;

public class Account {

		private String userName1;
		private String password1;
		private int balance1;
		private int cashback1;
		private long accountNumber;
		private KYCVerification k;
		private ContactDetails e;
		
		public Account(String userName1,String password1,int balance1,int cashback1, long accountNumber) {
			super();
			this.userName1 = userName1;
			this.password1 =password1;
			this.balance1=balance1;
			this.cashback1=cashback1;
			this.accountNumber =accountNumber;
			
		}
		public Account() {
			super();
		
		}
		public KYCVerification getk() {
			return k;
			
		}
		public long getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getUserName() {
			return userName1;
		}
		public void setUserName(String userName) {
			this.userName1 = userName;
		}
		public String getPassword() {
			return password1;
		}
		public void setPassword(String password) {
			this.password1 = password;
		}
		public int getBalance() {
			return balance1;
		}
		public void setBalance(int balance) {
			this.balance1 = balance;
		}
		public int getCashback() {
			return cashback1;
		}
		public void setCashback(int cashback) {
			this.cashback1 = cashback;
		}
	    @Override
		public String toString() {
	    	return "Account[accountNumber="+accountNumber+",userName ="+userName1+",password ="+password1+",balance =+"+balance1+",cashback =+"+cashback1+",k="+k+"]";
			
		}
	    public void setE(ContactDetails e) {
			this.e = e;
	    
	    
			// TODO Auto-generated method stub
			return;
	    }
		public String getemailid() {
			// TODO Auto-generated method stub
			return null;
		}
			}
}
