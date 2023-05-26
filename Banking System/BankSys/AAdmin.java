
package BankSys;


public class AAdmin 
{
    private int id;
    private  String name;
    private String ss;
    public void update_new_customer_setter(String pp,int idd,String n)
     {
       this.id=idd;
       this.name=n;
       this.ss=pp;
       
     }
    public int update_new_customer_getter()
     {
     return id;
     }
    public String update_new_customer_getter1()
     {
     return name;
     }
     public String  update_new_customer_getter2()
     {
     return ss;
     }
    
}
