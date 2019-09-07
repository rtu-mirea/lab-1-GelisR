public class helloworld {
    public static void main(String[] args){
        Student glad = new Student("Valera");
        Student denis = new Student("Deniska", 29);

        Student[] students={glad, denis};

        for (int i=0; i<students.length;i++){
            System.out.println(students[i]);
        }
    }

    class Student{
        public String name;
        public int age;
        public boolean isAlive;

        public Student(String name){
            this.name =name;
            age = 54;
            isAlive = true;
        }

        public Student(String name, int age){
            this.name =name;
            this.age = age;
            isAlive = false;
        }

        public String toString(){
            return isAlive
                    ? name+","+age+"y.o"
                    : name + "ban";
        }
    }
}