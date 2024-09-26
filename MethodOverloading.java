class Calculator
{
    int n1 = 100;
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public double add(double n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
}

class MethodOverloading
{
    public static void main(String a[])
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(1,2,3);
        int r2 = obj.add(1,2);
        double r3 = obj.add(1.22,2,3);

        System.out.println("r1 = "+r1+ "\nr2 = "+r2+"\nr3 = "+r3);
    }

}
