
package BankSys;
import BankSys.*;

public class Open_new_account {
    private int id;
    private  String name;
    private String address;
    private String account_type;
    public void update_new_customer_setter(int idd,String n,String ad,String t)
     {
       this.id=idd;
       this.name=n;
       this.account_type=t;
       this.address=ad;       
     }
  //  @Override
    public int update_new_customer_getter()
     {
     return id;
     }
   // @Override
    public String update_new_customer_getter1()
     {
     return name;
     }
    
}
