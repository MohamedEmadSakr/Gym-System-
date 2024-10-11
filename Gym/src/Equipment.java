public class Equipment {
   int treadmill=0;
    int Stationary_bike=0;
   int stempmill=0;
   int flatbench=0;
   int abs_machine=0;
   int leg_machine=0;
   int Dumbell=0;
   int Barbell=0;
   
    public Equipment(int treadmill,  int Stationary_bike, int stempmill,
            int flatbench, int abs_machine,int leg_machine,int Dumbell, int Barbell)
    {
    this.treadmill=treadmill;
    this.Stationary_bike=Stationary_bike;
    this.stempmill=stempmill;
    this.flatbench=flatbench;
    this. leg_machine=leg_machine;
    this.Dumbell=Dumbell;
    this. Barbell= Barbell;
    
    }

    public int getTreadmill() {
        return treadmill;
    }

    public void setTreadmill(int treadmill) {
        this.treadmill = treadmill;
    }

    public int getStempmill() {
        return stempmill;
    }

    public void setStempmill(int stempmill) {
        this.stempmill = stempmill;
    }

    public int getFlatbench() {
        return flatbench;
    }

    public void setFlatbench(int flatbench) {
        this.flatbench = flatbench;
    }

    public int getAbs_machine() {
        return abs_machine;
    }

    public void setAbs_machine(int abs_machine) {
        this.abs_machine = abs_machine;
    }

    public int getLeg_machine() {
        return leg_machine;
    }

    public void setLeg_machine(int leg_machine) {
        this.leg_machine = leg_machine;
    }

    public int getDumbell() {
        return Dumbell;
    }

    public void setDumbell(int Dumbell) {
        this.Dumbell = Dumbell;
    }

    public int getStationary_bike() {
        return Stationary_bike;
    }

    public void setStationary_bike(int Stationary_bike) {
        this.Stationary_bike = Stationary_bike;
    }

    public int getBarbell() {
        return Barbell;
    }

    public void setBarbell(int Barbell) {
        this.Barbell = Barbell;
    }
   public String Equipment(){
       return "Tread mill"+treadmill+"\n"+"Stationary_bike"+Stationary_bike+"\n"+
               "Step mill"+stempmill+"\n"+"Flatbench"+flatbench+"\n"+"Abs Machine"+
             abs_machine+"\n"+ "Leg Machine"+leg_machine+"\n"+"Dumbell"+Dumbell+"\n"+
               "Barbell"+Barbell+"\n";
   }
}
