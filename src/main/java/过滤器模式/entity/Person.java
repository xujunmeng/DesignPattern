package 过滤器模式.entity;

/**
 * @author james
 * @date 2018/7/19
 */
public class Person {

    private String name;  //名字

    private String gender;  //性别

    private String maritalStatus;  //婚配状态

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }

}
