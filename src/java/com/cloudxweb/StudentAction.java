package com.cloudxweb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cloudxweb.hiber.StudentService;

public class StudentAction extends Action {
   
	 @Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		    String status="";
		    StudentActionForm saf=(StudentActionForm)form;
		    StudentService serv=new StudentService();
		    
		    status=serv.registration(saf.getSid(), saf.getSname(), saf.getSaddr()); 
		return mapping.findForward(status);
	}
}
