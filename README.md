# OOPINJAVA

Task 1 
    Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables‐a part number(type String),a part description(type String),a quantity of the item being purchased (type int) and a price per item  (double). Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoice Amount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.
Task 2
    Create a class called Employee that includes three pieces of information as instance variables— a first name (typeString), a last name (typeString) and a monthly salary (double). Your class should have a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.
Task 3 
    Create a class called Date that includes three pieces of information as instance variables — a month (typeint), a day (typeint) and a year (typeint). Your class should have a constructor that initializes the three instance variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. Provide a method displayDate that displays the month, day and year separated by forward slashes(/). Write a test application named DateTest that demonstrates classDate’s capabilities.
Task 4
    a. Create a super class called Car. The Car class has the following fields and methods.
    int speed;
    double regularPrice;
    String color;
    double getSalePrice();
    b. Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
    int weight;
    double getSalePrice();
    c. Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
    int year;
    int manufacturerDiscount;
    double getSalePrice();
    d. Create a subclass of Car class and name it as Sedan. The Sedan class has the following fields and methods.
    int length;
    double getSalePrice();
    e. Create MyOwnAutoShop class which contains the main() method. Perform the following within the main()
    method.
    Create an instance of Sedan class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the superclass.
    Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the super class.
    Create an instance of Car class and initialize all the fields with appropriate values.
    Display the sale prices of all instance.
Task 5
      public abstract class Cake{
      protected String name;
      protected double rate;
      public Cake (String n, double r){
          name = n;
          rate = r;
      }
      public abstract double calcPrice();public String toString(){
          return name + “\t” + rate;
      }
    }
    Based on class Cake and the following table, define TWO (2) subclasses named as orderCake and readymadeCake.

               OrderCake : Attribute (Weight kg), Price Calculate (rate * Weight)
               ReadyMadeCake : Attribute (Quantity), Price Calculate (rate * Quantity)

       2. By using classes definition from a), write an application program that will:
    declare an array of 20 cake objects;
    input data for cake objects and store them into the array;
    display the total price for all types of cakes;
    display the total price and the quantity sold for ready made cakes;
    display the information for the cake that has been sold for the highest price.
Task 6 
    The following are the superclass Bank and its subclasses Saving and Current.
    Super class : Bank
    public class Bank {
      String accNo; //customer account number with Bank
      String custName; //customer name
      int custGender; //customer gender –  1 = Male, 2 =Female
      String custJob; //customer job position
      double curBal; //customer balance in the bank account
      public String toString();
      public abstract double calcBalance();
    }

    Subclass : Saving 
    public class Saving {
      double savRate; //percent interest rate per year
    }

    Subclass : Current 
    public class Current{
      boolean fixedDep; //whether the customer keeps the fixed
                               // deposit with the bank of not
      double curRate; //percent interest rate per year
    }

    The above classes show that Bank can have two different types of account which are Saving and Current account. The balance amount in the bank for each account is based on the following calculation :
    Saving :
                Balance = current balance + (savRate * current balance)
    Current :
                Balance = current balance + (curRate * current balance)
    If the customer has a fixed deposit with the bank, then the bank will charge RM150 for the service fee. The amount will be deducted automatically yearly.

    Write a method of calcBalance() for both subclasses
    Search a customer based on account number enter and display information of him/her. If the customer account is not found, display appropriate message.
    Count how many customer that have the concurrent account with bank and the total balance
    
