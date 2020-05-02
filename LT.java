package TH_AccessModifier;

public class LT {
    //Luyện tập private public default proteced

    // private AccessModifiler Chỉ có thể truy cập trong lớp
    static class A{
        private int data=40;
        private void msg(){
            System.out.println("Hello Java");
        }
    }
    public static class Simple{
        public static void main(String[] args) {
            A obj =new A();
            System.out.println();
            obj.msg();
        }

    }
}
