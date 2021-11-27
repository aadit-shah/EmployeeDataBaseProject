package employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeList {
    ArrayList<Employee> employees= new ArrayList<Employee>();
   
    public int length(){
    	return employees.size();
    }
   
    public Employee get(int index){
    	return employees.get(index);
    } 
   
    public void newData(String name,int age, float salary){
    	employees.clear();
    	
    	Employee emp = new SalaryEmployee(name, age, salary); 	
    	employees.add(emp);
    }
    
    /*
     * Add data from user
     */
    public void addData(String name,int age, float salary){
    	
    	Employee emp = new SalaryEmployee(name, age, salary); 	
    	employees.add(emp);
    }

}

