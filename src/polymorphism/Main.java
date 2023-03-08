package polymorphism;

public class Main {
    public static void main(String[] args) {
        Hello hello= new HelloWorldKr();
        callMethod(hello);
    }

    private static void callMethod(Hello hello) {
        hello.SayHello();
    }
}
