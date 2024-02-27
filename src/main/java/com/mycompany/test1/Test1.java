/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test1;

import java.util.Scanner;

/**
 *
 * @author ngodu
 */
public class Test1 {
    static  Scanner sc = new Scanner (System.in);
    private static int[] input(int n){
        int[] t= new int[n];
        System.out.print("nhap day so:");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        return t;
    }
    
    private static void output(int[] a){
        System.out.print("day so:");
        for (int i : a) {
            System.out.print(i+" ");
        }
    }    
    
    private static int sum(int... a){
        int t = 0;
        for(int i : a){
            t+=i;
        }
        return t;
    }
    
    private static void out(Book... b){
        for(Book book : b){
            System.out.println(book);
        }
    }
    
    public static void main(String[] args) {
        int[] a={9,4,12,54};
        System.out.println("so phan tu: "+a.length);
        System.out.print("cac phan tu:");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println("");
//        int n;
//        //nhap so phan tu 
//        int[] b;
//        System.out.print("n= ");
//        n= sc.nextInt();
//        b=input(n);
//        output(b);
//        System.out.println("tong cua array a:"+sum(a));
          out(new Book(1,"su that"), new Book(2,"Ngay ha noi"), new Book(3, "Lap trinh huong doi tuong"));
        
    }   
}
