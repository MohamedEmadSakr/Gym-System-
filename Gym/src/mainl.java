

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class mainl {
    static public ArrayList<trainer> Trainer=new ArrayList<>() ;
   
   

     public ArrayList<trainer> getTrainer() {
        return Trainer;
    }

     public void setTrainer(ArrayList<trainer> e) {
        this.Trainer = e;
    }   
    static public void addtrainer(trainer e)
    {
        Trainer.add(e);
    }
   static public void removetrainer(trainer e)
    {
    Trainer.remove(e);
    }
}
    //////////////////////////////////////////////////////////////////////
    
    