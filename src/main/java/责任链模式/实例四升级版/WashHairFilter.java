package 责任链模式.实例四升级版;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class WashHairFilter implements StudyPrepareFilter{

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {

        if (preparationList.isWashHair()) {
            System.out.println("洗完头发");
        }

        filterChain.doFilter(preparationList, filterChain);

    }
}
