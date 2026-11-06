public class Shoes{

//class blur prints for the things we want to make

    //instance variables
//todo: make the three comments into a variable. Think about the data type

    public String shoecolor;
    //is  there filling
    public boolean isnike;
    //how ment donuts
    public int shoesize;
    public int randomnumber2;



    //making a constructor of donuts-name of constructor has to be the name of the class
    //has to fallow the name of the java class
    //dont write void
    public Shoes(int pshoesize, String pshoecolor, boolean pisnike){//makes parameters
        shoesize= pshoesize;
        shoecolor=pshoecolor;
        isnike=pisnike;


    }//end of constructor
    public void printInfo(){//makes the outline for print info so it can be changed for eahc order
        System.out.println("a "+shoecolor+" shoe");
        System.out.println("is it nike:"+isnike);
        System.out.println("and the shoe size is "+shoesize);



    }

    //todo make a method called addshoe
    public void addshoe(){


    }
    //todo make a method called change forsting type
    //todo give the method a parameter called new forsting type
    public void changeshoecolor(String newshoecolor){//makes a new shoe color
        shoecolor=newshoecolor;


    }

}//end of class donuts
