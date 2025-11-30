package Effet;

import bandeau.Bandeau;

public class RotationBreve implements Effet {

    private final double angleRad;
    private final int dureeMs;

    public RotationBreve(double angleRad, int dureeMs) {
        this.angleRad = angleRad;
        this.dureeMs = dureeMs;
    }

    public void appliquer(Bandeau bandeau) {
        bandeau.setRotation(angleRad);
        bandeau.sleep(dureeMs);
        bandeau.setRotation(0.0);
    }
}
