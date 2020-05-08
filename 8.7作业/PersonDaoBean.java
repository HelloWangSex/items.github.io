package cooom.wang.item.exaple;

/**
 * @author Wang
 * @version 1.0
 * @date 2020/5/7  10:32
 * @create 2020-05
 */
public class PersonDaoBean implements PersonDao {

    //  实现 了 接口 ，重写了接口的方法
    public void save() {
        System.out.println("PersonObject/对象");
    }

}
