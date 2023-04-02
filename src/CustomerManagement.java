package test;

public interface CustomerManagement {
	void createCustomer(String id, String username, String password, String name, String CitizenID, String address, String email, String credit);
	void updateCustomer(String password, String name, String CitizenID, String address, String email, String credit);
	void deleteCustomer(String id, String username, String CitizenID);
	String customerDetails(String id, String username, String name, String CitizenID, String address, String email, String credit);
}
