//session 2 task-1
package plana;

public class Employee {
	
    private int empId;
    private String empName;
    private int exp;
    private  double sal;
    
    public void setEmployeeDetails(int empId,String empName, int exp,double sal)
    {
    	this.empId=empId;
    	this.empName=empName;
    	this.sal=sal;
    }
    
    public void getEmployeeDetails()
    {
    	System.out.println("employee Id="+ empId);
    	System.out.println("employee Name="+ empName);
    	System.out.println("employee experience="+ exp);
    	System.out.println("employee salary="+ sal);

    }
     
    public int  getLoanEligibility(int empId,String empName,int exp,double sal)
    {
    	if(exp>5)
    	{
    		if(sal==6)
    		{
    			return 2;
    		}
    		if(sal>=10)
    		{
    			return 5;
    		}
    		if(sal>=15)
    		{
    			return 7;
    		}
    	}
    	return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Employee e1=new Employee();
       e1.setEmployeeDetails(1,"samrat",10,6.0);
       e1.getEmployeeDetails();
       System.out.println("loan eligibility is " +e1.getLoanEligibility(1, "samrat", 10, 6)+"Lakhs ");
      
	}

}
