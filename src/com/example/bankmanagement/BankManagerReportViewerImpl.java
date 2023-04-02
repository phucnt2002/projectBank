package com.example.bankmanagement;

public class BankManagerReportViewerImpl implements BankManagerReportViewer {
	  
	  private SalesData salesData;
	  private ProfitAndLossData profitAndLossData;
	  private CustomerData customerData;
	  private CustomerLoyaltyData customerLoyaltyData;
	  
	  public BankManagerReportViewerImpl(SalesData salesData, ProfitAndLossData profitAndLossData, 
	                                      CustomerData customerData, CustomerLoyaltyData customerLoyaltyData) {
	    this.salesData = salesData;
	    this.profitAndLossData = profitAndLossData;
	    this.customerData = customerData;
	    this.customerLoyaltyData = customerLoyaltyData;
	  }
	  
	  public void viewBusinessReport() {
	    // generate summary report of bank's business operations
	    double totalSales = salesData.getTotalSales();
	    double totalProfits = profitAndLossData.getTotalProfits();
	    int newCustomers = customerData.getNewCustomers();
	    double customerLoyaltyRate = customerLoyaltyData.getCustomerLoyaltyRate();
	    
	    // display report to Bank Manager
	    System.out.println("Bank Manager Summary Report");
	    System.out.println("Total Sales: " + totalSales);
	    System.out.println("Total Profits: " + totalProfits);
	    System.out.println("Number of New Customers: " + newCustomers);
	    System.out.println("Customer Loyalty Rate: " + customerLoyaltyRate);
	  }
	  
	}

