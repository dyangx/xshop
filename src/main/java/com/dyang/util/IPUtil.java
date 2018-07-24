package com.dyang.util;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

public class IPUtil {

	public static String getIp(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip.indexOf(",") > -1) {
			ip = ip.split(",")[0];
		}
		final String regex = "^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])((\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])){3}|(\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])){5})$";
		ip = Pattern.matches(regex, ip)?ip:"";
		return ip;
	}
}
