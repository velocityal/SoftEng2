/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Comp;

/**
 *
 * @author burds
 */
public class Symbol {
    
    public static void main(String[] args) {
        for(char y = 'c'; y <= 'h'; y++){
    System.out.print(y);
    
    
    if(Pattern.matches("^int.*",arg))
                {
                    String bit = input.substring(input.indexOf("t")+1);    
                    fNum = bit.trim().charAt(0);
                    sDsp = Integer.toString(intInput[fNum]);
                    if(arg.substring(arg.indexOf("+")+1) != null)
                    {
                    arg = arg.substring(arg.indexOf("+")+1);
                    arg = arg.trim();
                    }
                }
                else if(Pattern.matches("^char.*",arg))
                {
                    String bit = input.substring(input.indexOf("r")+1);    
                    fNum = bit.trim().charAt(0);
                    sDsp = Character.toString(chrInput[fNum]);
                    if(arg.substring(arg.indexOf("+")+1) != null)
                    {
                    arg = arg.substring(arg.indexOf("+")+1);
                    arg = arg.trim();
                    }
                }
    
}
System.out.println();
    }
   
    
}
