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

import iris.sormas.client.api.UserRoleConfigControllerApi;
import iris.sormas.client.model.UserRoleConfigDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserRoleConfigControllerApi
 */
@Ignore
public class UserRoleConfigControllerApiTest {

	private final UserRoleConfigControllerApi api = new UserRoleConfigControllerApi();

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAll9Test() {
		Long since = null;
		List<UserRoleConfigDto> response = api.getAll9(since);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllUuids16Test() {
		List<String> response = api.getAllUuids16();

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getDeletedUuids1Test() {
		Long since = null;
		List<String> response = api.getDeletedUuids1(since);

		// TODO: test validations
	}
}
