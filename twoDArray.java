class twoDArray
{
    public static void main(String a[])
    {
        int arr[][] = new int[3][4];

        // assigning random values to array
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j] = (int)(Math.random()*100);
            }
        }

        // printing the array values
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //using enhanced loop
        for(int n[] : arr)
        {
            for(int m:n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        } 
    }
}