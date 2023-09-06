package 责任链模式.实例四升级版V2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class FilterChain implements Filter{

    private List<Filter> filters = new ArrayList<>() ;

    private int position = 0 ;

    public void doFilter(Request request, Response response, FilterChain chain) {
        if (position > filters.size() - 1) {
            return ;
        }
        Filter filter = filters.get(this.position++) ;
        filter.doFilter(request, response, this) ;
    }

    // 构建需要调用的Filter链
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter) ;
        return this ;
    }
}
