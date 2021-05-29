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

package iris.sormas.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets InstitutionalPartnerType
 */
public enum InstitutionalPartnerType {
	HEALTH_INSURANCE("HEALTH_INSURANCE"), TERRITORIAL_COMMUNITIES("TERRITORIAL_COMMUNITIES"), NATIONAL_EDUCATION(
			"NATIONAL_EDUCATION"), HEALTH_ESTABLISHMENTS(
					"HEALTH_ESTABLISHMENTS"), MEDICO_SOCIAL_ESTABLISHMENTS("MEDICO_SOCIAL_ESTABLISHMENTS"), OTHER("OTHER");

	private String value;

	InstitutionalPartnerType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static InstitutionalPartnerType fromValue(String text) {
		for (InstitutionalPartnerType b : InstitutionalPartnerType.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}