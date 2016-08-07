package serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */
@Namespace("/")
@ParentPackage("struts-thymeleaf")
@Results({@Result(name=ActionSupport.SUCCESS,type="thymeleaf",location="index")})
public class HelloAction extends ActionSupport {

	@Action("")
    public String execute() throws Exception {
		name = "Wooo! Year!! This is thymeleaf3 with Struts2!!";
        return SUCCESS;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
