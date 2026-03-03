public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double money) {

        if (telcoName.equals(Telco.Smart)) {
            return "15 GB for ₱" + money;
        }
        else if (telcoName.equals(Telco.Globe)) {
            return "10 GB for ₱" + money;
        }
        else if (telcoName.equals(Telco.Ditto)) {
            return "8 GB for ₱" + money;
        }

        return "No data offer.";
    }
}