package model;

import java.util.Random;
import javax.swing.JButton;

public class FunctionGame {

    public String resultadoAtack(int n) {
        if (n >= 100) {
            return ("Full Nation Strike");
        } else if (n >= 98 && n < 100) {
            return ("Biologic Weapon");
        } else if (n >= 90 && n < 98) {
            return ("Full Army Strike");
        } else if (n >= 80 && n <= 89) {
            return ("Strategic Atack");
        } else if (n >= 60 && n <= 79) {
            return ("Army Atack");
        } else if (n >= 30 && n <= 59) {
            return ("Infantary Rush");
        } else if (n >= 10 && n <= 29) {
            return ("Recon Atack");
        } else if (n >= 1 && n <= 9) {
            return ("Small Troop Atack");
        } else {
            return ("INSURGENCY!(Enemy Ap +1)");
        }
    }

    public String resultRepair(int n) {
        if (n <= 50 && n >= 48) {
            return ("Master Chief Work");
        } else if (n <= 41 && n >= 47) {
            return ("Chief Work");
        } else if (n <= 40 && n >= 31) {
            return ("Art Chief Work");
        } else if (n <= 30 && n >= 21) {
            return ("Master Enginner");
        } else if (n <= 29 && n >= 20) {
            return ("Engenner");
        } else if (n <= 19 && n >= 10) {
            return ("Rebuild");
        } else if (n <= 9 && n >= 1) {
            return ("Repair");
        } else if (n == 0) {
            return ("No one to Repair");
        } else if (n <= -1 && n >= -9) {
            return ("Incident on Repair");
        } else if (n <= -10 && n >= -18) {
            return ("Acidental Explosion");
        } else {
            return ("Shit Goes Down(AP -1)");
        }
    }
    public void enabler(JButton ae,JButton re,JButton he, JButton ce){
        ae.setEnabled(true);
        re.setEnabled(true);
        he.setEnabled(true);
        ce.setEnabled(true);
    }
    
    public void disabler(JButton as,JButton rs,JButton hs, JButton cs){
        as.setEnabled(false);
        rs.setEnabled(false);
        hs.setEnabled(false);
        cs.setEnabled(false);
    }
    
    public int randomGen(int min, int max) {
        Random rand = new Random();
        return (rand.nextInt((max - min) + min));
    }
}
