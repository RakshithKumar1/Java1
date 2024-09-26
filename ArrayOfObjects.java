class Student
{
    int age;
    String name;
    int marks;
}

class ArrayOfObjects
{
    public static void main(String a[])
    {
        Student s1 = new Student();
        s1.age = 15;
        s1.name = "Rakshith";
        s1.marks = 90;

        Student s2 = new Student();
        s2.age = 20;
        s2.name = "Rakshu";
        s2.marks = 80;

        Student s3 = new Student();
        s3.age = 25;
        s3.name = "Rakshi";
        s3.marks = 70;

        Student stu[] = new Student[3];

        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        for(int i=0;i<stu.length;i++)
        {
            System.out.println(stu[i].name+" : "+stu[i].marks);
        }

        //using enhanced for loop or for each loop
        for(Student s : stu)
        {
            System.out.println(s.name+" "+s.marks);
        }
     }
}