


import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class main2 {
    static public ArrayList<Equipment> Equipment=new ArrayList<>() ;
   
   

     public ArrayList<Equipment> getEquipment() {
        return Equipment;
    }

     public void setEquipment(ArrayList<Equipment> e) {
        this.Equipment = e;
    }   
    static public void addEquipment(Equipment e)
    {
        Equipment.add(e);
    }
   static public void removeEquipment(Equipment e)
    {
    Equipment.remove(e);
    }
}
