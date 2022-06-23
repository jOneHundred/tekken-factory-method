import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum FightingStyle {
    EDDY("Capoeira"), HWOARANG("Taekwon-Do"), LAW("Jeet Kune Do");

    private final String style;

    @Override
    public String toString() {
        return style;
    }
}
