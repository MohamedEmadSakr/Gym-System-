
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class trainer extends person{
    
    private int id;
    private String name;
    private String email;
    private String address;
    private int phone;
    private double payment;
   
    
    public trainer()
    {} 

  
 public trainer(int id,String name,String email,String address,int phone,double payment)
    {
    this.id=id;
    this.name=name;
    this.email=email;
    this.phone=phone;
    this.payment=payment;
    this.address=address;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String helmer()
            {
            
            return super.toString()+" "+phone+" "+payment;
            }
        @Override
     public String toString()
     {
     return "\nID: "+id+"\nName: "+name+"\nEmail: "+email+"\nPhone: "+phone+"\nAddress: "+address+"\nPayment: "+payment ;
     }}
