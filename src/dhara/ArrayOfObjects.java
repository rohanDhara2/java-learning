package dhara;
class Student
{
    int roll;
    String name;

}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rihan";
        s1.roll = 33 ;

        Student s2 = new Student();
        s2.name = "Gohan";
        s2.roll = 23;

        Student s3 = new Student();
        s3.name = "Mohan";
        s3.roll = 13 ;

        Student[] students = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name+" \t "+students[i].roll);
        }

//        for (Student s:students)
//        {
//            System.out.println(s.name+" : "+s.roll);
//        }

    }
}
