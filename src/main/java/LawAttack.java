import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class LawAttack implements Attack {

    private final AttackType attackType;

    @Override
    public String toString() {
        return attackType + " in " + FightingStyle.LAW + " style";
    }
}
