package com.github.apz.sturts.thymeleaf.struts2_thymeleaf_sampleapp.actions;

import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import org.apache.struts2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */
@Namespace("/")
@ParentPackage("struts-thymeleaf")
@Results({@Result(name=ActionSupport.SUCCESS,type="thymeleaf",location="index")})
public class HelloAction extends ActionSupport {

	@Action("")
    public String execute() throws Exception {
		addActionMessage("This is thymeleaf3.1 with Struts2(7).");

        this.name = "sample value from Struts2";
        return SUCCESS;
    }

    @Getter @Setter
    private String name;
}
