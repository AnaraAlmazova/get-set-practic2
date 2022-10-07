public class Student {
    private String name;
    private String surnname;
    private int age;
    private int number;
    private String nation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnname() {
        return surnname;
    }

    public void setSurnname(String surnname) {
        this.surnname = surnname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<80){
        this.age = age;
    }else{
            System.out.println("studenttin jashy 80 ge cheyin");
        } }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
