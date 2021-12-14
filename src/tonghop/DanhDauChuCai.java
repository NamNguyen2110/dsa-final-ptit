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
public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(scn.next().chars().distinct().count());
    }
}
