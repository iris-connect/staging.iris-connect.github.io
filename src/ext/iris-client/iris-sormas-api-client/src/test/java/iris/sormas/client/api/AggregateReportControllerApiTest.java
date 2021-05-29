/*
 * SORMAS REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.55.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package iris.sormas.client.api;

import org.junit.Test;
import org.junit.Ignore;

import iris.sormas.client.api.AggregateReportControllerApi;
import iris.sormas.client.model.AggregateReportDto;
import iris.sormas.client.model.PushResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AggregateReportControllerApi
 */
@Ignore
public class AggregateReportControllerApiTest {

	private final AggregateReportControllerApi api = new AggregateReportControllerApi();

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllAggregateReportsTest() {
		Long since = null;
		List<AggregateReportDto> response = api.getAllAggregateReports(since);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllUuids1Test() {
		List<String> response = api.getAllUuids1();

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getByUuids2Test() {
		List<String> body = null;
		List<AggregateReportDto> response = api.getByUuids2(body);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void postAggregateReportsTest() {
		List<AggregateReportDto> body = null;
		List<PushResult> response = api.postAggregateReports(body);

		// TODO: test validations
	}
}
