package pro14.sec01.ex02;

public class MemberBean {
    String id;
    String pwd;
    String name;
    String email;

    Address Addr;

    public MemberBean() {
    }

    public MemberBean(String id, String pwd, String name, String email) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
    }

    public Address getAddr() {
        return Addr;
    }

    public void setAddr(Address addr) {
        Addr = addr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
