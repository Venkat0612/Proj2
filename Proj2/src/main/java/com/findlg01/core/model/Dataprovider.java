package com.findlg01.core.model;

public class Dataprovider {
private String date;
private int value;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public Dataprovider(String date, int value) {
	super();
	this.date = date;
	this.value = value;
}
public Dataprovider() {
	
}

}