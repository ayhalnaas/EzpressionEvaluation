public class Q7 {
    private String name ;

    public Q7(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Q7{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Q7 stu1 = new Q7("Ayh");
        Q7 stu2 =new Q7("Basmala");
        Q7[] student =new Q7[2];
        student[0]=stu1;
        student[1]=stu2;
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);

        }

    }
}
