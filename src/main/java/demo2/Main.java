/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo2;

/**
 *
 * @author ngodu
 */
public class Main {
    public static void main(String[] args) {
       String name = " To an An"; 
        System.out.println(name.charAt(1));//T
        System.out.println(name.trim().toUpperCase());
        String s1 = "Lao dong";
        String s2 = "lao dong";
        String s3 = "Lao dong la vinh quang";
        String s4 = "LAO dOng";
        System.out.println(s1.compareTo(s2));//-32
        System.out.println(s1.compareTo(s3));//-14
        System.out.println(s1.compareToIgnoreCase(s4));//0
        System.out.println(s1.equalsIgnoreCase(s4));//true
        System.out.println(s3.indexOf(s1));
        System.out.println(s3.indexOf(s2));
        String s5 = "Example  method  Split   a     Line    into         Words";
        String[] ss = s5.split("\\s+");
        for(String i:ss){
            System.out.println(i);
        }
        System.out.println("so tu: "+ ss.length);
        String s6 = s5.replaceAll("\\s+", " ");
        System.out.println(s6);
        System.out.println(s6.contains("a Line into"));//true
        System.out.println(s6.contains("a line into"));//true
        String hoten = "To an   An".trim();
        String ho = hoten.substring(0,hoten.indexOf(" "));
        String ten= hoten.substring(hoten.lastIndexOf(" "));
        System.out.println(ho);
        System.out.println(ten);
        String[] v= hoten.split("\\s+");
        System.out.println(v[0]);
        System.out.println(v[v.length-1]);
    }
    
    
}
