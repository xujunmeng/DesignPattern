package 过滤器模式.类型;

import 过滤器模式.entity.Person;

import java.util.List;

/**
 * 标准
 * Created by james on 2018/7/19.
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
