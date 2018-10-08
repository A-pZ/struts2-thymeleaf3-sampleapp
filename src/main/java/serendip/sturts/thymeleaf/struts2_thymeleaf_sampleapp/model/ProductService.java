/**
 *
 */
package serendip.sturts.thymeleaf.struts2_thymeleaf_sampleapp.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author A-pZ
 *
 */
public class ProductService {
	public List<SampleProduct> search() {
		List<SampleProduct> resultList =

		Arrays.asList(
			new SampleProduct().setProduct("A-1", "ProtoType-X-290PA1", 10, true, true),
			new SampleProduct().setProduct("A-2", "ProtoType-X-290PA2", 20, true, true),
			new SampleProduct().setProduct("B-3", "ProtoType-X-B3", 10, true, true),
			new SampleProduct().setProduct("B-4", "ProtoType-X-B4", 30, true, true),
			new SampleProduct().setProduct("C-5", "ProtoType-X-C5", 10, true, false),
			new SampleProduct().setProduct("C-6", "ProtoType-X-C6", 40, true, false),
			new SampleProduct().setProduct("D-7", "ProtoType-X-D7", 10, false, true),
			new SampleProduct().setProduct("D-8", "ProtoType-X-D8", 50, false, true),
			new SampleProduct().setProduct("E-9", "ProtoType-X-E9", 10, true, true),
			new SampleProduct().setProduct("Z-1000", "ProtoType-Z-1000", 0, false, false)
		);

		return resultList;
	}
}
