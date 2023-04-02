package com.example.bankmanagement;
import java.util.Date;
import java.util.List;
public class Transaction {
	  
	  public enum Type {
	    TRANSFER,
	    WITHDRAWAL,
	    BILL_PAYMENT
	  }
	  
	  private String transactionId;
	  private String customerId;
	  private Type type;
	  private Date date;
	  private double amount;
	  private String recipientOrSender;
	  
	  public Transaction(String transactionId, String customerId, Type type, Date date, double amount, String recipientOrSender) {
	    this.transactionId = transactionId;
	    this.customerId = customerId;
	    this.type = type;
	    this.date = date;
	    this.amount = amount;
	    this.recipientOrSender = recipientOrSender;
	  }
	  
	  // Getters and setters
	  
	  public String getTransactionId() {
	    return transactionId;
	  }
	  
	  public void setTransactionId(String transactionId) {
	    this.transactionId = transactionId;
	  }
	  
	  public String getCustomerId() {
	    return customerId;
	  }
	  
	  public void setCustomerId(String customerId) {
	    this.customerId = customerId;
	  }
	  
	  public Type getType() {
	    return type;
	  }
	  
	  public void setType(Type type) {
	    this.type = type;
	  }
	  
	  public Date getDate() {
	    return date;
	  }
	  
	  public void setDate(Date date) {
	    this.date = date;
	  }
	  
	  public double getAmount() {
	    return amount;
	  }
	  
	  public void setAmount(double amount) {
	    this.amount = amount;
	  }
	  
	  public String getRecipientOrSender() {
	    return recipientOrSender;
	  }
	  
	  public void setRecipientOrSender(String recipientOrSender) {
	    this.recipientOrSender = recipientOrSender;
	  }
	  
	}

