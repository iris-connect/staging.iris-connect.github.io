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

import iris.sormas.client.api.InfrastructureControllerApi;
import iris.sormas.client.model.InfrastructureChangeDatesDto;
import iris.sormas.client.model.InfrastructureSyncDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InfrastructureControllerApi
 */
@Ignore
public class InfrastructureControllerApiTest {

	private final InfrastructureControllerApi api = new InfrastructureControllerApi();

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getInfrastructureSyncDataTest() {
		InfrastructureChangeDatesDto body = null;
		InfrastructureSyncDto response = api.getInfrastructureSyncData(body);

		// TODO: test validations
	}
}
