package 责任链模式.实例四升级版;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 注意这里多了一个FilterChain，也就是责任链，是用于串起所有的责任对象的，它也是StudyPrepareFilter的一个子类：
 *
 * 即这里有一个计数器，假设所有的StudyPrepareFilter没有调用完毕，那么调用下一个，否则执行Study的study()方法。
 *
 * 接着就比较简单了，实现StudyPrepareFilter类即可，首先还是洗头：
 *
 * @author xujunmeng
 * @date 2023/9/6
 */
public class FilterChain implements StudyPrepareFilter{

    private int pos = 0;

    private Study study;

    private List<StudyPrepareFilter> studyPrepareFilterList;

    public FilterChain(Study study) {
        this.study = study;
    }

    public void addFilter(StudyPrepareFilter studyPrepareFilter) {
        if (studyPrepareFilterList == null) {
            studyPrepareFilterList = new ArrayList<>();
        }

        studyPrepareFilterList.add(studyPrepareFilter);
    }

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        //所有过滤器执行完毕
        if (studyPrepareFilterList.size() == pos) {
            study.study();
        }

        pos = pos + 1;

        StudyPrepareFilter studyPrepareFilter = studyPrepareFilterList.get(pos);

        studyPrepareFilter.doFilter(preparationList, filterChain);

    }
}
