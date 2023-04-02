import java.util.Date;

interface EmployeeManagement {
	void createEmployee(String username, String password, String ID, String fullname, Date dateOfBirth, String role, String address, float salary, String email);
	void editEmployee(String username, String password, String ID, String fullname, Date dateOfBirth, String role, String address, float salary, String email);
	void deleteEmployee(String username, String ID);
	String getEmployeeDetail(String username, String ID, String fullname);
}
