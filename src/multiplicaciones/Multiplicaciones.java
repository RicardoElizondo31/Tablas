/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author rick_
 */
public class Multiplicaciones {

    public static int multiplicar(int n, int i,int res){
	if(i<=10){
            res=res+n;
            System.out.println(n+"x"+i+"="+n);            
            return multiplicar(n,i+1,res);
        }
	return n;
}
    public static void main(String[] args) {
        int res=0;
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a multiplicar"));
        int i=1;
        multiplicar(n,i,res);
    }
    
}
