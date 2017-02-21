/**
 *
 */
package serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author A-pZ
 *
 */
@Data
public class SampleProduct implements Serializable {
	public SampleProduct() {
		// NOP
	};

	public SampleProduct setProduct(String id, String name, long stock, boolean secret, boolean editable) {
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.secret = secret;
		this.editable = editable;

		return this;
	}
	private String id;
	private String name;
	private long stock;
	private boolean secret;
	private boolean editable;
}
