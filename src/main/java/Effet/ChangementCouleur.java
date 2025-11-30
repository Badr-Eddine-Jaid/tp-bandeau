package Effet;

import bandeau.Bandeau;
import java.awt.Color;

public class ChangementCouleur implements Effet {

    private final Color couleur;
    private final int dureeMs;

    public ChangementCouleur(Color couleur, int dureeMs) {
        this.couleur = couleur;
        this.dureeMs = dureeMs;
    }

    public void appliquer(Bandeau bandeau) {
        bandeau.setForeground(couleur);
        bandeau.sleep(dureeMs);
    }
}
