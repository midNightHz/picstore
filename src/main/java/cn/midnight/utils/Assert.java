package cn.midnight.utils;

import org.apache.commons.lang.StringUtils;

public final class Assert {

	private Assert() {

	}

	public void isEmpty(String str, String message) {
		if (StringUtils.isBlank(str)) {
			throw new IllegalArgumentException(message);
		}
	}

}
