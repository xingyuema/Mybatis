import model.Bala;
import model.Person;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class UserTest {
    SqlSession sqlSession;
    /*
    @Test
    public void insertPerson(){
        sqlSession = MybatisUtil.getSqlSession();
        int id = 10000;
        String userName = "test";
        int age = 18;
        String mobilePhone = "18000000000";
        Person person = new Person();
        person.setId(id);
        person.setAge(age);
        person.setUserName(userName);
        person.setMobilePhone(mobilePhone);
        try{
            sqlSession.insert("insertPerson",person);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }
    */
    /*
    @Test
    public void queryById() {
        sqlSession = MybatisUtil.getSqlSession();
        int id = 20182241;
        try {
            Person person = sqlSession.selectOne("queryById", id);
            sqlSession.commit();
            System.out.println(person.getUserName());
            System.out.println(person.getAge());
            System.out.println(person.getMobilePhone());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }
    }
    public void queryById() {
        sqlSession = MybatisUtil.getSqlSession();
        int id = 20182241;
        try {
            Person person = sqlSession.selectOne("queryById", id);
            sqlSession.commit();
            System.out.println(person.getUserName());
            System.out.println(person.getAge());
            System.out.println(person.getMobilePhone());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }
    }

     */
    @Test
        public void query(){
            sqlSession = MybatisUtil.getSqlSession();
            try{
               // Person person = sqlSession.selectOne("query");
                List<Person> all = sqlSession.selectList("query");
                sqlSession.commit();
                ArrayList<Person> arrayList = new ArrayList<Person>();
                arrayList.addAll(all);
                for (int i = 0; i < arrayList.size(); i++) {
                    Person person = (Person) arrayList.get(i);
                    System.out.println(person.getUserName());
                    System.out.println(person.getAge());
                    System.out.println(person.getMobilePhone());
                    System.out.println("--------------------------------------");
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                MybatisUtil.closeSession(sqlSession);
            }
    }
    @Test
    public void queryBala(){
        sqlSession = MybatisUtil.getSqlSession();
        try{
            // Person person = sqlSession.selectOne("query");
            List<Bala> all = sqlSession.selectList("queryBala");
            sqlSession.commit();
            ArrayList<Bala> arrayList = new ArrayList<Bala>();
            arrayList.addAll(all);
            for (int i = 0; i < arrayList.size(); i++) {
                Bala bala = (Bala) arrayList.get(i);
                System.out.println(bala.getId());
                System.out.println(bala.getName());
                System.out.println("--------------------------------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MybatisUtil.closeSession(sqlSession);
        }
    }
    /*
    @Test
    public void delete(){
        sqlSession  = MybatisUtil.getSqlSession();
        try{
            int id = 10000;
            sqlSession.delete("deletePerson" ,id);
            sqlSession.commit();
            System.out.println("删除成功！！！");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }

     */
}
