package com.example.bankmanagement;
import java.util.Date;
import java.util.List;
public interface CustomerTransactionManager {
	List<Transaction> viewTransactions(Date startDate, Date endDate) throws AccessDeniedException, TransactionInformationException;
	List<Transaction> viewTransactionsForCustomer(String customerId, Date startDate, Date endDate) throws AccessDeniedException, TransactionInformationException;
}
