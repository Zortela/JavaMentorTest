package com.javalearn.online;

public class output {

    private int ten;
    private int num;
    private int minus;
    private int k = 0;
    private int z;
    private int l1;
    private int l2;
    private int[] masArab;

    private String z1 = " ";
    private String[] z2;
    private String[] y;
    private String[] masRim;
    private String[] masResult = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};


    public void setMasArab(int[] masArab) {
        this.masArab = masArab;
    }

    public void setMasRim(String[] masRim) {
        this.masRim = masRim;
    }

    public output(String y, int[] masArab, String[] masRim, int l1, int l2) {
        this.y = y.split(" ");
        this.masArab = masArab;
        this.masRim = masRim;
        this.l1 = l1;
        this.l2 = l2;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void outconsole() {
        if ( y[0].equals(masRim[l1]) == true & y[2].equals(masRim[l2]) == true & z != 0 ) {
            while (z != 0) {
                if ( z >= 10 ) {
                    z -= 10;
                    ten += 10;
                } else if ( z < 10 & z > 0 ) {
                    z -= 1;
                    num += 1;
                } else if ( z < 0 ) {
                    z += 1;
                    minus -= 1;
                }
            }

            for (int o = 0; o < masArab.length; o++) {
                if ( ten == masArab[o] ) {
                    z1 += masResult[o];
                    k = 1;
                }
            }
            for (int o = 0; o < masArab.length; o++) {
                if ( num == masArab[o] ) {
                    z1 += masResult[o];
                    k = 1;
                }
            }
            for (int o = 0; o < masArab.length; o++) {
                if ( Math.abs(minus) == masArab[o] ) {
                    z1 = "-" + masResult[o];
                    k = 2;
                }
            }

            if ( k == 1 ) {
                z2 = z1.split(" ");
                System.out.println(z2[1]);
            } else if ( k == 2 ) {
                z2 = z1.split(" ");
                System.out.println(z2[0]);
            }
        } else {
            System.out.println(z);
        }
    }
}
