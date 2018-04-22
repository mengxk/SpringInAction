package mxk.com.util;

import mxk.com.util.ip.IPSeeker;

/**
 * Created by 10056 on 2018/4/22.
 */
public class IpUtil {
    public static String getIpAddress(String ip) {
        String result = "";
        result = IPSeeker.getInstance().getAddress(ip);
        return result;
    }
}
