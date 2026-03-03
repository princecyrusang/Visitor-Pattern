import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallsTextOffer {
    private static final Map<String, String> unliMap = new HashMap<>();

    static {
        unliMap.put("Smart", "No free calls or texts. Charged per use.");
        unliMap.put("Globe", "Unlimited calls and texts within network.");
        unliMap.put("Ditto", "Unlimited calls and texts to all networks.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliMap.getOrDefault(telcoName, "No offer available.");
    }
}