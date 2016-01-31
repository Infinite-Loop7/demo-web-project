package edu.cpp.cs580.data;

import java.util.Date;

import com.google.common.collect.ComparisonChain;


/**
 * The basic user object.
 */
public class User implements Comparable<User>{

	/** The unique user Id */
    private String id;
    /** The unique user Id */
    private String name;
    /** The unique user Id */
    private String major;
    /** The unique user Id */
    private String minor;
    private String email;
    /** The timestamp when the user is being created */
    private String creationTime = new Date(System.currentTimeMillis()).toString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public int compareTo(User otherUser) {
		// TODO Auto-generated method stub
		return ComparisonChain.start().compare(id, otherUser.id).result();
	}
	
	
}
