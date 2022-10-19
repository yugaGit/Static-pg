public class Customer{
       

    static  void fillform(String name,int age){
    System.out.println("Name= "+name+"\n"+"Age= "+age);
        //System.out.println()
    }
    static void fillform(String name,int age,long ph){
       System.out.println("name= "+name+"\n"+"Age= "+age+"\n"+"PhNo= "+ph);
    }
    public static void main(String[]ar){
        //Customer obj=new Customer();
        Customer.fillform("ram",22);
        Customer.fillform("mani",30,12345);

        }       

    }
  
    //eg for static 
    // in static we can call obj with the help of class name ,we no need to create the obj.
