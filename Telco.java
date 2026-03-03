public class Telco implements TelcoSubscription {

    public static final String Smart = "Smart";
    public static final String Globe = "Globe";
    public static final String Ditto = "Ditto";

    private int dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice,
                 String telcoName, boolean unliCallText) {

        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }
}