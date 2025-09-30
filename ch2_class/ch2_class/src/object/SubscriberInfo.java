package object;

public class SubscriberInfo {
    // 가입자 정보
    // 이름, 아이디, 비밀번호, 전화번호

    // 기능 : 비밀번호 변경, 전화번호 변경
    // changePassword(변경할 비밀번호)
    // changePhone(변경할 전화번호)

    private String name;
    private String id;
    private String password;
    private String phone;

    // public SubscriberInfo(String name, String id, String password, String phone)
    // {
    // this.name = name;
    // this.id = id;
    // this.password = password;
    // this.phone = phone;
    // }

    // 패스워드 변경
    String changePassword(String password) {
        return this.password = password;
    }

    // 전화번호 변경
    String changePhone(String phone) {
        return this.phone = phone;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 변경 명령과 동일하기에 생략
    // public void setPassword(String password) {
    // this.password = password;
    // }

    // public void setPhone(String phone) {
    // this.phone = phone;
    // }

    // getter
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    // toString() : 필드(멤버변수)가 가지고 있는 값
    @Override
    public String toString() {
        return "SubscriberInfo [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone + "]";
    }

}
