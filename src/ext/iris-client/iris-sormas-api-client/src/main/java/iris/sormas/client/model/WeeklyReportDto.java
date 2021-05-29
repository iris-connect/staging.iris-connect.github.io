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
import iris.sormas.client.model.CommunityReferenceDto;
import iris.sormas.client.model.DistrictReferenceDto;
import iris.sormas.client.model.FacilityReferenceDto;
import iris.sormas.client.model.UserReferenceDto;
import iris.sormas.client.model.WeeklyReportEntryDto;

import java.time.OffsetDateTime;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * WeeklyReportDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class WeeklyReportDto {
	@JsonProperty("creationDate")
	private Instant creationDate = null;

	@JsonProperty("changeDate")
	private Instant changeDate = null;

	@JsonProperty("uuid")
	private String uuid = null;

	@JsonProperty("reportingUser")
	private UserReferenceDto reportingUser = null;

	@JsonProperty("reportDateTime")
	private Instant reportDateTime = null;

	@JsonProperty("district")
	private DistrictReferenceDto district = null;

	@JsonProperty("community")
	private CommunityReferenceDto community = null;

	@JsonProperty("healthFacility")
	private FacilityReferenceDto healthFacility = null;

	@JsonProperty("assignedOfficer")
	private UserReferenceDto assignedOfficer = null;

	@JsonProperty("totalNumberOfCases")
	private Integer totalNumberOfCases = null;

	@JsonProperty("year")
	private Integer year = null;

	@JsonProperty("epiWeek")
	private Integer epiWeek = null;

	@JsonProperty("reportEntries")
	private List<WeeklyReportEntryDto> reportEntries = null;

	public WeeklyReportDto creationDate(Instant creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	/**
	 * Get creationDate
	 * 
	 * @return creationDate
	 **/
	@Schema(description = "")
	public Instant getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Instant creationDate) {
		this.creationDate = creationDate;
	}

	public WeeklyReportDto changeDate(Instant changeDate) {
		this.changeDate = changeDate;
		return this;
	}

	/**
	 * Get changeDate
	 * 
	 * @return changeDate
	 **/
	@Schema(description = "")
	public Instant getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Instant changeDate) {
		this.changeDate = changeDate;
	}

	public WeeklyReportDto uuid(String uuid) {
		this.uuid = uuid;
		return this;
	}

	/**
	 * Get uuid
	 * 
	 * @return uuid
	 **/
	@Schema(description = "")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public WeeklyReportDto reportingUser(UserReferenceDto reportingUser) {
		this.reportingUser = reportingUser;
		return this;
	}

	/**
	 * Get reportingUser
	 * 
	 * @return reportingUser
	 **/
	@Schema(description = "")
	public UserReferenceDto getReportingUser() {
		return reportingUser;
	}

	public void setReportingUser(UserReferenceDto reportingUser) {
		this.reportingUser = reportingUser;
	}

	public WeeklyReportDto reportDateTime(Instant reportDateTime) {
		this.reportDateTime = reportDateTime;
		return this;
	}

	/**
	 * Get reportDateTime
	 * 
	 * @return reportDateTime
	 **/
	@Schema(description = "")
	public Instant getReportDateTime() {
		return reportDateTime;
	}

	public void setReportDateTime(Instant reportDateTime) {
		this.reportDateTime = reportDateTime;
	}

	public WeeklyReportDto district(DistrictReferenceDto district) {
		this.district = district;
		return this;
	}

	/**
	 * Get district
	 * 
	 * @return district
	 **/
	@Schema(description = "")
	public DistrictReferenceDto getDistrict() {
		return district;
	}

	public void setDistrict(DistrictReferenceDto district) {
		this.district = district;
	}

	public WeeklyReportDto community(CommunityReferenceDto community) {
		this.community = community;
		return this;
	}

	/**
	 * Get community
	 * 
	 * @return community
	 **/
	@Schema(description = "")
	public CommunityReferenceDto getCommunity() {
		return community;
	}

	public void setCommunity(CommunityReferenceDto community) {
		this.community = community;
	}

	public WeeklyReportDto healthFacility(FacilityReferenceDto healthFacility) {
		this.healthFacility = healthFacility;
		return this;
	}

	/**
	 * Get healthFacility
	 * 
	 * @return healthFacility
	 **/
	@Schema(description = "")
	public FacilityReferenceDto getHealthFacility() {
		return healthFacility;
	}

	public void setHealthFacility(FacilityReferenceDto healthFacility) {
		this.healthFacility = healthFacility;
	}

	public WeeklyReportDto assignedOfficer(UserReferenceDto assignedOfficer) {
		this.assignedOfficer = assignedOfficer;
		return this;
	}

	/**
	 * Get assignedOfficer
	 * 
	 * @return assignedOfficer
	 **/
	@Schema(description = "")
	public UserReferenceDto getAssignedOfficer() {
		return assignedOfficer;
	}

	public void setAssignedOfficer(UserReferenceDto assignedOfficer) {
		this.assignedOfficer = assignedOfficer;
	}

	public WeeklyReportDto totalNumberOfCases(Integer totalNumberOfCases) {
		this.totalNumberOfCases = totalNumberOfCases;
		return this;
	}

	/**
	 * Get totalNumberOfCases
	 * 
	 * @return totalNumberOfCases
	 **/
	@Schema(description = "")
	public Integer getTotalNumberOfCases() {
		return totalNumberOfCases;
	}

	public void setTotalNumberOfCases(Integer totalNumberOfCases) {
		this.totalNumberOfCases = totalNumberOfCases;
	}

	public WeeklyReportDto year(Integer year) {
		this.year = year;
		return this;
	}

	/**
	 * Get year
	 * 
	 * @return year
	 **/
	@Schema(description = "")
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public WeeklyReportDto epiWeek(Integer epiWeek) {
		this.epiWeek = epiWeek;
		return this;
	}

	/**
	 * Get epiWeek
	 * 
	 * @return epiWeek
	 **/
	@Schema(description = "")
	public Integer getEpiWeek() {
		return epiWeek;
	}

	public void setEpiWeek(Integer epiWeek) {
		this.epiWeek = epiWeek;
	}

	public WeeklyReportDto reportEntries(List<WeeklyReportEntryDto> reportEntries) {
		this.reportEntries = reportEntries;
		return this;
	}

	public WeeklyReportDto addReportEntriesItem(WeeklyReportEntryDto reportEntriesItem) {
		if (this.reportEntries == null) {
			this.reportEntries = new ArrayList<>();
		}
		this.reportEntries.add(reportEntriesItem);
		return this;
	}

	/**
	 * Get reportEntries
	 * 
	 * @return reportEntries
	 **/
	@Schema(description = "")
	public List<WeeklyReportEntryDto> getReportEntries() {
		return reportEntries;
	}

	public void setReportEntries(List<WeeklyReportEntryDto> reportEntries) {
		this.reportEntries = reportEntries;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WeeklyReportDto weeklyReportDto = (WeeklyReportDto) o;
		return Objects.equals(this.creationDate, weeklyReportDto.creationDate)
				&& Objects.equals(this.changeDate, weeklyReportDto.changeDate)
				&& Objects.equals(this.uuid, weeklyReportDto.uuid)
				&& Objects.equals(this.reportingUser, weeklyReportDto.reportingUser)
				&& Objects.equals(this.reportDateTime, weeklyReportDto.reportDateTime)
				&& Objects.equals(this.district, weeklyReportDto.district)
				&& Objects.equals(this.community, weeklyReportDto.community)
				&& Objects.equals(this.healthFacility, weeklyReportDto.healthFacility)
				&& Objects.equals(this.assignedOfficer, weeklyReportDto.assignedOfficer)
				&& Objects.equals(this.totalNumberOfCases, weeklyReportDto.totalNumberOfCases)
				&& Objects.equals(this.year, weeklyReportDto.year) && Objects.equals(this.epiWeek, weeklyReportDto.epiWeek)
				&& Objects.equals(this.reportEntries, weeklyReportDto.reportEntries);
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationDate, changeDate, uuid, reportingUser, reportDateTime, district, community,
				healthFacility, assignedOfficer, totalNumberOfCases, year, epiWeek, reportEntries);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WeeklyReportDto {\n");

		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
		sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("    reportingUser: ").append(toIndentedString(reportingUser)).append("\n");
		sb.append("    reportDateTime: ").append(toIndentedString(reportDateTime)).append("\n");
		sb.append("    district: ").append(toIndentedString(district)).append("\n");
		sb.append("    community: ").append(toIndentedString(community)).append("\n");
		sb.append("    healthFacility: ").append(toIndentedString(healthFacility)).append("\n");
		sb.append("    assignedOfficer: ").append(toIndentedString(assignedOfficer)).append("\n");
		sb.append("    totalNumberOfCases: ").append(toIndentedString(totalNumberOfCases)).append("\n");
		sb.append("    year: ").append(toIndentedString(year)).append("\n");
		sb.append("    epiWeek: ").append(toIndentedString(epiWeek)).append("\n");
		sb.append("    reportEntries: ").append(toIndentedString(reportEntries)).append("\n");
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
