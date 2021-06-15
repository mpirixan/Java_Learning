/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bank.application;

/**
 *
 * @author mpirixan
 */
public class Calculus {

    public void addTwoInt(int a, int b) {
       int result = a + b;

        //returning summation of two values
        System.out.println(result);
    }

    public void subTwoInt(int a,int b){
        int result = a - b;
       System.out.println(result);
    }

    public void divTwoFloat(float a, float b){
        float result = a / b ;
        System.out.println(result);
    }

    public void modTwoFloat(float a, float b){
        float result = a % b ;
        System.out.println(result);
    }

}
