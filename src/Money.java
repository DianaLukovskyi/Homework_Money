public class Money {

  private   String currency;
   private String creditCard;

    private int amount;


    public Money(String currency,String creditCard, int amount){
        this.currency = currency;
        this.creditCard = creditCard;
        this.amount = amount;
    }
    public String getCurrency(){
        return currency;


    }
    public String getCreditCard(){
        return creditCard;
}
    public int getAmount(){
        return amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", amount=" + amount +
                '}';
    }
}


