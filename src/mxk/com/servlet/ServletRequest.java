package mxk.com.servlet;

import javax.servlet.http.HttpServlet;
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
}
