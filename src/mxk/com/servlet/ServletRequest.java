package mxk.com.servlet;

import mxk.com.util.IpUtil;
import sun.net.util.IPAddressUtil;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Locale;

/**
 * Created by 10056 on 2018/4/22.
 */
public class ServletRequest extends HttpServlet {

    /**
     * 返回客户端浏览器接收的文件类型
     *
     * @param accept
     * @return
     */
    private String getAccept(String accept) {
        String result = "";
        StringBuffer stringBuffer = new StringBuffer();
        if (accept.contains("image/gif")) {
            stringBuffer.append("GIF文件, ");
        }
        if (accept.contains("image/x-xbitmap")) {
            stringBuffer.append("BMP文件, ");
        }
        if (accept.contains("image/jpeg")) {
            stringBuffer.append("JPG文件， ");
        }
        if (accept.contains("application/vnd.ms-excel")) {
            stringBuffer.append("Excel文件， ");
        }
        if (accept.contains("application/vnd.ms-powerpoint")) {
            stringBuffer.append("PPT文件, ");
        }
        if (accept.contains("application/msword")) {
            stringBuffer.append("word文件");
        }
        result = stringBuffer.toString().replaceAll(", $", "");
        return result;
    }

    /**
     * 返回客户端语言环境名称
     *
     * @param locale
     * @return
     */
    private String getLocale(Locale locale) {
        String result = "";
        if (locale.equals(Locale.SIMPLIFIED_CHINESE)) {
            result = "简体中文";
        } else if (locale.equals(Locale.TRADITIONAL_CHINESE)) {
            result = "繁体中文";
        } else if (locale.equals(Locale.ENGLISH)) {
            result = "英文";
        } else if (locale.equals(Locale.JAPANESE)) {
            result = "日文";
        }
        return result;
    }

    /**
     * 返回ip地址对应的物理地址
     *
     * @param ip
     * @return
     */
    private String getAddress(String ip) {
        return IpUtil.getIpAddress(ip);
    }

    /**
     * 返回客户端操作系统
     *
     * @param userAgent
     * @return
     */
    private String getOS(String userAgent) {
        String result = "";
        if (userAgent.indexOf("Windowx NT 5.1") > 0) {
            result = "Windows XP";
        } else if (userAgent.indexOf("Windows 98") > 0) {
            result = "Windows 98";
        } else if (userAgent.indexOf("Windows NT 5.0") > 0) {
            result = "Windows 2000";
        } else if (userAgent.indexOf("Linux") > 0) {
            result = "Linux";
        } else if (userAgent.indexOf("Unix") > 0) {
            result = "Unix";
        } else {
            result = "未知";
        }
        return result;
    }

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws UnsupportedEncodingException {
        //设置request编码方式
        httpServletRequest.setCharacterEncoding("UTF-8");
        //设置response编码方式
        httpServletResponse.setCharacterEncoding("UTF-8");
        //设置文档类型为HTML类型
        httpServletResponse.setContentType("text/html");
        String authType = httpServletRequest.getAuthType();
        //本地ip，即服务器ip
        String localAddr = httpServletRequest.getLocalAddr();
        //本地名称，即服务器名称
        String localName = httpServletRequest.getLocalName();
        //本地端口号
        int localPort = httpServletRequest.getLocalPort();
        //用户的语言环境
        Locale locale = httpServletRequest.getLocale();
        //context路径
        String contextPath = httpServletRequest.getContextPath();
        //GET还是POST
        String method = httpServletRequest.getMethod();
        String pathInfo = httpServletRequest.getPathInfo();
        String pathTranslated = httpServletRequest.getPathTranslated();
        //HTTP协议
        String protcol = httpServletRequest.getProtocol();
        //查询字符串，即？后面的字符串
        String queryString = httpServletRequest.getQueryString();
        //远程ip，即客户端ip
        String remoteAddr = httpServletRequest.getRemoteAddr();
        //远程端口，即客户端端口
        int port = httpServletRequest.getRemotePort();
        //远程用户
        String remoteUser = httpServletRequest.getRemoteUser();
        //客户端session的id
        String requestedSessionId = httpServletRequest.getRequestedSessionId();
        //用户请求的URI
        String requestURI = httpServletRequest.getRequestURI();
        //用户请求的URL
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        //协议头，这里为http
        String scheme = httpServletRequest.getScheme();
        //服务器名称
        String serverName = httpServletRequest.getServerName();
        //服务器端口
        int serverPort = httpServletRequest.getServerPort();
        //Servlet的路径
        String servletPath = httpServletRequest.getServletPath();
        Principal principal = httpServletRequest.getUserPrincipal();
        //浏览器支持的格式
        String accept = httpServletRequest.getHeader("accept");
        //从哪个页面单击链接到了本页
        String referer = httpServletRequest.getHeader("referer");
        //User Agent信息，包括操作系统类型及版本号、浏览器类型及版本号等
        String userAgent = httpServletRequest.getHeader("user-agent");
        String serverInfo = this.getServletContext().getServerInfo();
    }
}
