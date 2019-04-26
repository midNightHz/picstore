package cn.midnight.user.entity;

import cn.midnight.base.entity.BaseEntity;

public class User implements BaseEntity<String> {

	protected String id;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

}
