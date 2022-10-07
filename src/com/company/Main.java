
public class Main {

    public static void main(String[] args) {
	Student student=new Student();
    student.setName("Anara");
    student.setSurnname("Almazova");
    student.setAge(29);
    student.setNumber(12345678);
    student.setNation("kyrgyz");
        System.out.println(student.getName());
        System.out.println(student.getSurnname());
        System.out.println(student.getAge());
        System.out.println(student.getNumber());
        System.out.println(student.getNation());

        Student student2=new Student();
        student2.setName("Aidai");
        student2.setSurnname("Murzabekova");
        student2.setAge(25);
        student2.setNumber(454545);
        student2.setNation("kyrgyz");
        System.out.println(student2.getName());
        System.out.println(student2.getSurnname());
        System.out.println(student2.getAge());
        System.out.println(student2.getNumber());
        System.out.println(student2.getNation());

        Student student3=new Student();
        student3.setName("Nurbek");
        student3.setSurnname("Asanov");
        student3.setAge(30);
        student3.setNumber(876543);
        student3.setNation("kyrgyz");
        System.out.println(student3.getName());
        System.out.println(student3.getSurnname());
        System.out.println(student3.getAge());
        System.out.println(student3.getNumber());
        System.out.println(student3.getNation());


    }
}
