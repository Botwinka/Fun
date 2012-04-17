/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Fun {
    Scanner s;
    PrintWriter outputStream;
    //InputStreamReader inp;   //reads the user's input.
    BufferedReader reader;      //buffers the user's input to make it work more efficiently.
    String plikread;
    String pliktxt;
    String txt;
    public Fun()
    {
        reader = new BufferedReader(new InputStreamReader(System.in));
        
    }
        
    public void readfile() throws IOException
    {
        System.out.println("Jaki plik chcesz wczytac?");
        try{
            //plikread = reader.readLine();
            readShapesFromFile("fun.txt");
        }
        catch(IOException e){
            System.out.println("Nie udalo sie wczytac pliku " + plikread);
        }
        finally{
            
        }
               
    }
    
    public void readShapesFromFile(String fileName) throws IOException
    {
        DataOutputStream outt = null;
        DataInputStream inn = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader(fileName)));      //w zadaniu bylo split a ja uzylam scanner jaka roznica?
            //outputStream = new PrintWriter(new FileWriter("funnn.txt"));
            outt = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("output.txt")));
            inn = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
            
            inn.
            while(pliktxt = inn.read(b) !=null)
            {
                    //System.out.println(s.next());
                    outt.writeUTF(s.next());
            }
        }
        finally{
            if(outt!=null)
                outt.close();
        }
        try
        {
            try{
                while(true)
                {
                    
                    txt=inn.readUTF();
                    System.out.println(txt);
                }
            }
            catch(EOFException e){}
            finally
            {
                if(inn!=null)
                {
                    inn.close();
                }
            } 
        }
        catch(EOFException e){}
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            if(outt!=null)
            {
                outt.close();
            }
            
        } 
    }
            
            
            
       
   
    
    
    public static void main(String[] args) throws IOException {
        Fun run = new Fun();
        run.readfile();
    }
}
