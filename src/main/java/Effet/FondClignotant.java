package Effet;

import bandeau.Bandeau;
import java.awt.Color;

public class FondClignotant implements Effet {

    private final Color[] couleurs;
    private final int cycles;
    private final int delaiMs;

    public FondClignotant(Color[] couleurs, int cycles, int delaiMs) {
        this.couleurs = couleurs;
        this.cycles = cycles;
        this.delaiMs = delaiMs;
    }

    public void appliquer(Bandeau bandeau) {
        Color sauvegarde = bandeau.getBackground();

        for (int i = 0; i < cycles; i++) {
            for (Color c : couleurs) {
                bandeau.setBackground(c);
                bandeau.sleep(delaiMs);
            }
        }

        bandeau.setBackground(sauvegarde);
    }
}
