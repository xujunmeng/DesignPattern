package 过滤器模式.类型;

import 过滤器模式.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author james
 * @date 2018/7/19
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
