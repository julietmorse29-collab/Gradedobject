public class Factory {
    //instance
    public Shoes shoeorder1;
    public Shoes shoeorder2;
    public Shoes shoeorder3;
    public boolean isOpen=true;
    public int yearFounded=2026;
    public int RandomNumber;
    public int Randmun;


    //todo make a new donut called DonutsOrder2onlu do the mononilpy box creation not constructpr
    public static void main() {
        Factory f=new Factory();
    }

    public Factory(){

        RandomNumber= (int)(Math.random()*20)+1;//range1-20 shoe size
        Randmun= (int)(Math.random()*20)+1;//range1-30 shoe size

        System.out.println("Welcome to the factory");
        System.out.println("the factory was founded in ");
        System.out.println(yearFounded);
        System.out.println("it is " + isOpen+ " that the factory is open");//intro to the fatcory




        //make an object type of dounts
        shoeorder1= new Shoes(RandomNumber,"blue", true);//added stuff that is in the shoe order 1
        shoeorder1.shoesize=shoeorder1.shoesize+1;
       // System.out.println(shoeorder1.shoesize);
        shoeorder1.addshoe();
        System.out.println(shoeorder1.isnike);

        System.out.println("shoe order one comes with ");
        shoeorder1.printInfo();//what is in shoe order one


        //todo:print all of the instance varables
        //mkae seconf orderhvae a range of 1-45
        shoeorder2= new Shoes(RandomNumber, "grey",true);//adds stuff that is in hsoe order 2
       // shoeorder1.shoesize=shoeorder1.shoesize+2;
        //System.out.println(shoeorder2.shoesize);
        //System.out.println(shoeorder2.isnike);
        System.out.println("shoe order two comes with ");

        //donutOrder2.numOfDonuts=donutOrder1.numOfDonut*2

        //class->blue print
        //object->the house
        shoeorder2.changeshoecolor("black");
        shoeorder2.printInfo();//prints shoe order 2

        shoeorder3= new Shoes(Randmun, "grey",true);//adds stuff that is in hsoe order 3
        System.out.println("shoe order three comes with ");
        shoeorder3.printInfo();//prints shoe order 3







    }


}