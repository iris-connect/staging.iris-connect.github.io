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

import iris.sormas.client.api.FeatureConfigurationControllerApi;
import iris.sormas.client.model.FeatureConfigurationDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeatureConfigurationControllerApi
 */
@Ignore
public class FeatureConfigurationControllerApiTest {

	private final FeatureConfigurationControllerApi api = new FeatureConfigurationControllerApi();

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllFeatureConfigurationsTest() {
		Long since = null;
		List<FeatureConfigurationDto> response = api.getAllFeatureConfigurations(since);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllUuids11Test() {
		List<String> response = api.getAllUuids11();

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getByUuids16Test() {
		List<String> body = null;
		List<FeatureConfigurationDto> response = api.getByUuids16(body);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getDeletedUuidsTest() {
		Long since = null;
		List<String> response = api.getDeletedUuids(since);

		// TODO: test validations
	}
}
