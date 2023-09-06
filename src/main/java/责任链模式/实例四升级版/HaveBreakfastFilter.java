package 责任链模式.实例四升级版;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class HaveBreakfastFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (preparationList.isHaveBreakfast()) {
            System.out.println("吃完早饭");
        }

        filterChain.doFilter(preparationList, filterChain);
    }

}
