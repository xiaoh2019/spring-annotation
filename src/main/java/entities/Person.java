package entities;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author xiaoH
 * @create 2019-04-24-15:03
 */
public class Person {

    /**
     * @Value 里面1.基本数组
     *           2.spel表达式 #{}
     *           3.${}
     */
    @Value("${person.name}")
    private String name;

    @Value("20")
    private Integer age;

    @Value("${person.nickName}")
    private String nickName;

    public void init(){
        System.out.println("person....我被初始化了");
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
