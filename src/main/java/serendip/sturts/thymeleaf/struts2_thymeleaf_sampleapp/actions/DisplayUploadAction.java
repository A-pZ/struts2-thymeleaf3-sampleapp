/**
 *
 */
package serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

import lombok.extern.log4j.Log4j2;

/**
 * Dsiplay upload.html
 *
 * @author A-pZ
 *
 */
@Namespace("/")
@ParentPackage("struts-thymeleaf")
@Results({@Result(name=ActionSupport.SUCCESS,type="thymeleaf",location="upload")})
@Log4j2
public class DisplayUploadAction extends ActionSupport {
	@Action("displayUpload")
    public String displayUpload() throws Exception {

		log.info("- display.");

        return SUCCESS;
    }
}
