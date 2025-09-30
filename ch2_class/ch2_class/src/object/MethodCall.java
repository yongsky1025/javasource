package object;

public class MethodCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    // static은 저장이 된 뒤 메모리에 등록
    // int iv = 10;은 new가 들어가지 않아 메모리에 올라가지 않아 사용 불가
    static void staticMethod1() {
        MethodCall obj = new MethodCall();
        System.out.println(obj.iv);
        System.out.println(cv);
    }

    void instanceMethod1() {
        // static 변수 호출
        System.out.println(cv);
        // 인스턴스 변수 호출
        System.out.println(iv);
    }

    // staticMethod1();는
    static void staticMethod2() {

        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        MethodCall obj = new MethodCall();
        obj.instanceMethod1();
    }

    void instanceMethod2() {
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        instanceMethod1();
    }

}
