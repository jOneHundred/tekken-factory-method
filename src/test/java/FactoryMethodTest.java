import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    void testLeftPunchOfEddy(){
        var character = new Eddy();
        var attack = character.attack(AttackType.LEFT_PUNCH);
        assert attack instanceof EddyAttack;
        assert AttackType.LEFT_PUNCH.equals(attack.getAttackType());
    }

    @Test
    void testRightKickOfLaw(){
        var character = new Law();
        var attack = character.attack(AttackType.RIGHT_KICK);
        assert attack instanceof LawAttack;
        assert AttackType.RIGHT_KICK.equals(attack.getAttackType());
    }

    @Test
    void testRightPunchOfHwoarang(){
        var character = new Hwoarang();
        var attack = character.attack(AttackType.RIGHT_PUNCH);
        assert attack instanceof HwoarangAttack;
        assert AttackType.RIGHT_PUNCH.equals(attack.getAttackType());
    }
}
