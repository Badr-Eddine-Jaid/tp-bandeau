package Effet;

import bandeau.Bandeau;
import java.awt.Font;

public class ChangementPolice implements Effet {

    private final Font police;
    private final int dureeMs;

    public ChangementPolice(Font police, int dureeMs) {
        this.police = police;
        this.dureeMs = dureeMs;
    }

    public void appliquer(Bandeau bandeau) {
        bandeau.setFont(police);
        bandeau.sleep(dureeMs);
    }
}
