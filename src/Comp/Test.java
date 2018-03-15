/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Comp;



import java.util.*;
import java.util.regex.*;
/**
 *
 * @author burds
 */
public class Test {
    

  
    public static void main(String[] args) {
        int[] intInput = new int[256];
        char[] chrInput = new char[256];
        char index = 0;
        char value;
        String input = null;
        String strInput = null;
        int numvalue = 0;
        
      //  System.out.println( ("   m   ").trim());
        
        Scanner scan = new Scanner(System.in);
        
        
        do
        {
            
            
           input = scan.nextLine();
            //input = "char b = i";
            if(Pattern.matches("^char.*",input))
            {
           //     System.out.println("has char");
                Pattern p;
                p = Pattern.compile("(?<=char\\s).*");
                Matcher m = p.matcher (input);
                
               //final Matcher m = Pattern.compile("?<([...]*\\=[...]).*").matcher(input);
                
             /*  if(m.find())
                {
                    String test = m.group().toString();
                    System.out.println(test);
                }*/
                
                boolean found = false;
            while (m.find())
            {
 //   System.out.println("I found the text: " + m.group().toString());
                index = m.group().charAt(0);
    
                found = true;
    
 //      chrInput[index] = 'b';
 //  char test = scan.next().charAt(0);
 //   System.out.println(chrInput[test]);
    

            }

            if (!found)
            {
                System.out.println("I didn't find the text");
            }

            String bit = input.substring(input.indexOf("=")+1);    
            value = bit.trim().charAt(0);
            //    p = Pattern.compile("(?<=[=]).*");
            //    p.matcher (input);
                
              //  System.out.println(value);
                
        //        found = false;
            while (m.find())
            {
            //  System.out.println("I found the text: " + m.group().toString());
             // char value = m.group().toString().charAt(0);
    
             // found = true;
    
      
    

            }
        chrInput[index] = value;
 

            }
                if(Pattern.matches("^int.*",input))            
            {
                System.out.println("has int");
                
                Pattern p;
                p = Pattern.compile("(?<=int\\s).*");
                Matcher m = p.matcher (input);
                
               //final Matcher m = Pattern.compile("?<([...]*\\=[...]).*").matcher(input);
                
             /*  if(m.find())
                {
                    String test = m.group().toString();
                    System.out.println(test);
                }*/
                
                boolean found = false;
            while (m.find())
            {
 //   System.out.println("I found the text: " + m.group().toString());
                index = m.group().charAt(0);
    
                found = true;
    
 //      chrInput[index] = 'b';
 //  char test = scan.next().charAt(0);
 //   System.out.println(chrInput[test]);
    

            }

            if (!found)
            {
                System.out.println("I didn't find the text");
            }

            String bit = input.substring(input.indexOf("=")+1);    
             numvalue = Integer.parseInt( bit.trim());
            //    p = Pattern.compile("(?<=[=]).*");
            //    p.matcher (input);
                
              //  System.out.println(value);
                
        //        found = false;
            while (m.find())
            {
            //  System.out.println("I found the text: " + m.group().toString());
             // char value = m.group().toString().charAt(0);
    
             // found = true;
    
      
    

            }
        intInput[index] = numvalue;
 

            }
            if(Pattern.matches("^\\.*String\\.*",input))            
            {
                System.out.println("has String");
            }
        }while(Pattern.matches("^(display?)(.*)", input) == false);
        
            String bit = input.substring(input.indexOf("y")+1);    
            value = bit.trim().charAt(0);
        
        System.out.println("test");   
    //char test = scan.next().charAt(0);
    System.out.println("result " + chrInput[value]);
        System.out.println("result int: " + intInput[value]);
        
        }
    
    }


   



    

