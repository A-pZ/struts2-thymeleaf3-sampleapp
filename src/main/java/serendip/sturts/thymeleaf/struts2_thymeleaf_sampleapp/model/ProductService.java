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
			new SampleProduct("A-1", "試作品X-290PA1", 10, true, true),
			new SampleProduct("A-2", "試作品X-290PA2", 20, true, true),
			new SampleProduct("B-3", "試作品X-B3", 10, true, true),
			new SampleProduct("B-4", "試作品X-B4", 30, true, true),
			new SampleProduct("C-5", "試作品X-C5", 10, true, false),
			new SampleProduct("C-6", "試作品X-C6", 40, true, false),
			new SampleProduct("D-7", "試作品X-D7", 10, false, true),
			new SampleProduct("D-8", "試作品X-D8", 50, false, true),
			new SampleProduct("E-9", "試作品X-E9", 10, true, true),
			new SampleProduct("Z-1000", "試作品Z-1000", 0, false, false)
		);

		return resultList;
	}
}
