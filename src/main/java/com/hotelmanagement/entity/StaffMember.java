package com.hotelmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StaffMember {
	@Id
	private long code;
	private String empname;
	private String empadd;
	private String nic;
	private String salary;
	private int age;
	private String occupation;
	private String email;
	
	public StaffMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaffMember(long code, String empname, String empadd, String nic, String salary, int age, String occupation,
			String email) {
		super();
		this.code = code;
		this.empname = empname;
		this.empadd = empadd;
		this.nic = nic;
		this.salary = salary;
		this.age = age;
		this.occupation = occupation;
		this.email = email;
	}

	public long getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpadd() {
		return empadd;
	}

	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StaffMember [code=" + code + ", empname=" + empname + ", empadd=" + empadd + ", nic=" + nic
				+ ", salary=" + salary + ", age=" + age + ", occupation=" + occupation + ", email=" + email + "]";
	}
	
	
	
}
