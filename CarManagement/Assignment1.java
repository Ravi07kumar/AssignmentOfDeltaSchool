
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Assignment1 {

    public static void main(String sb[]) {
        
        int num;
        ArrayList<Customer> list = new ArrayList<Customer>();
       // ArrayList<Car> list1 = new ArrayList<Car>();
       
        
        int[] randam;

        Scanner obj = new Scanner(System.in);

        do {
            
                    System.out.println("Select  1 :for Add New Customer  2 : for Add Car details To existing Customer "
                    + "3 :Show all Customer Deatils sorted By Name  4:"
                    + "  Search indiviual ById 5: Random Number 0: for Exit ");
                    num = obj.nextInt();
                    switch (num) {
                         case 1:
                                 // call customer class and add value
                             
                                 list.add(new Customer());
                                 break;
                           
                         case 2:
                                 // call Car class and add value
                                 int counter=0;
                                 Scanner obj1=new Scanner(System.in);
                                 System.out.println("Enter Id Of Customer:");
                                 int x=obj1.nextInt();
                                 for(int i=0;i<list.size();i++)
                                {
                                        if (list.get(i).getId() == x)
                                                {
                                                    Customer customer=list.get(i);
                                                    ArrayList<Car> listOfCars=  customer.getCarList();
                                                    listOfCars.add(new Car());
                                                    customer.setCarList(listOfCars);
                                                    System.out.println("car count"+listOfCars.size());
                                                    counter++;
                                                 }
                                } if(counter==0)
                                            {
                                            System.out.println("Id is Not Exist Need To Add New Customer.");
                                            }
                                break;
                         
                         
                         case 3:
                     
                                // show the all Customer sorted by name
                              
                                Collections.sort(list);
                                for (int i = 0; i < list.size(); i++) 
                                {
                                    System.out.println("Customer Id : " + list.get(i).getId() + " Name : "
                                    + list.get(i).getName() );
                                for(Car carDetail : list.get(i).getCarList())
                                {
                                 System.out.println("Car Name: "+carDetail.getCarName()+" Car Type : "+carDetail.getCarType()+" Car Price: "+carDetail.getPrice());
                                 }
                                 } break;
                         case 4:
                                 // Search the Customer By Id
                             
                                    SearchById search = new SearchById();
                                    for (int i = 0; i < list.size(); i++)
                                    {
                                        int x1 = search.getCusId();
                                        if (list.get(i).getId() == x1)
                                        {
                                            System.out.println(" Name : "
                                            + list.get(i).getName());
                                             for(Car carDetail : list.get(i).getCarList()){
                                           System.out.println("Car Name  "+carDetail.getCarName());
                                           }
                                         }
                                    }break;
                    
           
              
                        case 5:
                                  // here user Randon to distubute prize
                    
                                    Random random = new Random();
                                    RandomNumber r = new RandomNumber();
                                    randam = new int[6];
                                    for (int i = 0; i < 6; i++) 
                                    {
                                        int index = random.nextInt(list.size());
                                         randam[i] = list.get(index).getId();
                                     }
                                   for (int i = 0; i < 6; i++) 
                                    {
                                        if (randam[i] == r.num1) {
                                        System.out.println("Id : " + randam[i] + " price Winner");
                                        break;
                                        }
                                        else if (randam[i] == r.num2) {
                                        System.out.println("Id : " + randam[i] + " price Winner");
                                          break;
                                        }
                                        else  if (randam[i] == r.num3) {
                                        System.out.println("Id : " + randam[i] + " price Winner");
                                          break;
                                        }
                                    }break;
                    }

                 } while (num != 0);
    }

}

class Customer implements Comparable< Customer> {

    public int id;
    public String name;
    public ArrayList<Car> carList;

    Customer() {
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter ID, Name");
        id = obj1.nextInt();
        name = obj2.next();
        this.carList = new ArrayList<Car>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> CarList) {
        this.carList = CarList;
    }
    

    public int compareTo(Customer o) {
        //sort the arraylist by class object
        int compareInt = this.name.compareTo(o.name);
        if (compareInt < 0) {
            return -1;//return this.Name is bigger
        }
        if (compareInt > 0) {
            return 1;//return other.Name is bigger
        }
        return 0;//return they are equal
    }
    

}

class Car  extends Price{

//  public int CarId;
    public String CarType;
    public String CarName;
  
    Scanner obj1 = new Scanner(System.in);
    Scanner obj2 = new Scanner(System.in);

   public Car() {
        System.out.println("Enter CarType( press Toyota: 1, Maruti: 2,hyundai: 3 ),CarName, CarPrice");
        //CarId = obj1.nextInt();
        
        CarType = obj2.next();
        CarName = obj2.next();
        
        //this.price = obj1.nextDouble();
        setPrice(obj1.nextDouble());
        
    
    }


    public String getCarType() {
        return CarType;
    }

    public String getCarName() {
        return CarName;
    }


 }

class SearchById {

    public int cusId;

    public SearchById() {
        System.out.println("Enter Id Of Customer");
        Scanner obj = new Scanner(System.in);
        cusId = obj.nextInt();
    }

    public int getCusId() {
        return cusId;
    }

}



class RandomNumber {

    public int num1;
    public int num2;
    public int num3;

    public RandomNumber() {
        System.out.println("Enter 3 random No as id:");
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }
    }

 abstract class Price{
    
    double price;

    public Price() {
    }

    public double getPrice() {
        return price*80/100;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    


} 
