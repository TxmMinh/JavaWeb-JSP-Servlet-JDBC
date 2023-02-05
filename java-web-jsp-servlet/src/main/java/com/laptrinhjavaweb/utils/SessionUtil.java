package com.laptrinhjavaweb.utils;

import javax.servlet.http.HttpServletRequest;

public class SessionUtil {

    private static SessionUtil sessionUtil = null;

    public static SessionUtil getInstance() {
        if (sessionUtil == null) {
            sessionUtil = new SessionUtil();
        }
        return sessionUtil;
    }

    // putValue: duy trì thông tin người dùng
    public void putValue(HttpServletRequest request, String key, Object value) {
        request.getSession().setAttribute(key, value);
    }

    // remoteValue: thoát Ra khỏi hệ thống
    public Object getValue(HttpServletRequest request, String key) {
        return request.getSession().getAttribute(key);
    }

    // getValue: lấy thông tin ra
    public void removeValue(HttpServletRequest request, String key) {
        request.getSession().removeAttribute(key);
    }
}
