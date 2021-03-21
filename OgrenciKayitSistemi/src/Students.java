import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Students {
	
	@Id
	@GeneratedValue
	private int stuID;
    private String stuName;
    private String stuSurname;
    private Date stuDOB;
    private String stuCourse;
    private Boolean paidTutionFee;
    
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSurname() {
		return stuSurname;
	}
	public void setStuSurname(String stuSurname) {
		this.stuSurname = stuSurname;
	}
	public Date getStuDOB() {
		return stuDOB;
	}
	public void setStuDOB(Date stuDOB){
		this.stuDOB = stuDOB;
	}
	public String getStuCourse() {
		return stuCourse;
	}
	public void setStuCourse(String stuCourse) {
		this.stuCourse = stuCourse;
	}
	public Boolean getPaidTutionFee() {
		return paidTutionFee;
	}
	public void setPaidTutionFee(Boolean paidTutionFee) {
		this.paidTutionFee = paidTutionFee;
	}

}
