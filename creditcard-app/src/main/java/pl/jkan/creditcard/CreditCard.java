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
}