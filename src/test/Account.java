package test;

public class Account {
	
	private int Balance;
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public int getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(int accountNum) {
		AccountNum = accountNum;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	private int AccountNum;
	private String AccountHolderName;

}
