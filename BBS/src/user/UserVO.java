package user;

/*
 * USERID VARCHAR(20),
	USERPASSWORD VARCHAR(20),
	USERNAME VARCHAR(20),
	USERGENDER VARCHAR(20),
	USEREMAIL VARCHAR(50),
 * 
 */

public class UserVO {
	private String userId;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
