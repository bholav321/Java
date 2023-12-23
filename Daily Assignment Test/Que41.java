class Customer{
    private String name;
    private int customerno;
    private int quantity;
    private int unitcost;
    public Customer(String name, int customerno, int quantity, int unitcost ){
        this.name = name;
        this.customerno = customerno;
        this.quantity = quantity;
        this.unitcost = unitcost;
    }
    public String getname(){
        return name;
    }
    public int getcustomerno(){
        return customerno;
    }
    public int getquantity(){
        return quantity;
    }
    public int getunitcost(){
        return unitcost;
    }
    public Customer(){

    }
    public int Customerprice(){

    }
}