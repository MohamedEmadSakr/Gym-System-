
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class fileOperation {
    static public void readtrainer()
    {
        try {
            Scanner sc=new Scanner(new File("‪trainer.txt"));
            while (sc.hasNextLine()) {
       int id=sc.nextInt();
     String name=sc.next();
     String email=sc.next();
     String address=sc.next();
     int phone=sc.nextInt();
     double payment=sc.nextDouble();
     
            trainer tr=new trainer(id, name, email, address, phone, payment);
            mainl.addtrainer(tr);
                
            }       
        } catch (FileNotFoundException ex) {
//           ex.printStackTrace();
 Logger.getLogger(fileOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static public void writetrain(trainer tr)
    {

        try {
             FileWriter fr=new FileWriter(new File("‪trainer.txt"),true);
            BufferedWriter br =new BufferedWriter(fr);
            
            br.write("\n"+tr.getId()+" "+tr.getName()+" "+tr.getEmail()+" "+tr.getAddress()+" "+tr.getPhone()+" "+tr.getPayment());
            br.close();
            
        } catch (IOException ex) {
            Logger.getLogger(fileOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
     static public  void updatetrain() throws IOException {
        mainl mer =new mainl();
                
        try {
            FileWriter fr = new FileWriter(new File("trainer.txt"),true);
         BufferedWriter br =new BufferedWriter(fr);
         
         for(trainer tr: mer.getTrainer())
         {
         br.write("\n"+tr.getId()+" "+tr.getName()+" "+tr.getEmail()+" "+tr.getAddress()+" "+tr.getPhone()+" "+tr.getPayment());
         }
         
         br.close();
         
        } catch (IOException ex) {
            Logger.getLogger(fileOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

}
     
     
     
     
     static public void removetrain() throws IOException
    { mainl mer =new mainl();
    File file;
     file = new File("trainer.txt");
   /* if(file.exists()){
        
        file.delete();
    }*/
    FileWriter fw = null;
    BufferedWriter bw = null;
    
    try {
        fw = new FileWriter(file);
        bw = new BufferedWriter(fw);
        Iterator iterator;
        iterator = mer.getTrainer().iterator();
        while (iterator.hasNext()) {
            trainer tr;
            tr = (trainer) iterator.next();
           // bw.write(pd.helmer());
            
  bw.write("\n"+tr.getId()+" "+tr.getName()+" "+tr.getEmail()+" "+tr.getAddress()+" "+tr.getPhone()+" "+tr.getPayment());
         
            bw.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        bw.flush();
        bw.close();
    }

    }
   
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////  
    
    

    
   static public void Equipments()
    {
        try {
            Scanner sc=new Scanner(new File("‪D://d//o-op//project//Project_2//Equipment.txt"));
            while (sc.hasNextLine()) {
       int treadmill=sc.nextInt();
       int stationary_bike=sc.nextInt();
       int stempmill=sc.nextInt();
       int flatbench=sc.nextInt();
       int Abs_machine=sc.nextInt();
       int Leg_machine=sc.nextInt();
       int Dumbell=sc.nextInt();
       int Barbell=sc.nextInt();
     
           Equipment eq=new Equipment(treadmill,stationary_bike , stempmill, flatbench,
                   Abs_machine,Leg_machine,Dumbell, Barbell);
             main2.addEquipment(eq);
                
            }       
        } catch (FileNotFoundException ex) {

 Logger.getLogger(fileOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static public void writeEquipments(Equipment eq)
    {
        try {
            FileWriter fr=new FileWriter(new File("‪D://d//o-op//project//Project_2//Equipment.txt"),true);
            BufferedWriter br =new BufferedWriter(fr);
            br.write("\n"+"Treadmill"+eq.getTreadmill()+"\n "+ "StationaryBike"+eq.getStationary_bike()+"\n"+
                   "Stepmill"+eq.getStempmill()+"\n "+"Flatbench"+eq.getFlatbench()+"\n "
                    +"AbsMachine"+eq.getAbs_machine()+"\n "+"LegMachine"+eq.getLeg_machine()+"\n"+
                    "Dumbell"+eq.getDumbell()+"\n"+"Barbell"+eq.getBarbell());
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(fileOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
