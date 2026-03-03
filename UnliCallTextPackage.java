public class UnliCallTextPackage implements UnliCallTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "No unlimited calls & texts.";
        }

        if (telcoName.equals(Telco.Globe)) {
            return "Unlimited calls & texts within Globe network only.";
        }
        else if (telcoName.equals(Telco.Ditto)) {
            return "Unlimited calls & texts to all networks.";
        }

        return "No unlimited calls & texts.";
    }
}