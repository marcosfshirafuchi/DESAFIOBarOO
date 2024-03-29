public class Bill {
    public static final double beerPrice = 5.00;
    public static final double softDrinkPrice = 3.00;
    public static final double barbecuePrice = 7.00;
    public static final double memPrice = 10.00;
    public static final double womemPrice = 8.00;

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double Feeding(){
        return beer * beerPrice + softDrink * softDrinkPrice + barbecue * barbecuePrice;
    }
    public double Ticket(){
        if(gender == 'F'){
            return womemPrice;
        }else {
            return memPrice;
        }
    }

    public double Cover(){
        if(Feeding()> 30.00){
            return 0;
        }else{
            return 4.00;
        }
    }

    public double Total(){
        return  Cover() + Ticket() +Feeding();
    }
}
