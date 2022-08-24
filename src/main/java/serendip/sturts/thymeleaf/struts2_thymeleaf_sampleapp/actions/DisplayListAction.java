package serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.actions;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;
import serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.model.ProductService;
import serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.model.SampleProduct;

/**
 * <code>Set welcome message.</code>
 */
@Namespace("/")
@ParentPackage("struts-thymeleaf")
@Results({@Result(name=ActionSupport.SUCCESS,type="thymeleaf",location="list")})
//@Log4j2
public class DisplayListAction extends ActionSupport {

	static Logger log = LogManager.getLogger(DisplayListAction.class);

	@Action("list")
    public String execute() throws Exception {

		ProductService service = new ProductService();

		products = service.search();
		log.info("- search:{}" , products);

		addActionMessage(getText("sample.message"));

        return SUCCESS;
    }

	@Getter @Setter
	List<SampleProduct> products;

}
