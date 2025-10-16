package lang;

// NotExistDexception, WrongPasswordException
// (컴파일 단계에서 체크)
public class LoginEx {
    public static void main(String[] args) {

        try {
            login("white", "12345");
            // login("blue", "54321");
        } catch (NotExistDexception | WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static void login(String id, String password) throws NotExistDexception, WrongPasswordException {
        // id가 blue가 아니라면 NotExistDexception 발생
        if (!id.equals("blue")) {
            throw new NotExistDexception("id를 확인해주세요");

        }

        // password 가 "12345"가 아니라면 WrongPasswordException 발생
        if (!password.equals("12345")) {
            throw new WrongPasswordException("password를 확인해주세요");
        }
    }
}
