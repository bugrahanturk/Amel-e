package com.amel_e;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class Move implements Runnable {

    private String adress;
    private String name;

    private boolean flag = true;
    private boolean flag1 = true;
    private boolean flag2 = true;
    private boolean flag3 = true;
    private boolean flag4 = true;

    public Move(String adress, String name) {
        this.adress = adress;
        this.name = name;
    }

    @Override
    public void run() {

        JLabel target, kur;
        kur = suit();
        kur.setText(name + "'s");
        target = tar();
        
        moveMarket(kur);
        moveBina(target, kur);
        moveMerkez(kur);
        kur.setText(null);
        adjust();

    }

    public boolean car() {
        return GMap.getLbl_kurye().getX() == 760 && GMap.getLbl_kurye().getY() == 470 || GMap.getLbl_kurye().getX() == 761 && GMap.getLbl_kurye().getY() == 516;
    }

    public boolean car1() {
        return GMap.getLbl_kurye1().getX() == 639 && GMap.getLbl_kurye1().getY() == 590 || GMap.getLbl_kurye1().getX() == 761 && GMap.getLbl_kurye1().getY() == 516;
    }

    public boolean car2() {
        return GMap.getLbl_kurye2().getX() == 629 && GMap.getLbl_kurye2().getY() == 540 || GMap.getLbl_kurye2().getX() == 761 && GMap.getLbl_kurye2().getY() == 516;
    }

    public boolean car3() {
        return GMap.getLbl_kurye3().getX() == 629 && GMap.getLbl_kurye3().getY() == 490 || GMap.getLbl_kurye3().getX() == 761 && GMap.getLbl_kurye3().getY() == 516;
    }

    public boolean car4() {
        return GMap.getLbl_kurye4().getX() == 820 && GMap.getLbl_kurye4().getY() == 470 || GMap.getLbl_kurye4().getX() == 761 && GMap.getLbl_kurye4().getY() == 516;
    }

    public synchronized JLabel suit() {

        if (car() && flag) {
            flag = false;
            return GMap.getLbl_kurye();
        }
        if (car1() && flag1) {
            flag1 = false;
            return GMap.getLbl_kurye1();
        }
        if (car2() && flag2) {
            flag2 = false;
            return GMap.getLbl_kurye2();
        }
        if (car3() && flag3) {
            flag3 = false;
            return GMap.getLbl_kurye3();
        }
        if (car4() && flag4) {
            flag4 = false;
            return GMap.getLbl_kurye4();
        }

        return null;
    }

    public void adjust() {
        flag = true;
        flag1 = true;
        flag2 = true;
        flag3 = true;
        flag4 = true;
    }

    public JLabel tar() {
        if (GMap.getLbl_info1().getText().equalsIgnoreCase(adress)) {
            return GMap.getLbl_build1();
        } else if (GMap.getLbl_info2().getText().equalsIgnoreCase(adress)) {
            return GMap.getLbl_build2();
        } else if (GMap.getLbl_info3().getText().equalsIgnoreCase(adress)) {
            return GMap.getLbl_build3();
        } else if (GMap.getLbl_info4().getText().equalsIgnoreCase(adress)) {
            return GMap.getLbl_build4();
        } else if (GMap.getLbl_info5().getText().equalsIgnoreCase(adress)) {
            return GMap.getLbl_build5();
        } else if (GMap.getLbl_info6().getText().equalsIgnoreCase(adress)) {
            return GMap.getLbl_build6();
        } else if (GMap.getLbl_info7().getText().equalsIgnoreCase(adress)) {
            return GMap.getLbl_build7();
        } else if (GMap.getLbl_info8().getText().equalsIgnoreCase(adress)) {
            return GMap.getLbl_build8();
        } else {
            return null;
        }
    }

    public void moveMarket(JLabel kur) {
        for (int i = 0; i < 1000; i++) {
            if (kur.getX() == GMap.getLbl_market().getX() && kur.getY() == GMap.getLbl_market().getY()) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                }
                return;
            } else {
                if (kur.getX() > GMap.getLbl_market().getX() && kur.getY() > GMap.getLbl_market().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() - 1, kur.getY() - 1);
                } else if (kur.getX() == GMap.getLbl_market().getX() && kur.getY() > GMap.getLbl_market().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX(), kur.getY() - 1);
                } else if (kur.getX() > GMap.getLbl_market().getX() && kur.getY() == GMap.getLbl_market().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() - 1, kur.getY());
                } else if (kur.getX() > GMap.getLbl_market().getX() && kur.getY() < GMap.getLbl_market().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() - 1, kur.getY() + 1);
                } else if (kur.getX() < GMap.getLbl_market().getX() && kur.getY() > GMap.getLbl_market().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() + 1, kur.getY() - 1);
                } else {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() + 1, kur.getY() + 1);
                }
            }
        }
    }

    public void moveBina(JLabel target, JLabel kur) {
        for (int i = 0; i < 1000; i++) {
            if (kur.getX() == target.getX() && kur.getY() == target.getY()) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            } else {
                if (kur.getX() > target.getX() && kur.getY() > target.getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() - 1, kur.getY() - 1);
                } else if (kur.getX() == target.getX() && kur.getY() > target.getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX(), kur.getY() - 1);
                } else if (kur.getX() > target.getX() && kur.getY() == target.getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() - 1, kur.getY());
                } else if (kur.getX() > target.getX() && kur.getY() < target.getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() - 1, kur.getY() + 1);
                } else if (kur.getX() < target.getX() && kur.getY() > target.getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() + 1, kur.getY() - 1);
                } else {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() + 1, kur.getY() + 1);
                }
            }
        }
    }

    public void moveMerkez(JLabel kur) {
        for (int i = 0; i < 1000; i++) {
            if (kur.getX() == GMap.getLbl_center().getX() && kur.getY() == GMap.getLbl_center().getY()) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            } else {
                if (kur.getX() > GMap.getLbl_center().getX() && kur.getY() > GMap.getLbl_center().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() - 1, kur.getY() - 1);
                } else if (kur.getX() == GMap.getLbl_center().getX() && kur.getY() > GMap.getLbl_center().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX(), kur.getY() - 1);
                } else if (kur.getX() > GMap.getLbl_center().getX() && kur.getY() == GMap.getLbl_center().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() - 1, kur.getY());
                } else if (kur.getX() > GMap.getLbl_center().getX() && kur.getY() < GMap.getLbl_center().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() - 1, kur.getY() + 1);
                } else if (kur.getX() < GMap.getLbl_center().getX() && kur.getY() > GMap.getLbl_center().getY()) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() + 1, kur.getY() - 1);
                } else {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    kur.setLocation(kur.getX() + 1, kur.getY() + 1);
                }
            }
        }
    }

}
