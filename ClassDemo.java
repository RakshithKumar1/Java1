class Calculator{
    int r;
    public int add(int n1,int n2)
    {
        r = n1 + n2;
        return r;
    }
}

class ClassDemo
{
    public static void main(String a[])
    {
        int num1 = 5;
        int num2 = 2;

        Calculator calc = new Calculator();

        int result = calc.add(num1,num2);
        System.out.println(result);

    }
}