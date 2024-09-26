class Hello {
    public static void main(String arg[]) {
        int x = 5;

int y = 10;

int z = (x++ > 5 && y-- < 10) ? x-- : y;
System.out.println(x,y,z);

    }
}