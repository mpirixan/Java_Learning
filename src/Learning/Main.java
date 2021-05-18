/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning;
import javax.lang.model.type.NullType;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author mpirixan
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        Arrays arrays = new Arrays();
        System.out.print("Escolha o indice de quer acessar do char:");
        int indicechar = in.nextInt();
        System.out.print("Escolha o indice de quer acessar do int:");
        int indiceint = in.nextInt();

        arrays.charArray(indicechar);
        arrays.intArray(indiceint);
    }

}

