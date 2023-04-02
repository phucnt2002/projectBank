

interface Login {
	boolean credential(String username, String password);
	void forgotPassword(String username, String email);
	void changePassword(String password);
	boolean rememberMe(boolean check);
	void logout();
}
