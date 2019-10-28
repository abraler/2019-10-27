public class User {
    String name;
    String mobilphone;
    String officephone;

    public User(String name, String mobilphone, String officephone) {
        this.name = name;
        this.mobilphone = mobilphone;
        this.officephone = officephone;
    }

    @Override
    public String toString() {
        return "User{" +
                "姓名='" + name + '\'' +
                "手机号='" + mobilphone + '\'' +
                "办公室电话='" + officephone + '\'' +
                '}';
    }
}
