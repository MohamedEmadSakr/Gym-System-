/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class project extends Application {
    Scene home,Customers,Equipment,trainer ,menu;
    Stage window;
   mainl mer=new mainl();
    trainer tr;
     main2 main=new main2();
    Equipment eq;
    @Override
    public void start(Stage primaryStage) {
       
         window=primaryStage;
         
         
         //Scene_Login Page
            
         Text we=new Text("Welcome Gym System"); 
      Text username=new Text("Username"); 
        Text password=new Text("Password"); 
        
        Button log = new Button("Login");
        
      TextField user=new TextField();
         PasswordField pass=new PasswordField();
        
          
         Text message=new Text();
        GridPane grid5=new GridPane();
        grid5.setHgap(10);
        grid5.setVgap(10);
        grid5.setAlignment(Pos.CENTER);
        grid5.setPadding(new Insets(20,20,20,20));
        Scene login = new Scene(grid5,1000,700);
        grid5.add(we, 0, 0);
        grid5.add(username, 0, 1);
        grid5.add(password, 0, 2);
        
        grid5.add(user, 1, 1);
        grid5.add(pass, 1, 2);
        
        grid5.add(log, 2, 3);
        
        
          log.setOnAction((ActionEvent e) -> {
              if((user.getText().equals("GYM")) &&( pass.getText().equals("GYM"))){
             window.setTitle("Gym System");
             window.setScene(home);
             window.show();  }
              else
              {  message.setText("Wrong Username and Password"); 
                        grid5.add(message,3, 3);}
           
   
        });
          
    
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(login);
        primaryStage.show();
       
        //Scene_Home 
       
        Button btn1 = new Button("Menu");
        Button btn2 = new Button("Equipments ");
        Button btn3 = new Button("Customers");
        Button btn4 = new Button("Trainer");
         Button back = new Button("Back");
         
        GridPane grid1 = new  GridPane();
        grid1.setHgap(10);
        grid1.setVgap(10);
        grid1.add(btn1, 0, 0);
        grid1.add(btn3, 0, 1);
        grid1.add(btn2, 0, 2);
        grid1.add(btn4, 0, 3);
        grid1.add(back, 1, 4);

        grid1.setAlignment(Pos.CENTER);
        grid1.setPadding(new Insets(20,20,20,20));
        
        home=new Scene(grid1,1000,700);
         btn1.setOnAction((ActionEvent e) -> {
    window.setTitle("Menu Page");
        window.setScene(menu);
        window.show();
   
        });
         
         btn2.setOnAction((ActionEvent e) -> {
 window.setTitle("Equipment Page");
     window.setScene(Equipment);
   window.show();
   
        });
         
          btn3.setOnAction((ActionEvent e) -> {
    window.setTitle("Customers Page");
     window.setScene(Customers);
   window.show();
   
        });
          
          btn4.setOnAction(e-> {  
              window.setTitle("Trainer Page");
          window.setScene(trainer);
          window.show();
          });
            back.setOnAction((ActionEvent e) -> {
    window.setTitle("Login Page");
        window.setScene(login);
        window.show();
   
        });

          
       //Scene_1  *Menu page*
         Button back1 = new Button();
         back1.setText("Back");
         TextArea data =new TextArea();
        GridPane grid2=new GridPane();
        grid2.setHgap(10);
        grid2.setVgap(10);
        grid2.setAlignment(Pos.CENTER);
        grid2.setPadding(new Insets(10,10,10,10));
        grid2.add(data, 0, 0);
        grid2.add(back1, 1, 1);
         data.appendText("Category:  Premium"+"   "+"Price:  1540"+"  "+"Number of Sessions: 6 Days per Week."+"\n"+
                "Category:  Gold"+"\t"+"   Price:  1300"+"  "+"Number of Sessions: 5 Days per Week.  "+"\n"+
                 "Category:  Silver"+"\t"+"   Price:  900"+"  "+" Number of Sessions: 4 Days per Week.  "+"\n"+
                 "Category:  Bronze"+"\t"+"   Price:  700"+"  "+" Number of Sessions: 3 Days per Week.   ");
           
         
         menu=new Scene(grid2,1000,700);
          
          back1.setOnAction((ActionEvent e) -> {
    window.setTitle("Gym System");
     window.setScene(home);
    window.show();
   
        });
          
//         Equipment();
//         
//        Customer(); 
   
    trainl();
      
    
 

    /**
     * @param args the command line arguments
     */
    }
    public static void main(String[] args) {
        launch(args);
    }

      //Scene_3  *customer page*
    public void Customer(){
      Text Id=new Text("ID");  //int type
        Text Name=new Text("Name");
        Text Address=new Text("Address");
        Text Gender=new Text("Gender");
         Text Age=new Text("Age");
        Text catego=new Text("Categries");
         Text weigt=new Text("Weight");
          Text heigt=new Text("Height");
         
        TextField id=new TextField();
         TextField name=new TextField();
          TextField address=new TextField();
            TextField age=new TextField();
              TextField weight=new TextField();
          TextField height=new TextField();
              
          TextArea list =new TextArea();
          String cate[]={"Premium","Gold","Silver","Bronze"};
         ComboBox comb=new ComboBox(FXCollections.observableArrayList(cate));
            String items[]={"Male","Female"};
            
         ComboBox comgend=new ComboBox(FXCollections.observableArrayList(items));
         Button back4 = new Button("Back");
         Button add4 =new Button("Add");
         Button show4 =new Button("Show Schedule");
         
        GridPane grid4=new GridPane();
        grid4.setHgap(10);
        grid4.setVgap(10);
        grid4.setAlignment(Pos.CENTER);
        grid4.setPadding(new Insets(20,20,20,20));
        grid4.add(Id, 0, 0);
        grid4.add(Name, 0, 1);
        grid4.add(Address, 0, 2);
        grid4.add(Gender, 0, 3);
        grid4.add(Age, 0, 4);
        grid4.add(heigt, 0, 7);
        grid4.add(weigt, 0, 6);
        grid4.add(catego,0,5);
        
        grid4.add(comgend,1,3);
        grid4.add(comb,1,5);
        grid4.add(id, 1, 0);
        grid4.add(name, 1, 1);
        grid4.add(address, 1, 2);
        grid4.add(weight, 1, 6);
        grid4.add(height, 1, 7);
        grid4.add(age, 1, 4);
        grid4.add(back4, 4, 7);
        grid4.add(add4,2 ,7);
        grid4.add(show4, 3, 7);
        grid4.add(list, 1, 8);
        Customers=new Scene(grid4,1000,700);
        
        show4.setOnAction((ActionEvent e) -> {
     if (comb.getValue() == "Premium"){
         list.clear();
        list.appendText("Sat:   6:00 PM "+"\n"+"Sun:   10:00 AM"+"\n"+"Mon:   9:00 AM"+"\n"+
                "Tue:   3:00 PM "+"\n"+"Wed:   1:00 PM "+"\n"+"Thu:   10:00 AM ");
           

     }
     else if (comb.getValue() == "Gold"){
            list.clear();
            list.appendText("Sun:   5:00 PM"+"\n"+"Mon:   3:00 PM"+"\n"+
                "Tue:   3:00 PM "+"\n"+"Wed:   3:00 PM "+"\n"+"Thu:   1:00 PM ");

        
     }
     
          else if (comb.getValue() == "Silver"){
                 list.clear();
           list.appendText("Sat:   3:00 PM "+"\n"+"Mon:   12:00 PM"+"\n"+
                "Tue:   3:00 PM "+"\n"+"Thu:   5:00 PM ");

          }
         else if (comb.getValue() == "Bronze"){
             list.clear();
          list.appendText("Sat:   8:00 AM "+"\n"+"Mon:   6:00 PM"+"\n"+
              "Wed:   6:00 PM "+"\n ");}
        
        });
        
        back4.setOnAction((ActionEvent e) -> {
        window.setTitle("Gym System");
    window.setScene(home);
    window.show();
   
        });
    
    add4.setOnAction((ActionEvent e) -> {

   
        });}
    
    //scene4 *Trainer page*
     public void trainl()
        {
            
           
            
           Text Id2=new Text("ID");  //int type
        Text Name2=new Text("Name");
         Text Email2=new Text("email");
        Text Address2=new Text("Address");
        Text Phone2=new Text("phone");
        Text Payment2=new Text("payment");
        
        Label lbl=new Label();
        
        
        TextField id2=new TextField();
         TextField name2=new TextField();
         TextField email2=new TextField();
          TextField address2=new TextField();
          TextField phone2=new TextField();
          TextField payment2=new TextField();
          
          
          
         Button back5 = new Button("Back");
         Button add5 =new Button("add");
         Button delete5 =new Button("delete");
         Button update=new Button("update");
         Button show5 =new Button("show");
         
        GridPane grid5=new GridPane();
        grid5.setHgap(10);
        grid5.setVgap(10);
        grid5.setAlignment(Pos.CENTER);
        grid5.setPadding(new Insets(10,10,10,10));
        
        grid5.add(Id2, 0, 0);
        grid5.add(Name2, 0, 1);
        grid5.add(Email2, 0, 2);
        grid5.add(Address2, 0, 3);
        grid5.add(Phone2, 0, 4);
        grid5.add(Payment2, 0, 5);
        
        grid5.add(id2, 1, 0);
        grid5.add(name2, 1, 1);
        grid5.add(email2, 1, 2);
        grid5.add(address2, 1, 3);
         grid5.add(phone2, 1, 4);
        grid5.add(payment2, 1, 5);
        
      
        grid5.add(add5, 0, 6);        
        grid5.add(back5, 1, 6);
        grid5.add(delete5, 2, 6); 
        grid5.add(update, 3, 6);
        grid5.add(lbl,0,7);
        grid5.add(show5, 4, 6);
         ////////////////////////////////////////////////////////
         
            ListView<trainer> trainview =new ListView<>();
         VBox vbox =new VBox();
         vbox.getChildren().add(trainview);
       
        
         
         
            BorderPane root=new BorderPane();
         root.setCenter(grid5);
         root.setLeft(vbox);
      
           trainer=new Scene(root,400,400);
           
           
                      
                               
                
         add5.setOnAction(e->{
             
         int idtrain=Integer.parseInt(id2.getText());
         String nametrain=name2.getText();
         String emailtrain=email2.getText();
         String addresstrain=address2.getText();
         int phonetrain=Integer.parseInt(phone2.getText());
         double paymetrain=Double.parseDouble(payment2.getText());
         
          tr=new trainer(idtrain,nametrain,emailtrain,addresstrain,phonetrain,paymetrain);
           
         mer.addtrainer(tr);     
       fileOperation.writetrain(tr);
        lbl.setText("Done");
        
       
 
        ////////////////////////////////////////////////////////////////////
         
        id2.setText("");
        name2.setText("");
        email2.setText("");
         address2.setText("");
          phone2.setText("");
          payment2.setText("");
         
       
         });
         
         ///////////////////////////////////////////////////////////////////////////////////  
         
         delete5.setOnAction(e->{  
              trainer train2=trainview.getSelectionModel().getSelectedItem();
        if(train2!=null)
        {
        trainview.getItems().remove(train2);
        Iterator<trainer> iterator=mer.getTrainer().iterator();
        trainer psd=iterator.next();
        if(psd.getName().equals(train2.getName()))
        {iterator.remove();}
        }
              
         mer.removetrainer(train2);
               try {
                   fileOperation.removetrain();
                   
               } catch (IOException ex) {
                   Logger.getLogger(project.class.getName()).log(Level.SEVERE, null, ex);
               }

            });
  ///////////////////////////////////////////////////////////////////////////////////       
         
           update.setOnAction(e->{
               
           trainer train2=trainview.getSelectionModel().getSelectedItem();
        /*if(train2!=null)
        {
        trainview.getItems().remove(train2);
        Iterator<trainer> iterator=mer.getTrainer().iterator();
        trainer psd=iterator.next();
        if(psd.getName().equals(train2.getName()))
        {iterator.remove();}
        }
              
         mer.removetrainer(train2);
         try {
                   fileOperation.updatetrain();
               } catch (IOException ex) {
                   Logger.getLogger(project.class.getName()).log(Level.SEVERE, null, ex);
               }*/
         
        int idtrain1=Integer.parseInt(id2.getText());
         String nametrain1=name2.getText();
         String emailtrain1=email2.getText();
         String addresstrain1=address2.getText();
         int phonetrain1=Integer.parseInt(phone2.getText());
         double paymetrain1=Double.parseDouble(payment2.getText());
        
        
         
         train2.setId(idtrain1);
         train2.setName(nametrain1);
         train2.setEmail(emailtrain1);
         train2.setAddress(addresstrain1);
         train2.setPhone(phonetrain1);
         train2.setPayment(paymetrain1);
         
        id2.setText(train2.getId()+"");
            name2.setText(train2.getName());
            email2.setText(train2.getEmail());
            address2.setText(train2.getAddress());
            phone2.setText(nametrain1+"");
            payment2.setText(train2.getPayment()+"");
               
              
        id2.setText("");
        name2.setText("");
        email2.setText("");
         address2.setText("");
          phone2.setText("");
          payment2.setText("");
          
           
 
           });
           
           
           
         /////////////////////////////////////////////////////////////////
         
         
          trainview.getSelectionModel().selectedItemProperty().addListener(e->{
              

trainer train1=trainview.getSelectionModel().getSelectedItem();
                    id2.setText(train1.getId()+"");
          name2.setText(train1.getName());
          email2.setText(train1.getEmail()+"");
          address2.setText(train1.getAddress()+"");
          phone2.setText(train1.getPhone()+"");
          payment2.setText(train1.getPayment()+"");
          //lis2.appendText(mer.getTrainer().toString());
                        
//                      for(int i=0;i<mer.getTrainer().size();i++)
//             {
//             lis2.appendText("ID: "+tr.getId()+
//             "\nName: "+tr.getName()+
//             "\nEmail: "+tr.getEmail()+
//             "\nAddress: "+tr.getAddress()+
//             "\nPhone: "+tr.getPhone()+
//             "\nPayment"+tr.getPayment()
//             );
//              }
          
          
          
                  });
          
          show5.setOnAction(e->{
               
                fileOperation.readtrainer();
          //lis2.appendText(mer.getTrainer().toString());
            for(trainer lm: mer.getTrainer())
         {
         trainview.getItems().add(lm);
         }          
          });
          
          
        back5.setOnAction((ActionEvent e) -> {
    
    window.setScene(home);
    window.show();
   
        });
        
       
        
        }
     
      //scene4 *Equipments page*
    public void Equipmentl(){   
         Button back2 = new Button();
        back2.setText("Back");
        
//         Button save = new Button();
//        save.setText("Save");
        
        Button plus1 = new Button();
        plus1.setText("+"); 
        Button minus1 = new Button();
        minus1.setText("-");
        
        Button plus2 = new Button();
        plus2.setText("+"); 
        Button minus2 = new Button();
        minus2.setText("-");
        
        Button plus3 = new Button();
        plus3.setText("+"); 
        Button minus3 = new Button();
        minus3.setText("-");
        
        Button plus4 = new Button();
        plus4.setText("+"); 
        Button minus4 = new Button();
        minus4.setText("-");
        
        Button plus5 = new Button();
        plus5.setText("+"); 
        Button minus5 = new Button();
        minus5.setText("-");
        
        Button plus6 = new Button();
        plus6.setText("+"); 
        Button minus6 = new Button();
        minus6.setText("-");
        
        Button plus7 = new Button();
        plus7.setText("+"); 
        Button minus7 = new Button();
        minus7.setText("-");
        
        Button plus8 = new Button();
        plus8.setText("+"); 
        Button minus8 = new Button();
        minus7.setText("-");
        
         Text treadmill=new Text("TreadMill");
         Text Stationary_bike=new Text("StationaryBike");
         Text stempmill =new Text("StepMill");
         Text flatbench =new Text("FlatBench");
         Text abs_machine =new Text("AbsMachine");
         Text leg_machine =new Text("LegMachine");
         Text Dumbell =new Text(" Dumbell");
         Text Barbell=new Text("Barbell");
        
        TextField tread=new TextField("0");
         TextField bike=new TextField("0");
          TextField step=new TextField("0");
           TextField flat=new TextField("0");
            TextField abs=new TextField("0");
             TextField leg=new TextField("0");
              TextField dumbell=new TextField("0");
               TextField barbell=new TextField("0");
               Text error=new Text();
               
        
        GridPane grid3=new GridPane();
        grid3.setHgap(10);
        grid3.setVgap(10);
        grid3.setAlignment(Pos.CENTER);
        grid3.setPadding(new Insets(20,20,20,20));
        
        grid3.add(treadmill, 0, 0);
        grid3.add(Stationary_bike, 0, 1);
        grid3.add(stempmill, 0, 2);
        grid3.add(flatbench, 0, 3);
        grid3.add(abs_machine, 0, 4);
        grid3.add(leg_machine, 0, 5);
        grid3.add(Dumbell,0,6);
        grid3.add(Barbell,0,7);
        
        grid3.add(tread, 3, 0);
        grid3.add(plus1, 2, 0);
        grid3.add(minus1, 4, 0);
        
        grid3.add(bike, 3, 1);
        grid3.add(plus2, 2, 1);
        grid3.add(minus2, 4, 1);
        
        grid3.add(step, 3, 2);
        grid3.add(plus3, 2, 2);
        grid3.add(minus3, 4, 2);
        
        grid3.add(flat, 3, 3);
        grid3.add(plus4, 2, 3);
        grid3.add(minus4, 4, 3);
        
        grid3.add(abs, 3, 4);
        grid3.add(plus5, 2, 4);
        grid3.add(minus5, 4, 4);
        
        grid3.add(leg, 3, 5);
        grid3.add(plus6, 2, 5);
        grid3.add(minus6, 4, 5);
        
        grid3.add(dumbell, 3, 6);
        grid3.add(plus7, 2, 6);
        grid3.add(minus7, 4, 6);
        
        grid3.add(barbell, 3, 7);
        grid3.add(plus8, 2, 7);
        grid3.add(minus8, 4, 7);
        
//        grid3.add(save,5,10);
        grid3.add(back2,6,10);
        Equipment=new Scene(grid3,1000,700);
          
         
         back2.setOnAction((ActionEvent e) -> {
              window.setTitle("Gym System");
     window.setScene(home);
   window.show();
   
        });
    
         
             plus1.setOnAction(new EventHandler<ActionEvent>() {
                  Integer num=0;
                    @Override
                    public void handle(ActionEvent t) {
                       
                       if(tread.getText()!=null)
                       {
                         num=Integer.parseInt(tread.getText());
                 num++;
                             
                  tread.setText(num.toString());
                   error.setText("");
                   grid3.add(error, 5, 0);
                    }
                    
                    else
                    {
                    num++;
                       tread.setText(num.toString());
                        error.setText("");
                        grid3.add(error, 5, 0);
                    }
             }
                     });
              
        minus1.setOnAction(new EventHandler<ActionEvent>() {
                Integer num;
                    @Override
                    public void handle(ActionEvent t) {
                            
                        if(Integer.parseInt(tread.getText())>0){
                           
                 num=Integer.parseInt(tread.getText());
                        num--; 
                 
                        
                  tread.setText(num.toString());}
                        else
                            error.setText("Minimum value is Zero"); 
                        grid3.add(error, 5, 0);
                         
                            
                    }
                  
                     });
                plus2.setOnAction(new EventHandler<ActionEvent>() {
                  Integer num=0;
                    @Override
                    public void handle(ActionEvent t) {
                       
                       if(bike.getText()!=null)
                       {
                         num=Integer.parseInt(bike.getText());
                 num++;
                             
                  bike.setText(num.toString());
                   error.setText("");
                   grid3.add(error, 5, 1);
                    }
                    
                    else
                    {
                    num++;
                       bike.setText(num.toString());
                        error.setText("");
                        grid3.add(error, 5, 1);
                    }
             }
                     });
              
        minus2.setOnAction(new EventHandler<ActionEvent>() {
                Integer num;
                    @Override
                    public void handle(ActionEvent t) {
                            
                        if(Integer.parseInt(bike.getText())>0){
                           
                 num=Integer.parseInt(bike.getText());
                        num--; 
                 
                        
                  bike.setText(num.toString());}
                        else
                            error.setText("Minimum value is Zero");  
                         grid3.add(error, 5, 1);
                            
                    }
                  
                     });
        
          plus3.setOnAction(new EventHandler<ActionEvent>() {
                  Integer num=0;
                    @Override
                    public void handle(ActionEvent t) {
                       
                       if(step.getText()!=null)
                       {
                         num=Integer.parseInt(step.getText());
                 num++;
                             
                  step.setText(num.toString());
                   error.setText("");
                   grid3.add(error, 5, 2);
                    }
                    
                    else
                    {
                    num++;
                       step.setText(num.toString());
                        error.setText("");
                        grid3.add(error, 5, 2);
                    }
             }
                     });
              
        minus3.setOnAction(new EventHandler<ActionEvent>() {
                Integer num;
                    @Override
                    public void handle(ActionEvent t) {
                            
                        if(Integer.parseInt(step.getText())>0){
                           
                 num=Integer.parseInt(step.getText());
                        num--; 
                 
                        
                  step.setText(num.toString());}
                        else
                            error.setText("Minimum value is Zero");
                        grid3.add(error, 5, 2);
                         
                            
                    }
                  
                     });
        
        
          plus4.setOnAction(new EventHandler<ActionEvent>() {
                  Integer num=0;
                    @Override
                    public void handle(ActionEvent t) {
                       
                       if(flat.getText()!=null)
                       {
                         num=Integer.parseInt(flat.getText());
                 num++;
                             
                  flat.setText(num.toString());
                   error.setText("");
                   grid3.add(error, 5, 3);
                    }
                    
                    else
                    {
                    num++;
                       flat.setText(num.toString());
                        error.setText("");
                        grid3.add(error, 5, 3);
                    }
             }
                     });
              
        minus4.setOnAction(new EventHandler<ActionEvent>() {
                Integer num;
                    @Override
                    public void handle(ActionEvent t) {
                            
                        if(Integer.parseInt(step.getText())>0){
                           
                 num=Integer.parseInt(step.getText());
                        num--; 
                 
                        
                  step.setText(num.toString());}
                        else
                            error.setText("Minimum value is Zero");  
                         grid3.add(error, 5, 3);
                            
                    }
                  
                     });
        
          plus5.setOnAction(new EventHandler<ActionEvent>() {
                  Integer num=0;
                    @Override
                    public void handle(ActionEvent t) {
                       
                       if(abs.getText()!=null)
                       {
                         num=Integer.parseInt(abs.getText());
                 num++;
                             
                  abs.setText(num.toString());
                   error.setText("");
                   grid3.add(error, 5, 4);
                    }
                    
                    else
                    {
                    num++;
                       abs.setText(num.toString());
                        error.setText("");
                        grid3.add(error, 5, 4);
                    }
             }
                     });
              
        minus5.setOnAction(new EventHandler<ActionEvent>() {
                Integer num;
                    @Override
                    public void handle(ActionEvent t) {
                            
                        if(Integer.parseInt(abs.getText())>0){
                           
                 num=Integer.parseInt(abs.getText());
                        num--; 
                 
                        
                  abs.setText(num.toString());}
                        else
                            error.setText("Minimum value is Zero");  
                        grid3.add(error, 5, 4);
                         
                    }
                     });
        
          plus6.setOnAction(new EventHandler<ActionEvent>() {
                  Integer num=0;
                    @Override
                    public void handle(ActionEvent t) {
                       
                       if(leg.getText()!=null)
                       {
                         num=Integer.parseInt(leg.getText());
                 num++;
                             
                  leg.setText(num.toString());
                   error.setText("");
                   grid3.add(error, 5, 5);
                    }
                    
                    else
                    {
                    num++;
                       leg.setText(num.toString());
                        error.setText("");
                        grid3.add(error, 5, 5);
                    }
             }
                     });
              
        minus6.setOnAction(new EventHandler<ActionEvent>() {
                Integer num;
                    @Override
                    public void handle(ActionEvent t) {
                            
                        if(Integer.parseInt(leg.getText())>0){
                           
                 num=Integer.parseInt(leg.getText());
                        num--; 
                 
                        
                  leg.setText(num.toString());}
                        else
                            error.setText("Minimum value is Zero");
                        grid3.add(error, 5, 5);
                    }
                     });
        
        
          plus7.setOnAction(new EventHandler<ActionEvent>() {
                  Integer num=0;
                    @Override
                    public void handle(ActionEvent t) {
                       
                       if(dumbell.getText()!=null)
                       {
                         num=Integer.parseInt(dumbell.getText());
                 num++;
                             
                  dumbell.setText(num.toString());
                   error.setText("");
                   grid3.add(error, 5, 6);
                    }
                    
                    else
                    {
                    num++;
                       dumbell.setText(num.toString());
                        error.setText("");
                        grid3.add(error, 5, 6);
                    }
             }
                     });
              
        minus7.setOnAction(new EventHandler<ActionEvent>() {
                Integer num;
                    @Override
                    public void handle(ActionEvent t) {
                            
                        if(Integer.parseInt(dumbell.getText())>0){
                           
                 num=Integer.parseInt(dumbell.getText());
                        num--; 
                 
                        
                  dumbell.setText(num.toString());}
                        else
                            error.setText("Minimum value is Zero"); 
                        grid3.add(error, 5, 6);
                    }
                     });
        
        
          plus8.setOnAction(new EventHandler<ActionEvent>() {
                  Integer num=0;
                    @Override
                    public void handle(ActionEvent t) {
                       
                       if(barbell.getText()!=null)
                       {
                         num=Integer.parseInt(barbell.getText());
                 num++;
                             
                  barbell.setText(num.toString());
                   error.setText("");
                   grid3.add(error, 5, 7);
                    }
                    
                    else
                    {
                    num++;
                       barbell.setText(num.toString());
                        error.setText("");
                        grid3.add(error, 5, 7);
                    }
             }
                     });
              
        minus8.setOnAction(new EventHandler<ActionEvent>() {
                Integer num;
                    @Override
                    public void handle(ActionEvent t) {
                            
                        if(Integer.parseInt(barbell.getText())>0){
                           
                 num=Integer.parseInt(barbell.getText());
                        num--; 
                 
                        
                  barbell.setText(num.toString());}
                        else
                            error.setText("Minimum value is Zero");  
                        grid3.add(error, 5, 7);
                         
                    }
                     });
        
//        save.setOnAction(e->{ 
//         int treadmill1=Integer.parseInt(tread.getText());
//         int bike1=Integer.parseInt(bike.getText());
//         int stepmill=Integer.parseInt(step.getText());
//         int flat1=Integer.parseInt(flat.getText());
//         int ABS=Integer.parseInt(abs.getText());
//         int lm=Integer.parseInt(leg.getText());
//         int dbell=Integer.parseInt(dumbell.getText());
//         int bar=Integer.parseInt(barbell.getText());
//         
//          eq=new Equipment(treadmill1,bike1,stepmill,flat1,ABS,lm,dbell,bar);
//         main.addEquipment(eq);     
//        fileOperation.writeEquipments(eq);
//        
//                TextArea list =new TextArea();
//             
//                        fileOperation.readtrainer();
//
//               list.appendText(mer.getTrainer().toString()); 
//                    });
         
  }

}