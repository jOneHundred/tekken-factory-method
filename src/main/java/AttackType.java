import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AttackType {

    LEFT_PUNCH("Left punch"), RIGHT_PUNCH("Right punch"), LEFT_KICK("Left kick"), RIGHT_KICK("Right kick");

    private final String attackType;

    @Override
    public String toString() {
        return attackType;
    }
}
