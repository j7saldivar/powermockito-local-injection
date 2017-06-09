package com.saldivar.controller;

import com.saldivar.beans.SimplePojo;

public class SimpleController {

	public String getSimplePojoName() {
		SimplePojo p = new SimplePojo(1, "name");
		String str = p.getName();
		return str;
	}

}
