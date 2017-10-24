import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebFilter(filterName = "MainFilter")
public class MainFilter implements Filter {
    private FilterConfig filterConfig;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String forbbiddenUrls = filterConfig.getInitParameter("forbiddenUrls");
        String allowedUrls[]=forbbiddenUrls.split(";");
        boolean allowed = !Arrays.asList(allowedUrls).contains(((HttpServletRequest)req).getServletPath());

        if (allowed) {
            chain.doFilter(req, resp);
        } else {
            ((HttpServletResponse) resp).setStatus(HttpServletResponse.SC_FORBIDDEN);
        }
    }

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = config;
    }

}
