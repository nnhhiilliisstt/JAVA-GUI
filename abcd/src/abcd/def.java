/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcd;

import java.util.Scanner;
import arduino.Arduino;
import java.util.*;

public class def{
    public static void main(String[]args)
    {             
        int i=0;
                Scanner sc = new Scanner(System.in);
			Arduino a = new Arduino();
			a.setPortDescription("COM3");
			a.openConnection();
		   System.out.println(a.serialRead());
			    System.out.println("hii");
			    System.out.println(a.serialRead());
                            System.out.println("Could not find COM port.");
                            a.serialWrite(sc.nextLine()); 
                            i++;	
			a.closeConnection();
    }	
}
