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
class Order {
    
     private int OrderId;
    private int CustomerId ;
    private double Amount;
    
    public Order( int OrderId,int CustomerId,double Amount){
        this.OrderId=OrderId;
        this.CustomerId=CustomerId;
        this.Amount=Amount;
    
    }
    public int getOrderId(){
        return OrderId;
    }
    public int getCustomerId(){
        return CustomerId;
    }
    
    public double getAmount(){
        return Amount;
    }
    
}
