package cn.midnight.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;

import com.alibaba.fastjson.JSONObject;

import cn.midnight.config.AppConfig;
import cn.midnight.config.ApplicationProperties;
import cn.midnight.utils.BeanFactory;

/**
 * 供filter读取配置信息,filter的加载早于其他bean，因此采用懒加载的方式来加载配置
 * 
 * @author chen
 *
 */
public abstract class BaseFilter {

	protected ApplicationProperties applicationProperties;

	/**
	 * 获取配置信息
	 * 
	 * @return
	 */
	protected ApplicationProperties applicationProperties() {
		if (applicationProperties == null) {
			applicationProperties = BeanFactory.getBean(ApplicationProperties.class);
		}
		return applicationProperties;
	}

	protected void setJsonResponseStr(ServletResponse response, String words) throws IOException {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("application/json");
			PrintWriter writer = response.getWriter();
			writer.append(words);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void setJsonResponse(ServletResponse response, Object obj) throws IOException {
		try {
			setJsonResponseStr(response, JSONObject.toJSON(obj).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
