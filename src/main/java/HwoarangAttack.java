import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class HwoarangAttack implements Attack {

    private final AttackType attackType;

    @Override
    public String toString() {
        return attackType + " in " + FightingStyle.HWOARANG + " style";
    }
}
