/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo3;

import java.util.Scanner;

/**
 *
 * @author ngodu
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma;
        String re = "(^B)\\d{2}DC[A-Z]{2}\\d{3}$";
        while(true){
            System.out.print("ma:");
            ma = sc.nextLine().toUpperCase();
            if(ma.matches(re)){
                break;
            }
            System.err.println("nhap lai!");
        }
        System.out.println("ma: " + ma);
        String hoten;
        re="[a-zA-Z ]+";
        while(true){
            System.out.print("ho va ten:");
            hoten = sc.nextLine();
            if(hoten.matches(re)){
                break;
            }
            System.err.println("nhap lai!");
        }
        System.out.println("ho ten:"+hoten);
        
    }
}
