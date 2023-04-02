package test;

import java.util.Date;
public interface DebtManagement {
	void createDebt(String id, String userID, Double money, Date startDate, Date endDate, String state);
	void updateDebt(String userID, Double money, Date startDate, Date endDate, String state);
	String debtDetails(String userID, Double money, Date startDate, Date endDate, String state);
}
