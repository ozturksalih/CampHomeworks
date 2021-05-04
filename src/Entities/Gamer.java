package Entities;
import java.util.Date;

public class Gamer extends User{
	private int nationalId ;
	private int userId;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	
	public Gamer() {
		super();
	}

	public Gamer(int nationalId, int userId, String email , String password,String firstName, String lastName, Date dateOfBirth) {
		super(userId,email , password);
		this.nationalId = nationalId;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
}
