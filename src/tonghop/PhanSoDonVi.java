package tonghop;

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
public class PhanSoDonVi {

    static boolean ok = true;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            long ts = scn.nextLong();
            long ms = scn.nextLong();
            ok = true;
            tachTSMS(ts, ms);
            System.out.println("");
        }
    }

    private static void tachTSMS(long ts, long ms) {

        while (ok) {
            if (ms % ts == 0) {
                System.out.print("1/" + ms / ts);
                ok = false;
            } else {
                long n = ms / ts + 1;
                System.out.print("1/" + n + " + ");
                tachTSMS(ts * n - ms, ms * n);
            }
        }
    }
}
