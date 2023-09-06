package 责任链模式.实例四升级版V2;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class GrantFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("GrantFilter entry...") ;
        chain.doFilter(request, response, chain) ;
        System.out.println("GrantFilter over...") ;
    }

}
