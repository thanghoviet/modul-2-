
class A {

    public boolean data;


    public void msg() {
        System.out.println("Hello java");
    }

    public class Simple {

        public void main(String args[]) {

            A obj = new A();

            System.out.println(obj.data);//Compile Time Error

            obj.msg();//Compile Time Error

        }
    }

}
