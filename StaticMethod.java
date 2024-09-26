class Mobile
{
    String brand;
    int cost;
    static String name;

    public void showData() //non static method or instance method
    {
        System.out.println( brand +" : "+cost+ " : "+name);
    }
    static public void showData1(Mobile obj) //static method
    {
        System.out.println( obj.brand +" : "+obj.cost+ " : "+name);
    }
}

class StaticMethod
{
    public static void main(String a[])
    {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.cost = 19000;
        Mobile.name = "Smart Phone"; // calling static variable by class name

        Mobile m2 = new Mobile();
        m2.brand = "One Plus";
        m2.cost = 21000;
        m2.name = "Smart Phone";

        Mobile m3 = new Mobile();
        m3.brand = "Nokia";
        m3.cost = 29000;
        m3.name = "Smart Phone";

        m1.showData();
        m2.showData();
        m3.showData();

        System.out.println("Calling Static method");
        //calling static method
        Mobile.showData1(m1);
        Mobile.showData1(m2);
        Mobile.showData1(m3);


    }
}