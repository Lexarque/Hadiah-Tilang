package Yee;

import java.util.*;

public class SistemTilang {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        int q = 0;

        System.out.println(" Apakah Memakai Masker ?");
        System.out.println(" True / False ");
        boolean ma = S.nextBoolean();
        if ( !ma ){
            q++;
        }
        System.out.println(" Apakah Membawa SIM ?");
        System.out.println(" True / False ");
        boolean si = S.nextBoolean();
        if ( !si ){
            q++;
        }
        System.out.println(" Apakah Membawa STNK ?");
        System.out.println(" True / False ");
        boolean st = S.nextBoolean();
        if ( !st ){
            q++;
        }

        if ( q == 1 ){
            System.out.println(" Total Pelanggaran = " +q);
            System.out.println(" Total Yang Harus Dibayar = Rp20.000");
        }else if ( q == 2){
            System.out.println(" Total Pelanggaran = " +q);
            System.out.println(" Total Yang Harus Dibayar = Rp50.000");
        }else if ( q == 3){
            System.out.println(" Total Pelanggaran = " +q);
            System.out.println(" Total Yang Harus Dibayar = Rp100.000");
            System.out.println(" Mohon taati peraturan untuk kenyamanan bersama ");
        }else{
            System.out.println(" Total Pelanggaran = " +q);
            System.out.println(" Terimakasih Sudah Mau Menaati Peraturan :) ");
        }
    }
}
