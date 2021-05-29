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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import iris.sormas.client.model.ClassificationCriteriaDto;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassificationAllOfCriteriaDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class ClassificationAllOfCriteriaDto extends ClassificationCriteriaDto {
	@JsonProperty("drawSubCriteriaTogether")
	private Boolean drawSubCriteriaTogether = null;

	@JsonProperty("subCriteria")
	private List<ClassificationCriteriaDto> subCriteria = null;

	@JsonProperty("criteriaName")
	private String criteriaName = null;

	public ClassificationAllOfCriteriaDto drawSubCriteriaTogether(Boolean drawSubCriteriaTogether) {
		this.drawSubCriteriaTogether = drawSubCriteriaTogether;
		return this;
	}

	/**
	 * Get drawSubCriteriaTogether
	 * 
	 * @return drawSubCriteriaTogether
	 **/
	@Schema(description = "")
	public Boolean isDrawSubCriteriaTogether() {
		return drawSubCriteriaTogether;
	}

	public void setDrawSubCriteriaTogether(Boolean drawSubCriteriaTogether) {
		this.drawSubCriteriaTogether = drawSubCriteriaTogether;
	}

	public ClassificationAllOfCriteriaDto subCriteria(List<ClassificationCriteriaDto> subCriteria) {
		this.subCriteria = subCriteria;
		return this;
	}

	public ClassificationAllOfCriteriaDto addSubCriteriaItem(ClassificationCriteriaDto subCriteriaItem) {
		if (this.subCriteria == null) {
			this.subCriteria = new ArrayList<>();
		}
		this.subCriteria.add(subCriteriaItem);
		return this;
	}

	/**
	 * Get subCriteria
	 * 
	 * @return subCriteria
	 **/
	@Schema(description = "")
	public List<ClassificationCriteriaDto> getSubCriteria() {
		return subCriteria;
	}

	public void setSubCriteria(List<ClassificationCriteriaDto> subCriteria) {
		this.subCriteria = subCriteria;
	}

	public ClassificationAllOfCriteriaDto criteriaName(String criteriaName) {
		this.criteriaName = criteriaName;
		return this;
	}

	/**
	 * Get criteriaName
	 * 
	 * @return criteriaName
	 **/
	@Schema(description = "")
	public String getCriteriaName() {
		return criteriaName;
	}

	public void setCriteriaName(String criteriaName) {
		this.criteriaName = criteriaName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClassificationAllOfCriteriaDto classificationAllOfCriteriaDto = (ClassificationAllOfCriteriaDto) o;
		return Objects.equals(this.drawSubCriteriaTogether, classificationAllOfCriteriaDto.drawSubCriteriaTogether)
				&& Objects.equals(this.subCriteria, classificationAllOfCriteriaDto.subCriteria)
				&& Objects.equals(this.criteriaName, classificationAllOfCriteriaDto.criteriaName) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(drawSubCriteriaTogether, subCriteria, criteriaName, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClassificationAllOfCriteriaDto {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    drawSubCriteriaTogether: ").append(toIndentedString(drawSubCriteriaTogether)).append("\n");
		sb.append("    subCriteria: ").append(toIndentedString(subCriteria)).append("\n");
		sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
