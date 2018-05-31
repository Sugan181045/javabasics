package javabasics;

public class date {
int month;
int day;
int year;
public date() {
	
}
public date(int month,int day,int date)
{
	this.month=month;
	this.day=day;
	this.year=year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void DisplayDate() {
	System.out.println(month+"/"+day+"/"+year);
}
public static void main(String a[]) {
	date d1= new date();
	d1.setDay(7);
	d1.setMonth(10);
	d1.setYear(1998);
	d1.DisplayDate();
	
	
}
}
