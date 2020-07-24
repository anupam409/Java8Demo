package com.inno.appmain.entity;

public class Student {
private int id;
private String name;
private String email;
private long rollNo;

public Student() {
	
}

public Student(int id, String name, String email, long rollNo) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.rollNo = rollNo;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getRollNo() {
	return rollNo;
}
public void setRollNo(long rollNo) {
	this.rollNo = rollNo;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + (int) (rollNo ^ (rollNo >>> 32));
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
	Student other = (Student) obj;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (rollNo != other.rollNo)
		return false;
	return true;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", rollNo=" + rollNo + "]\n";
}

}
