public class person {
    private int id;
    private String name;
    private String email;
    private String address;
   public person(){
       
   }
  
 public person(int id,String name,String email,String address)
    {
    this.id=id;
    this.name=name;
    this.email=email;
    this.address=address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
     @Override
     public String toString()
     {
     return "\n "+id+" "+name+" "+email+" "+address;
     }}
