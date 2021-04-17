package user;

public class UserVO {
	/*USERNAME VARCHAR(20),
	USERAGE NUMBER(10),
	USERGENDER VARCHAR(20),
	USEREMAIL VARCHAR(20) */
	
	private String userName;
	private int userAge;
	private String userGender;
	private String userEmail;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
	
}
