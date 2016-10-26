
package test.io.pkg2;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestIo2 {

   
    public static void main(String[] args) {
        
        System.out.println("ahmed");
        System.out.println("ahmed");
        System.out.flush();
        System.out.println(System.out.checkError()); 
         File a = new File ("C:/Documents and Settings/ahmed samir/Desktop/El-Donia.Donitna.akoam.com.mp3");
        System.out.println(a.canRead()); 
        System.out.println(a.canWrite());
       Double s=a.length()/1024.0;
        System.out.println(s/1024);
        File newf = new File("C:/Documents and Settings/ahmed samir/Desktop/newf");
        try {
            newf.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(TestIo2.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        newf.delete();
       double e= newf.getFreeSpace()/ 1024;
       System.out.println(e/1024);
       System.out.println(newf.getParent());
       newf.mkdir();
       File mp3 = new File (newf,"mp3.mp3");
        try {
            mp3.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(TestIo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        mp3.renameTo(a);
        try {
            FileInputStream read = new FileInputStream(a);
            read.read();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestIo2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestIo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        byte[]buf= new byte [1024*1024];
        int write;
        try{
        FileInputStream fromfile = new FileInputStream (a);
        FileOutputStream tofile= new FileOutputStream(mp3);
        fromfile.read(buf);
        while((write=fromfile.read(buf))>0)
        {
            tofile.write(buf, 0, write);
        }
        fromfile.close();
        tofile.close();
        }
        catch (IOException q)
        {
            
        }
        
        File ahmed = new File ("C:/Documents and Settings/ahmed samir/Desktop/ahmed1");
        ahmed.mkdirs();
       // ahmed.renameTo( new File ("C:/Documents and Settings/ahmed samir/Desktop/ahmed2"));
        File song = new File ("C:/Documents and Settings/ahmed samir/Desktop/Jannat_Aiza.Araab.2016_MloK6rb.CoM/Jannat_Aiza.Araab.2016_MloK6rb.CoM/Jannat_100.Dalel.mp3");
        File janat2 = new File ("C:/Documents and Settings/ahmed samir/Desktop/ahmed2/","meetdaleel.mp3");
        try {
            janat2.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(TestIo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
        FileInputStream janat = new FileInputStream (song);
    
        
        
        
        
        
        
        System.out.println(janat.available()/(1024*1024));
        System.out.println(janat.markSupported());
        int readable;
        
        FileOutputStream janat2s = new FileOutputStream(janat2);
        byte buff []= new byte [1024*1024];
         while ((readable=janat.read(buff))>0)
                 {
                   janat2s.write(buff, 0, readable);
                 }
        janat2s.flush();
        janat2s.close();
        janat.close();
        
        } catch (IOException ex) {
            
        }
        
        File txt = new File ("C:/Documents and Settings/ahmed samir/Desktop/New Text Document (6).txt");
        try {
            FileInputStream txtu = new FileInputStream (txt);
            DataInputStream txtf=new DataInputStream (txtu);
           System.out.println(txtf.readLine());
            DataOutputStream mtxt = new DataOutputStream (new FileOutputStream (new File("C:/Documents and Settings/ahmed samir/Desktop/New Text Document (6).txt")) );
            mtxt.writeUTF(" ");
            mtxt.writeUTF(" i will fuck amal oneday");
            DataInputStream amal = new DataInputStream (new FileInputStream(new File ("C:/Documents and Settings/ahmed samir/Desktop/New Text Document (9).txt")));
//            System.out.println(amal.readDouble());
            System.out.println(amal.readLine());
             System.out.println(amal.readLine());
              System.out.println(amal.readLine());
              File txt2 = new  File ("C:/Documents and Settings/ahmed samir/Desktop/New Text Document (10).txt");
             FileInputStream txt2u = new FileInputStream (txt2); 
              BufferedInputStream txt2b = new BufferedInputStream (txt2u) ;
             
              DataInputStream txt2d = new DataInputStream (txt2b);
              txt2d.readLine();
              FileReader red = new FileReader (txt2);
              System.out.println(red.ready());
              BufferedReader red2 = new BufferedReader (red);
              System.out.println(red2.readLine());
              System.out.println(red2.readLine());
              LineNumberReader line = new LineNumberReader (red);
//              line.setLineNumber(1);
              LineNumberReader line2 = new LineNumberReader (red2);
              System.out.println(line2.readLine()); // third time to use this methode third line
              System.out.println(line2.getLineNumber());
              System.out.println(red2.markSupported());
              System.out.println(line.readLine());
              StringReader reader = new StringReader ("ahmed");
            char ss = (char)reader.read();
            System.out.println(ss);
        FileOutputStream xx = new FileOutputStream (txt2);
            OutputStreamWriter wr = new OutputStreamWriter (xx);
           wr.write(" teez amal gamda wa gasmha korbag wa kid shromota fe elsrrer da7ktha tkhle elnswan nafshem 3 wzeen yonkoha");
            System.out.println(wr.getEncoding());
            System.out.println(wr.toString());
            Integer x= 4;
            System.out.println(x.toString());
            /*
             conver any object to string
            make it as writer boject
            wrap it in printwriter object
            use printerwriter methods onit
            
            */
            System.out.println(x);
            System.out.println(wr);
            PrintWriter print = new PrintWriter (wr);
            print.write("ahmed samir ");
            
              
        } catch (IOException ex) {
            Logger.getLogger(TestIo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
