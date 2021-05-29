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
 * Gets or Sets WaterSource
 */
public enum WaterSource {
	PIPE_NETWORK("PIPE_NETWORK"), COMMUNITY_BOREHOLE_WELL("COMMUNITY_BOREHOLE_WELL"), PRIVATE_BOREHOLE_WELL(
			"PRIVATE_BOREHOLE_WELL"), STREAM("STREAM"), OTHER("OTHER");

	private String value;

	WaterSource(String value) {
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
	public static WaterSource fromValue(String text) {
		for (WaterSource b : WaterSource.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
