package com.cloudxweb;

import org.apache.struts.action.ActionForm;

public class StudentActionForm extends ActionForm {
   private String sid,sname,saddr;

public String getSid() {
	return sid;
}

public void setSid(String sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getSaddr() {
	return saddr;
}

public void setSaddr(String saddr) {
	this.saddr = saddr;
}
}
