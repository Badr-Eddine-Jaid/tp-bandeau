import bandeau.Bandeau;
import Effet.Effet;

import java.util.ArrayList;
import java.util.List;

public class Scenario {

    private final Bandeau bandeau;
    private final List<EtapeScenario> etapes = new ArrayList<>();

    public static class EtapeScenario {
        final Effet animation;
        final int repetitions;

        public EtapeScenario(Effet animation, int repetitions) {
            this.animation = animation;
            this.repetitions = repetitions;
        }
    }

    public Scenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void ajouter(Effet animation, int repetitions) {
        etapes.add(new EtapeScenario(animation, repetitions));
    }

    public void jouer() {
        for (EtapeScenario etape : etapes) {
            for (int i = 0; i < etape.repetitions; i++) {
                etape.animation.appliquer(bandeau);
            }
        }
    }
}
