package com.javalearn.online;

public class input {

    public int a, b;
    public int l1 = 0;
    public int l2 = 0;

    public String[] y;
    public int[] masArab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    public String[] masRim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public input(String y) {
        this.y = y.split(" ");
    }

    public void check() {
        try {
            if ( y.length != 3 ) {
                System.out.println("Неправильно введены данные");
                System.exit(0);
            }
            a = Integer.parseInt(y[0]);
            b = Integer.parseInt(y[2]);
        } catch (NumberFormatException e) {
            for (int k = 0; k < masRim.length; k++) {
                if ( y[0].equals(masRim[k]) == true ) {
                    a = masArab[k];
                    l1 = k;
                }
                if ( y[2].equals(masRim[k]) == true ) {
                    b = masArab[k];
                    l2 = k;
                }
            }

            if ( y[0].equals(masRim[l1]) == false || y[2].equals(masRim[l2]) == false ) {
                System.out.println("Неправильно введены данные");
                System.exit(0);
            }
        }
    }
}
