import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class EddyAttack implements Attack {

    private final AttackType attackType;

    @Override
    public String toString() {
        return attackType + " in " + FightingStyle.EDDY + " style";
    }
}
