package cn.itcast.jk.util;

import org.apache.commons.logging.LogFactory;

public class Log {

	public static void info(Class<?> clazz, String message, Throwable e) {
		LogFactory.getLog(clazz).info(message, e);
	}
	
	public static void warn(Class<?> clazz, String message, Throwable e) {
		LogFactory.getLog(clazz).warn(message, e);
	}
	
	public static void error(Class<?> clazz, String message, Throwable e) {
		LogFactory.getLog(clazz).error(message, e);
	}
	
	public static void debug(Class<?> clazz, String message, Throwable e) {
		LogFactory.getLog(clazz).debug(message, e);
	}
}
