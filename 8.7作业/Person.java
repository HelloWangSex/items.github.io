package cooom.wang.item.exaple;

/**
 * @author Wang
 * @version 1.0
 * @date 2020/5/7  10:31
 * @create 2020-05
 */
public class Person {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
