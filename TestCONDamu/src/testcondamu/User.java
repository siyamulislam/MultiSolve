/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcondamu;

/**
 *
 * @author SiamPC
 */
class User {
    private int CustomerId;
    private String Name;
    private int Age;
    private String Address;
    private double Salary;
    
    public User( int CustomerId,String Name,int Age,String Address,double Salary){
        this.CustomerId=CustomerId;
        this.Name=Name;
        this.Age=Age;
        this.Address=Address;
        this.Salary=Salary;
    
    }

    User(int aInt, int aInt0, double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getCustomerId(){
        return CustomerId;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String getAddress(){
        return Address;
    }
    
    public double getSalary(){
        return Salary;
    }
    
    
}
