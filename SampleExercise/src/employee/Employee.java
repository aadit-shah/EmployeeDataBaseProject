package employee;

abstract public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
   
    public int compareTo(Employee e){
    	int alpha = this.name.compareTo(e.getName());
    	
    	 if(alpha !=0)
    		 return alpha;
    	 
    	 else
    		 if(this.age>e.getAge())
    			 return 1;
    		 else if(this.age<e.getAge())
    			 return -1;
    		 else 
    			 return 0;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public String getName(){
    	return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
    	return age;
    }
  
   public Employee(String name,int age){
	   this.name = name;
	   this.age = age;
   }
   
   public Employee(){

   }
  
   abstract public float getIncome();//default constructor - no need to add anything here
      
   public String toString(){
	   return name + " " + age;
   }
  
   
}