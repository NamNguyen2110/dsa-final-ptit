package tonghop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KieuTrinh
 */
public class SapXepCongViec {

    static int n;
    int batdau, ketthuc;
    static SapXepCongViec[] listJob;

    public SapXepCongViec(int batdau, int ketthuc) {
        this.batdau = batdau;
        this.ketthuc = ketthuc;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());

        while (t-- > 0) {

            n = scn.nextInt();
            listJob = new SapXepCongViec[n];
            for (int i = 0; i < n; i++) {
                int a = scn.nextInt();
                int b = scn.nextInt();
                listJob[i] = new SapXepCongViec(a, b);
            }

            Arrays.sort(listJob,new Comparator<SapXepCongViec>() {
                @Override
                public int compare(SapXepCongViec o1, SapXepCongViec o2) {
                    return o1.ketthuc-o2.ketthuc;
                }
            });
            int j = 0;
            int sl = 1;
            for (int i = 1; i < n; i++) {
                if (listJob[i].batdau >= listJob[j].ketthuc) {
                    j = i;
                    sl++;
                }
            }

            System.out.println(sl);
        }
    }

}
