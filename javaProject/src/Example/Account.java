package Example;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	int MIN = 0;
	int MAX = 1000000;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;

	}
	public Account() {
		
	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;

	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance <MIN || balance >MAX) {
			balance = this.balance;
		}
		this.balance = balance;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}