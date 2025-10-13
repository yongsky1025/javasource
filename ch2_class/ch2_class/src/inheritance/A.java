package inheritance;

public class A {

    public void methodA(I i) {// 의존
        i.methodB();
    }
}
