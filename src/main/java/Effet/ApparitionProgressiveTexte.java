package Effet;

import bandeau.Bandeau;

public class ApparitionProgressiveTexte implements Effet {

    private final int delaiMs;

    public ApparitionProgressiveTexte(int delaiMs) {
        this.delaiMs = delaiMs;
    }

    public void appliquer(Bandeau bandeau) {
        String texte = bandeau.getMessage();
        bandeau.setMessage("");

        for (int i = 0; i <= texte.length(); i++) {
            bandeau.setMessage(texte.substring(0, i));
            bandeau.sleep(delaiMs);
        }
    }
}
