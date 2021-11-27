package employee;


public class SalaryEmployee extends Employee {
    private float salary;
    
    public void setSalary(float salary){
    	this.salary = salary;
    }
    
    public float getSalary(){
    	return salary;
    }
    
    public SalaryEmployee(String name, int age, float salary){
    	setName(name);
    	setAge(age);
    	this.salary = salary;
    }
    
    public float getIncome(){
    	return salary;
    }
    
    public String toString(){
    	return getName()+ " " + getAge() + " " + salary;
    }
}
