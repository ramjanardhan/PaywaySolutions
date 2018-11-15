package com.paywaysolutions.model;

public class EmailPojo {
	
	private String customerName;
	private String customerMobileNo;
	private String customerMailID;
	private String customerAddress;
	private String loanType;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMobileNo() {
		return customerMobileNo;
	}
	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}
	public String getCustomerMailID() {
		return customerMailID;
	}
	public void setCustomerMailID(String customerMailID) {
		this.customerMailID = customerMailID;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	@Override
	public String toString() {
		return "EmailPojo [customerName=" + customerName + ", customerMobileNo=" + customerMobileNo
				+ ", customerMailID=" + customerMailID + ", customerAddress=" + customerAddress + ", loanType="
				+ loanType + "]";
	}
	
	
	
	
	

}
