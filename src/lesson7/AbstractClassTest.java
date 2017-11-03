package lesson7;

public class AbstractClassTest {

    abstract static class Person{
        private String name;

        public Person(String name){this.name = name;}
        public final String getName(){return name;}

        public abstract int getId();
    }
    static class Student extends Person{
        private int id;
        public Student(String name, int id){
            super(name);//서브의 생성자는 슈퍼의 생성자를 무조건 호출해야함. 반드시 제일 처음 써줘야함. 아니면 에러.
            this.id=id;
            //아니면 public Peroson(){this.name="";} 부모의 생성자를 위에 쓰면 해결.
        }
        @Override
        public int getId() {
            return 0;
        }
    }
    static public void main(String[] args){
        Person p = new Person("hika"){

            @Override
            public int getId() {
                return 0;
            }
        };

    }
}
