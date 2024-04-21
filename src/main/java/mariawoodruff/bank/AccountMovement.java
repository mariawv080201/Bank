package mariawoodruff.bank;

import java.util.Date;

public class AccountMovement {
	private String id;
	private double quantity;
	private Date date;
	private enum type {PURCHASE, BIZUM, BANK_TRANSFER_RECEIVED, BANK_TRANSFER_SENDED}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	};
}

