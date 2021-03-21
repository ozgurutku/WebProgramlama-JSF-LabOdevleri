import java.util.List;

import javax.persistence.EntityManager;

public class UsersView {
	
	private int userID;
	private String password;

	public List<Users> bilgileriGetir() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from Users").getResultList();
	}
	
	public String dogrula(int userID, String password) {
		for(Users userList : bilgileriGetir()) {
			if(userList.getUserID() == userID && userList.getUserPassword().equals(password)) {
				return "dogru";
			}
		}
		return "hata";
	}

	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
