/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

import java.util.Scanner;

/**
 *
 * @author lamhoangtung
 */
public class NewClass {
    public static void main(String[] args){
        float chieucao;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao dang cm: ");
        chieucao = sc.nextFloat();
        System.out.printf("Ban cao %f m.\n",chieucao/100);
    }
}