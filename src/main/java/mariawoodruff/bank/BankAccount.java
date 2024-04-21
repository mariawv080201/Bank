package mariawoodruff.bank;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class BankAccount {
	private String id;
	private String ownerName;
	private String ownerDNI;
	private Date creationDate;
	private double balance;
	
	private List<AccountMovement> history;
	
	public BankAccount(String id, String ownerName, String ownerDNI, Date creationDate, double balance) {
		this.id = id;
		this.ownerName = ownerName;
		this.ownerDNI = ownerDNI;
		this.creationDate = creationDate;
		this.balance = balance;
		this.history = new LinkedList<AccountMovement>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerDNI() {
		return ownerDNI;
	}

	public void setOwnerDNI(String ownerDNI) {
		this.ownerDNI = ownerDNI;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<AccountMovement> getHistory() {
		return history;
	}

	public void setHistory(List<AccountMovement> history) {
		this.history = history;
	}
	
	
	public void addAccountMovement(AccountMovement accountMovement) {
		history.add(accountMovement);
	}
}
