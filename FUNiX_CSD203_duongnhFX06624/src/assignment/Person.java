package assignment;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable{
	private int iD;
	private String name;
	private String birthDay;
	private String place;
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Person [iD=" + iD + ", name=" + name + ", birthDay=" + birthDay + ", place=" + place + "]";
	}
	
	
}
