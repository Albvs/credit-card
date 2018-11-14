package pl.jkan.creditcard;

class CreditCard {
    private double limit = 0; 
    private boolean blockade = false;
    
    public void assignLimit(double limit) {
        this.limit = limit;
    }
    public void block(){
        this.blockade = true; 
    }
    public double getLimit(){
        return limit;
    }
    
    public boolean isBlocked(){
        return blockade;
    }
    public void withdraw(double value){
        if (this.limit < value || this.blockade) System.out.print("Can't withdraw!!");
        else this.limit -= value;
    }
    public void repay(double momney){
        this.limit += money;
    }
}