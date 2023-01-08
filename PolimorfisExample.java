public class PolimorfisExample {
    public static void main(String[] args)
    {
        Person ref;
        Student student = new Student();
        Employee emp = new Employee();

        ref = student;
        String temp = ref.getName();
        System.out.println(temp);

        ref = emp;
        String temp1 = ref.getName();
        System.out.println(temp1);
    }
}
