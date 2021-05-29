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
import iris.sormas.client.model.CampaignFormDataEntry;
import iris.sormas.client.model.CampaignFormMetaReferenceDto;
import iris.sormas.client.model.CampaignReferenceDto;
import iris.sormas.client.model.CommunityReferenceDto;
import iris.sormas.client.model.DistrictReferenceDto;
import iris.sormas.client.model.RegionReferenceDto;
import iris.sormas.client.model.UserReferenceDto;

import java.time.OffsetDateTime;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * CampaignFormDataDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class CampaignFormDataDto {
	@JsonProperty("creationDate")
	private Instant creationDate = null;

	@JsonProperty("changeDate")
	private Instant changeDate = null;

	@JsonProperty("uuid")
	private String uuid = null;

	@JsonProperty("formValues")
	private List<CampaignFormDataEntry> formValues = null;

	@JsonProperty("campaign")
	private CampaignReferenceDto campaign = null;

	@JsonProperty("campaignFormMeta")
	private CampaignFormMetaReferenceDto campaignFormMeta = null;

	@JsonProperty("formDate")
	private Instant formDate = null;

	@JsonProperty("region")
	private RegionReferenceDto region = null;

	@JsonProperty("district")
	private DistrictReferenceDto district = null;

	@JsonProperty("community")
	private CommunityReferenceDto community = null;

	@JsonProperty("creatingUser")
	private UserReferenceDto creatingUser = null;

	public CampaignFormDataDto creationDate(Instant creationDate) {
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

	public CampaignFormDataDto changeDate(Instant changeDate) {
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

	public CampaignFormDataDto uuid(String uuid) {
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

	public CampaignFormDataDto formValues(List<CampaignFormDataEntry> formValues) {
		this.formValues = formValues;
		return this;
	}

	public CampaignFormDataDto addFormValuesItem(CampaignFormDataEntry formValuesItem) {
		if (this.formValues == null) {
			this.formValues = new ArrayList<>();
		}
		this.formValues.add(formValuesItem);
		return this;
	}

	/**
	 * Get formValues
	 * 
	 * @return formValues
	 **/
	@Schema(description = "")
	public List<CampaignFormDataEntry> getFormValues() {
		return formValues;
	}

	public void setFormValues(List<CampaignFormDataEntry> formValues) {
		this.formValues = formValues;
	}

	public CampaignFormDataDto campaign(CampaignReferenceDto campaign) {
		this.campaign = campaign;
		return this;
	}

	/**
	 * Get campaign
	 * 
	 * @return campaign
	 **/
	@Schema(description = "")
	public CampaignReferenceDto getCampaign() {
		return campaign;
	}

	public void setCampaign(CampaignReferenceDto campaign) {
		this.campaign = campaign;
	}

	public CampaignFormDataDto campaignFormMeta(CampaignFormMetaReferenceDto campaignFormMeta) {
		this.campaignFormMeta = campaignFormMeta;
		return this;
	}

	/**
	 * Get campaignFormMeta
	 * 
	 * @return campaignFormMeta
	 **/
	@Schema(description = "")
	public CampaignFormMetaReferenceDto getCampaignFormMeta() {
		return campaignFormMeta;
	}

	public void setCampaignFormMeta(CampaignFormMetaReferenceDto campaignFormMeta) {
		this.campaignFormMeta = campaignFormMeta;
	}

	public CampaignFormDataDto formDate(Instant formDate) {
		this.formDate = formDate;
		return this;
	}

	/**
	 * Get formDate
	 * 
	 * @return formDate
	 **/
	@Schema(description = "")
	public Instant getFormDate() {
		return formDate;
	}

	public void setFormDate(Instant formDate) {
		this.formDate = formDate;
	}

	public CampaignFormDataDto region(RegionReferenceDto region) {
		this.region = region;
		return this;
	}

	/**
	 * Get region
	 * 
	 * @return region
	 **/
	@Schema(description = "")
	public RegionReferenceDto getRegion() {
		return region;
	}

	public void setRegion(RegionReferenceDto region) {
		this.region = region;
	}

	public CampaignFormDataDto district(DistrictReferenceDto district) {
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

	public CampaignFormDataDto community(CommunityReferenceDto community) {
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

	public CampaignFormDataDto creatingUser(UserReferenceDto creatingUser) {
		this.creatingUser = creatingUser;
		return this;
	}

	/**
	 * Get creatingUser
	 * 
	 * @return creatingUser
	 **/
	@Schema(description = "")
	public UserReferenceDto getCreatingUser() {
		return creatingUser;
	}

	public void setCreatingUser(UserReferenceDto creatingUser) {
		this.creatingUser = creatingUser;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CampaignFormDataDto campaignFormDataDto = (CampaignFormDataDto) o;
		return Objects.equals(this.creationDate, campaignFormDataDto.creationDate)
				&& Objects.equals(this.changeDate, campaignFormDataDto.changeDate)
				&& Objects.equals(this.uuid, campaignFormDataDto.uuid)
				&& Objects.equals(this.formValues, campaignFormDataDto.formValues)
				&& Objects.equals(this.campaign, campaignFormDataDto.campaign)
				&& Objects.equals(this.campaignFormMeta, campaignFormDataDto.campaignFormMeta)
				&& Objects.equals(this.formDate, campaignFormDataDto.formDate)
				&& Objects.equals(this.region, campaignFormDataDto.region)
				&& Objects.equals(this.district, campaignFormDataDto.district)
				&& Objects.equals(this.community, campaignFormDataDto.community)
				&& Objects.equals(this.creatingUser, campaignFormDataDto.creatingUser);
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationDate, changeDate, uuid, formValues, campaign, campaignFormMeta, formDate, region,
				district, community, creatingUser);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CampaignFormDataDto {\n");

		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
		sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("    formValues: ").append(toIndentedString(formValues)).append("\n");
		sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
		sb.append("    campaignFormMeta: ").append(toIndentedString(campaignFormMeta)).append("\n");
		sb.append("    formDate: ").append(toIndentedString(formDate)).append("\n");
		sb.append("    region: ").append(toIndentedString(region)).append("\n");
		sb.append("    district: ").append(toIndentedString(district)).append("\n");
		sb.append("    community: ").append(toIndentedString(community)).append("\n");
		sb.append("    creatingUser: ").append(toIndentedString(creatingUser)).append("\n");
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
