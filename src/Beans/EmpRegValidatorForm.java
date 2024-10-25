package Beans;

import org.apache.struts.validator.ValidatorForm;

public class EmpRegValidatorForm extends ValidatorForm {
	
	private int id_f;
	private float salary_f;
	private long phone_f,credit_f;
	private String name_f,email_f;
	
	public EmpRegValidatorForm(){
		String settedfields=toString();
		System.out.println(settedfields);
	}
	
	public int getId_f() {
		return id_f;
	}
	public void setId_f(int id_f) {
		this.id_f = id_f;
	}
	public float getSalary_f() {
		return salary_f;
	}
	public void setSalary_f(float salary_f) {
		this.salary_f = salary_f;
	}
	public long getPhone_f() {
		return phone_f;
	}
	public void setPhone_f(long phone_f) {
		this.phone_f = phone_f;
	}
	public long getCredit_f() {
		return credit_f;
	}
	public void setCredit_f(long credit_f) {
		this.credit_f = credit_f;
	}
	public String getName_f() {
		return name_f;
	}
	public void setName_f(String name_f) {
		this.name_f = name_f;
	}
	public String getEmail_f() {
		return email_f;
	}
	public void setEmail_f(String email_f) {
		this.email_f = email_f;
	}
	@Override
	public String toString() {
		return "EmpRegValidatorForm [id_f=" + id_f + ", salary_f=" + salary_f + ", phone_f=" + phone_f + ", credit_f="
				+ credit_f + ", name_f=" + name_f + ", email_f=" + email_f + "]";
	}
	
	
	

}
