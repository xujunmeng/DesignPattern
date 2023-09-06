package 责任链模式.实例四升级版V2;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain chain) ;

}
