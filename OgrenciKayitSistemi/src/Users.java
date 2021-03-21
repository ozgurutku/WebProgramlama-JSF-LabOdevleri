import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
		
		@Id
		@GeneratedValue
        private int userID;
        private String userName;
        private String userSurname;
        private String userPassword;
        
		public int getUserID() {
			return userID;
		}
		public void setUserID(int userID) {
			this.userID = userID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserSurname() {
			return userSurname;
		}
		public void setUserSurname(String userSurname) {
			this.userSurname = userSurname;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

}
