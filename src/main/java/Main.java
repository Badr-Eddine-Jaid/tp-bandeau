import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

import Effet.ApparitionProgressiveTexte;
import Effet.ChangementCouleur;
import Effet.ChangementPolice;
import Effet.FondClignotant;
import Effet.RotationBreve;
import Effet.ZoomProgressif;

public class Main {

    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        bandeau.setMessage("Bienvenue au TP Bandeau !");

        Scenario scenario = new Scenario(bandeau);
        scenario.ajouter(new ChangementCouleur(Color.RED, 1000), 1);
        scenario.ajouter(new ChangementPolice(new Font("Serif", Font.BOLD, 24), 800), 1);
        scenario.ajouter(new ZoomProgressif(10, 60, 5), 1);
        scenario.ajouter(new ApparitionProgressiveTexte(150), 1);

        Color[] couleurs = { Color.YELLOW, Color.BLUE, Color.RED, Color.GREEN };
        scenario.ajouter(new FondClignotant(couleurs, 3, 120), 1);

        scenario.ajouter(new RotationBreve(Math.PI / 4, 250), 3);
        scenario.jouer();

        bandeau.close();
    }
}
