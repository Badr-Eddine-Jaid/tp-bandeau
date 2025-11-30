package Effet;

import bandeau.Bandeau;
import java.awt.Font;

public class ZoomProgressif implements Effet {

    private final int tailleMin;
    private final int tailleMax;
    private final int pas;

    public ZoomProgressif(int tailleMin, int tailleMax, int pas) {
        this.tailleMin = tailleMin;
        this.tailleMax = tailleMax;
        this.pas = pas;
    }

    public void appliquer(Bandeau bandeau) {
        for (int size = tailleMin; size <= tailleMax; size += pas) {
            Font f = new Font("Dialog", Font.BOLD, size);
            bandeau.setFont(f);
            bandeau.sleep(80);
        }
    }
}
