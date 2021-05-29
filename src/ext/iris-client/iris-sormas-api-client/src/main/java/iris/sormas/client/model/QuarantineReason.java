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
 * Gets or Sets QuarantineReason
 */
public enum QuarantineReason {
	IDENTIFIED_BY_CONTACT_TRACING("IDENTIFIED_BY_CONTACT_TRACING"), ENTRY_FROM_RISK_AREA(
			"ENTRY_FROM_RISK_AREA"), SWISS_COVID_APP_NOTIFICATION(
					"SWISS_COVID_APP_NOTIFICATION"), OTHER_REASON("OTHER_REASON");

	private String value;

	QuarantineReason(String value) {
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
	public static QuarantineReason fromValue(String text) {
		for (QuarantineReason b : QuarantineReason.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
