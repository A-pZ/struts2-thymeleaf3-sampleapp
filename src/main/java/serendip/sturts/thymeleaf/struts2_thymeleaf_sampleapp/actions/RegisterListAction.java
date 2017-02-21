package serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.Element;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.model.ProductService;
import serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.model.SampleProduct;

/**
 * <code>Set welcome message.</code>
 */
@Namespace("/")
@ParentPackage("struts-thymeleaf")
@Results(
		{@Result(name=ActionSupport.SUCCESS,type="thymeleaf",location="listInput"),
		@Result(name=ActionSupport.INPUT,type="thymeleaf",location="listInput")}
)
@Log4j2
public class RegisterListAction extends ActionSupport {

	@Action("registerList")
    public String execute() throws Exception {

		log.info("- register:{}" , products);

        return SUCCESS;
    }

	@Getter @Setter
	//@Element(value=serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.model.SampleProduct.class)
	List<SampleProduct> products;

}
