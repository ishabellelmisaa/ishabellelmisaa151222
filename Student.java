public class Student extends Person {
    public Student(){ 
        super ("Anna","Padang");
        System.out.println("Inside Student:Constructor"); 
    } 
    public static void main( String[] args ){ 
        Student anna = new Student(); 
        System.out.println(anna.name);
        System.out.println(anna.address);
    }
     public String getName(){ 
        System.out.println("getName Student");
        return name; 
    } 
}
