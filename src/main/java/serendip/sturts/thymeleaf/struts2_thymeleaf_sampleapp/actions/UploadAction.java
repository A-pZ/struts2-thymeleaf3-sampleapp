/**
 *
 */
package serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.actions;

import java.io.File;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

/**
 * Dsiplay upload.html
 *
 * @author A-pZ
 *
 */
@Namespace("/")
@ParentPackage("struts-thymeleaf")
@Results({
	@Result(name=ActionSupport.SUCCESS,type="thymeleaf",location="upload"),
	@Result(name=ActionSupport.INPUT,type="thymeleaf",location="upload"),
})

@Log4j2
public class UploadAction extends ActionSupport {
	@Action("upload")
    public String upload() throws Exception {

		log.info("- upload success. {} {} {} {}",uploadFileContentType,uploadFileFileName,uploadFile.getAbsolutePath(),description);

		addActionMessage("アップロードが完了しました。" + uploadFileFileName);

        return SUCCESS;
    }

	@Getter @Setter
	private File uploadFile;

	@Getter @Setter
	private String uploadFileContentType;

	@Getter @Setter
	private String uploadFileFileName;

	@Getter @Setter
	private String description;
}
