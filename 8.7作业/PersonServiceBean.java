package cooom.wang.item.exaple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang
 * @version 1.0
 * @date 2020/5/7  10:36
 * @create 2020-05
 */
public class PersonServiceBean {
    PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cooom/wang/item/exaple/applicationContext.xml");
        PersonServiceBean personServiceBean = (PersonServiceBean) applicationContext.getBean("PersonServiceBean");
        personServiceBean.personDao.save();

    }
}
