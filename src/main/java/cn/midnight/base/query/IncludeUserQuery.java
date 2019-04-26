package cn.midnight.base.query;

import cn.midnight.base.controller.CallContext;
import cn.midnight.page.Pageable;

public abstract class IncludeUserQuery extends BaseQuery {

	protected String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void init(Pageable pageable, CallContext callContext) {
		setUserName(callContext.getUserName());
		super.init(pageable);
	}

}
