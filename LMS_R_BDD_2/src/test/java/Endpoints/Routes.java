package Endpoints;

public class Routes {

	//Base URL
	public static String BASE_URL = "https://userapi-8877aadaae71.herokuapp.com/uap";
	
	  public static String LOGIN_URL = BASE_URL +"/login";

	//GETUser//GETUsername//GetID
	  
	  public static String get_AllBatches = BASE_URL+"/batches";
		public static String get_Users = BASE_URL+"/users";
		public static String get_Username = BASE_URL+"/users/username/";
		public static String get_UserId = BASE_URL+"/user/";

		//Create User
		public static String CreateUser_Url = BASE_URL+"/createusers";
		
		//Update User
		public static String UpdateUser_Url = BASE_URL+"/updateuser/12861";
		
		//Delete User
		public static String DeleteUser_ByUsername_Url= BASE_URL+"/deleteuser/username/{userFirstName}";
		public static String DeleteUser_ByUserID_Url= BASE_URL+"/deleteuser/";
	
	

}
