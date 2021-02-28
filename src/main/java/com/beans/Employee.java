package com.beans;

public class Employee {
	
	private String emplyeeID;
	private String firstName;
	private String lastName;
	private String grade;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String emplyeeID, String firstName, String lastName, String grade) {
		super();
		this.emplyeeID = emplyeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}

	public String getEmplyeeID() {
		return emplyeeID;
	}

	public void setEmplyeeID(String emplyeeID) {
		this.emplyeeID = emplyeeID;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emplyeeID == null) ? 0 : emplyeeID.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emplyeeID == null) {
			if (other.emplyeeID != null)
				return false;
		} else if (!emplyeeID.equals(other.emplyeeID))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	

}
