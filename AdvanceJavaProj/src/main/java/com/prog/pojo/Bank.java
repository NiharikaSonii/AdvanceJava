package com.prog.pojo;

import javax.persistence.*;

@Entity
@Table(name= "Bank")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String bankName;
	private String acctype;
	private String branch;
	public Bank(String bankName, String acctype, String branch) {
		super();
		this.bankName = bankName;
		this.acctype = acctype;
		this.branch = branch;
	}
	public Bank() {
		
	}
	
	public Integer getId() {
		return this.Id;
	}
	
	public void setId(Integer Id) {
		this.Id = Id;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", acctype=" + acctype + ", branch=" + branch + "]";
	}
	
}
