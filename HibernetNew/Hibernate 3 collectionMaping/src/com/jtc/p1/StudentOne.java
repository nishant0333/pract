package com.jtc.p1;
import java.util.*;

public class StudentOne {

	private int sid;
	private String sname;
	private String dob;
	private String qulification;
	private String course[];
	private List<String> emails;
	private List<Integer> markes;
	private Set<Long> phone;
	private Map<String,Long> refs;
	
	public StudentOne() {}

	public StudentOne(int sid,String sname, String dob, String qulification, String[] course, List<String> emails,
			List<Integer> markes, Set<Long> phone, Map<String, Long> refs) {
		super();
		this.sid=sid;
		this.sname = sname;
		this.dob = dob;
		this.qulification = qulification;
		this.course = course;
		this.emails = emails;
		this.markes = markes;
		this.phone = phone;
		this.refs = refs;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQulification() {
		return qulification;
	}

	public void setQulification(String qulification) {
		this.qulification = qulification;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Integer> getMarkes() {
		return markes;
	}

	public void setMarkes(List<Integer> markes) {
		this.markes = markes;
	}

	public Set<Long> getPhone() {
		return phone;
	}

	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

	
}