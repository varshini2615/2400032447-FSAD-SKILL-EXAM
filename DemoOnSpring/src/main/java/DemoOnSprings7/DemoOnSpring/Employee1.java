package DemoOnSprings7.DemoOnSpring;

import java.util.List;

public class Employee1 {
int empID;
String empName;
double empSalary;
boolean empActive;
List<String> empSkills;
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public boolean isEmpActive() {
	return empActive;
}
public void setEmpActive(boolean empActive) {
	this.empActive = empActive;
}
public List<String> getEmpSkills() {
	return empSkills;
}
public void setEmpSkills(List<String> empSkills) {
	this.empSkills = empSkills;
}
//Create twoString method to display the object
@Override
public String toString() {
	return "Employee1 [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + ", empActive="
			+ empActive + ", empSkills=" + empSkills + "]";
}



}
