import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        Character character = new Eddy();
        Attack attack = character.attack(AttackType.LEFT_KICK);
        log.info(character + " used " + attack);

        character = new Law();
        attack = character.attack(AttackType.RIGHT_PUNCH);
        log.info(character + " used " + attack);

        character = new Hwoarang();
        attack = character.attack(AttackType.RIGHT_KICK);
        log.info(character + " used " + attack);
    }
}
