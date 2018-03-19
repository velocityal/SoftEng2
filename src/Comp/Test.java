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
        int count = 1;
        int size = 999;
        int math = 0;
        String comments[] = new String[size];
        char operator = 0;
        
        
        

        
      //  System.out.println( ("   m   ").trim());
        
        Scanner scan = new Scanner(System.in);
        String temp = "No Comments";
        comments[0] = temp;
        
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
            else if(Pattern.matches("^int.*",input))            
            {
               // System.out.println("has int");
                
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
           else if(Pattern.matches("symbol table",input))            
                {
                //System.out.println("has String");
                
                for(int chars = 'a'; chars <= 'z'; chars++)
                    {
                    if(chrInput[chars] >= 'a')
                        {
                        System.out.println( (char)chars +" = " + chrInput[chars]);
                        }           
                    }
                }
            
           else if(Pattern.matches("^\\*.*",input))

            {
                
                comments[count] = input;
                    
                count++;

            }            
                
           else if(Pattern.matches("comments",input))

            {
                int line = 1;
                if(comments[1] != null)
                {
                    System.out.println("Comments: ");  
                    
                
                    do
                    {
                        
                        System.out.println(comments[line]);
                        line++;
                    }while(comments[line] != null);
                    
                }
                else
                {
                    System.out.println(comments[0]);
                }
            }
           else if(Pattern.matches("^[a-z]\\ .*",input))
           {
                String arth;
                Pattern numbers;
                Pattern check;
                char tempNum = 0;
                char ans = 0;
                System.out.println("~~~~~~~~~~~~~");
                numbers = Pattern.compile("^[\\w*]");
                Matcher a = numbers.matcher(input);
                while (a.find())
                {
                    ans =  a.group().trim().charAt(0);
                }
                check = Pattern.compile("[\\+\\-[\\*]\\/]");
                Matcher c = check.matcher(input);
                
                

                while (c.find())
                {

                   operator = c.group().charAt(0);
                }
                                String lastNum;
                switch(operator)
                {
                    case'+':
                          {
                                lastNum = input.substring(input.indexOf("+")+1);
                                tempNum = lastNum.trim().charAt(0);
                              
                              System.out.println(intInput[ans]+intInput[tempNum]);
                              break;
                          }
                    case'-':
                          {
                                lastNum = input.substring(input.indexOf("-")+1);
                                tempNum = lastNum.trim().charAt(0);
                              
                              System.out.println(intInput[ans]-intInput[tempNum]);
                              break;
                          }  
                    case'*':
                          {
                              lastNum = input.substring(input.indexOf("*")+1);
                              tempNum = lastNum.trim().charAt(0);
                              
                              System.out.println(intInput[ans]*intInput[tempNum]);
                              break;
                          }
                    case'/':
                          {
                              lastNum = input.substring(input.indexOf("/")+1);
                              tempNum = lastNum.trim().charAt(0);
                              
                              System.out.println(intInput[ans]/intInput[tempNum]);
                              break;
                          }
                }
           }

           else if(Pattern.matches("^\\d.*",input)) 
            {
                
                String arth;
                Pattern numbers;
                Pattern check;
                int tempNum = 0;
                int ans = 0;
                System.out.println("~~~~~~~~~~~~~");
                numbers = Pattern.compile("^[\\d*]");
                Matcher a = numbers.matcher(input);
                while (a.find())
                {
                    ans = Integer.parseInt( a.group().trim());
                }
                check = Pattern.compile("[\\+\\-\\*\\/]");
                Matcher c = check.matcher(input);
                
                

                while (c.find())
                {

                   operator = c.group().charAt(0);
                }
                
                //String bit = input.substring(input.indexOf("+")+1);
                //tempNum = Integer.parseInt(bit.trim());
                String lastNum;
                switch(operator)
                {
                    case'+':
                          {
                                lastNum = input.substring(input.indexOf("+")+1);
                                tempNum = Integer.parseInt(lastNum.trim());
                              
                              System.out.println(ans+tempNum);
                              break;
                          }
                    case'-':
                          {
                                lastNum = input.substring(input.indexOf("-")+1);
                                tempNum = Integer.parseInt(lastNum.trim());
                              System.out.println(ans-tempNum);
                              break;
                          }  
                    case'*':
                          {
                              lastNum = input.substring(input.indexOf("*")+1);
                              tempNum = Integer.parseInt(lastNum.trim());
                              System.out.println(ans*tempNum);
                              break;
                          }
                    case'/':
                          {
                              lastNum = input.substring(input.indexOf("/")+1);
                              tempNum = Integer.parseInt(lastNum.trim());
                              System.out.println(ans/tempNum);
                              break;
                          }
                }
                

                    
                   
            
            
            }
            
           else if(Pattern.matches("^(display?).*",input))
            {
                String arg = null;
                String fDsp = "";
                String sDsp = "";
                String strDsp = "";
                int fNum = 0;
                Pattern p;
                p = Pattern.compile("(?<=display\\s)....*");
                Matcher m = p.matcher (input);
                while (m.find())
                {
                    
                   arg = m.group();
                } 
                
                if(Pattern.matches("^int.*",arg))
                {
                    String bit = input.substring(input.indexOf("t")+1);    
                    fNum = bit.trim().charAt(0);
                    fDsp = Integer.toString(intInput[fNum]);
                    arg = input.substring(input.indexOf("+")+1);
                    arg = arg.trim();

                }
                else if(Pattern.matches("^char.*",arg))
                {
                    String bit = input.substring(input.indexOf("r")+1);    
                    fNum = bit.trim().charAt(0);
                    fDsp = Character.toString(chrInput[fNum]);
                    arg = input.substring(input.indexOf("+")+1);
                    arg = arg.trim();
                }     
                
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
                if(Pattern.matches("^\\\".+\\\"",arg))
                {
                    String bit = input.substring(input.indexOf("\""));    
                    strDsp = bit.trim();
                    
                    //arg = arg.substring(input.indexOf("+")+1);
                    //arg = arg.trim();
                }
                else
                {
                    System.out.println("error");
                }
                System.out.println(fDsp + sDsp + strDsp);
            }
            else
            {
                System.out.println("error");
            }
            
            
            
        }while(Pattern.matches("^end", input) == false);
        
            String bit = input.substring(input.indexOf("y")+1);    
            value = bit.trim().charAt(0);
        
        System.out.println("test");   
    //char test = scan.next().charAt(0);

            
        System.out.println("result int: " + intInput[value]);
        
        }
    
    }


   class Qoute {
    private static Pattern pd = Pattern.compile("(\")((?:[^\"]|\"\")*)\"");
    private static Pattern ps = Pattern.compile("(')((?:[^']|'')*)'");
    public static Matcher match(String s) {
        Matcher md = pd.matcher(s);
        if (md.matches()) return md;
        else return ps.matcher(s);
    }
}


//***  unused patterns. might use later
  //  if(Pattern.matches("^(display?)(.*)",input)) asd         

