import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class Eddy implements Character{

    public static final Map<AttackType, Attack> ATTACKS;

    static {
        ATTACKS = new EnumMap<>(AttackType.class);
        Arrays.stream(AttackType.values()).forEach(attackType -> ATTACKS.put(attackType, new EddyAttack(attackType)));
    }

    @Override
    public Attack attack(AttackType attackType) {
        return ATTACKS.get(attackType);
    }

    @Override
    public String toString() {
        return "Eddy Gordo";
    }
}
