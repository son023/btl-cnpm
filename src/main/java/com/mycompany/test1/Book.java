/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;

/**
 *
 * @author ngodu
 */
public class Book {
    private int ma;
    private String ten;


    public Book(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public String toString(){
        return ma+"\t"+ten;
    }
    
     
}
