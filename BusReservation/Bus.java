package BusReservation;
public class Bus {
   private int BusNo;
   private boolean ac;
   private int capacity;
    
    Bus(int no, boolean ac, int cap)
    {
    	this.BusNo=no;
    	this.ac=ac;
    	this.capacity=cap;
    }
    
    public int getBusNo(){
    	return BusNo;
    }
    
    public boolean isAc() {
    	return ac;
    }
    public void setAc(boolean val) {
    	ac=val;
    }
    
    public int getCapacity() {   //accessor method
    	return capacity;
    }
    public void setCapacity(int cap) {  // mutator method
    	capacity=cap;
    }
    
    
    public void displayBusInfo() {
    	System.out.println("BusNo:"+BusNo +"; Ac:"+ac+"; Capacity:"+capacity);
    }
} 
