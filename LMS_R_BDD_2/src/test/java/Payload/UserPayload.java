package Payload;

import java.util.Map;

public class UserPayload {
	String userComments;
	String userEduPg;
	String userEduUg;
	String userFirstName;
	String userLastName;
	String userLinkedinUrl;
	String userLocation;
	String loginStatus;
	String password;
	String userLoginEmail;
	String userMiddleName;
	String userPhoneNumber;
	String userRoleMaps;
	String roleId;
	String userRoleStatus;
	String userTimeZone;
	String userVisaStatus;
	
	public String getUserComments() {
		return userComments;
	}
	public void setUserComments(String userComments) {
		this.userComments = userComments;
	}
	public String getUserEduPg() {
		return userEduPg;
	}
	public void setUserEduPg(String userEduPg) {
		this.userEduPg = userEduPg;
	}
	public String getUserEduUg() {
		return userEduUg;
	}
	public void setUserEduUg(String userEduUg) {
		this.userEduUg = userEduUg;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserLinkedinUrl() {
		return userLinkedinUrl;
	}
	public void setUserLinkedinUrl(String userLinkedinUrl) {
		this.userLinkedinUrl = userLinkedinUrl;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserLoginEmail() {
		return userLoginEmail;
	}
	public void setUserLoginEmail(String userLoginEmail) {
		this.userLoginEmail = userLoginEmail;
	}
	public String getUserMiddleName() {
		return userMiddleName;
	}
	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public String getUserRoleMaps() {
		return userRoleMaps;
	}
	public void setUserRoleMaps(String userRoleMaps) {
		this.userRoleMaps = userRoleMaps;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getUserRoleStatus() {
		return userRoleStatus;
	}
	public void setUserRoleStatus(String userRoleStatus) {
		this.userRoleStatus = userRoleStatus;
	}
	public String getUserTimeZone() {
		return userTimeZone;
	}
	public void setUserTimeZone(String userTimeZone) {
		this.userTimeZone = userTimeZone;
	}
	public String getUserVisaStatus() {
		return userVisaStatus;
	}
	public void setUserVisaStatus(String userVisaStatus) {
		this.userVisaStatus = userVisaStatus;
	}
	
	public void makeUserPayloadByMap(Map<String, String> record) {
		
		userComments = record.get("userComments");
		userEduPg = record.get("userEduPg");
		userEduUg = record.get("userEduUg");
		userFirstName = record.get("userFirstName");
		userLastName = record.get("userLastName");
		userLinkedinUrl = record.get("userLinkedinUrl");
		userLocation = record.get("userLocation");
		loginStatus = record.get("loginStatus");
		password = record.get("password");
		userLoginEmail = record.get("userLoginEmail");
		userMiddleName = record.get("userMiddleName");
		userPhoneNumber = record.get("userPhoneNumber");
		userRoleMaps = record.get("userRoleMaps");
		roleId = record.get("roleId");
		userRoleStatus = record.get("userRoleStatus");
		userTimeZone = record.get("userTimeZone");
		userVisaStatus = record.get("userVisaStatus");
	
	}

}
