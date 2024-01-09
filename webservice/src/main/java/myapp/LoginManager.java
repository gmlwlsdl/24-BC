package myapp;

public class LoginManager {
	
	public boolean authenticate(UserBean user) {
		if(user.getUserid().equals("alice") && user.getPasswd().equals("1234")) {
			user.setEmail("alice@myserver.com");
			return true;
		}
		else if (user.getUserid().equals("alice") && !(user.getPasswd().equals("1234"))) {
			user.setError("비밀번호가 틀렸습니다람쥐");
			
		}
		else if(!(user.getUserid().equals("alice")) && user.getPasswd().equals("1234")) {
			user.setError("ID가 틀렸다람쥐");
		}
		return false;		
	}
}