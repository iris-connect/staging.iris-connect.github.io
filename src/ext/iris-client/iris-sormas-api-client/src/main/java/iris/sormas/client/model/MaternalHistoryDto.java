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
import iris.sormas.client.model.RegionReferenceDto;
import iris.sormas.client.model.YesNoUnknown;

import java.time.OffsetDateTime;
import java.time.Instant;

/**
 * MaternalHistoryDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class MaternalHistoryDto {
	@JsonProperty("creationDate")
	private Instant creationDate = null;

	@JsonProperty("changeDate")
	private Instant changeDate = null;

	@JsonProperty("uuid")
	private String uuid = null;

	@JsonProperty("pseudonymized")
	private Boolean pseudonymized = null;

	@JsonProperty("childrenNumber")
	private Integer childrenNumber = null;

	@JsonProperty("ageAtBirth")
	private Integer ageAtBirth = null;

	@JsonProperty("conjunctivitis")
	private YesNoUnknown conjunctivitis = null;

	@JsonProperty("conjunctivitisOnset")
	private Instant conjunctivitisOnset = null;

	@JsonProperty("conjunctivitisMonth")
	private Integer conjunctivitisMonth = null;

	@JsonProperty("maculopapularRash")
	private YesNoUnknown maculopapularRash = null;

	@JsonProperty("maculopapularRashOnset")
	private Instant maculopapularRashOnset = null;

	@JsonProperty("maculopapularRashMonth")
	private Integer maculopapularRashMonth = null;

	@JsonProperty("swollenLymphs")
	private YesNoUnknown swollenLymphs = null;

	@JsonProperty("swollenLymphsOnset")
	private Instant swollenLymphsOnset = null;

	@JsonProperty("swollenLymphsMonth")
	private Integer swollenLymphsMonth = null;

	@JsonProperty("arthralgiaArthritis")
	private YesNoUnknown arthralgiaArthritis = null;

	@JsonProperty("arthralgiaArthritisOnset")
	private Instant arthralgiaArthritisOnset = null;

	@JsonProperty("arthralgiaArthritisMonth")
	private Integer arthralgiaArthritisMonth = null;

	@JsonProperty("otherComplications")
	private YesNoUnknown otherComplications = null;

	@JsonProperty("otherComplicationsOnset")
	private Instant otherComplicationsOnset = null;

	@JsonProperty("otherComplicationsMonth")
	private Integer otherComplicationsMonth = null;

	@JsonProperty("otherComplicationsDetails")
	private String otherComplicationsDetails = null;

	@JsonProperty("rubella")
	private YesNoUnknown rubella = null;

	@JsonProperty("rubellaOnset")
	private Instant rubellaOnset = null;

	@JsonProperty("rashExposure")
	private YesNoUnknown rashExposure = null;

	@JsonProperty("rashExposureDate")
	private Instant rashExposureDate = null;

	@JsonProperty("rashExposureMonth")
	private Integer rashExposureMonth = null;

	@JsonProperty("rashExposureRegion")
	private RegionReferenceDto rashExposureRegion = null;

	@JsonProperty("rashExposureDistrict")
	private DistrictReferenceDto rashExposureDistrict = null;

	@JsonProperty("rashExposureCommunity")
	private CommunityReferenceDto rashExposureCommunity = null;

	public MaternalHistoryDto creationDate(Instant creationDate) {
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

	public MaternalHistoryDto changeDate(Instant changeDate) {
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

	public MaternalHistoryDto uuid(String uuid) {
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

	public MaternalHistoryDto pseudonymized(Boolean pseudonymized) {
		this.pseudonymized = pseudonymized;
		return this;
	}

	/**
	 * Get pseudonymized
	 * 
	 * @return pseudonymized
	 **/
	@Schema(description = "")
	public Boolean isPseudonymized() {
		return pseudonymized;
	}

	public void setPseudonymized(Boolean pseudonymized) {
		this.pseudonymized = pseudonymized;
	}

	public MaternalHistoryDto childrenNumber(Integer childrenNumber) {
		this.childrenNumber = childrenNumber;
		return this;
	}

	/**
	 * Get childrenNumber
	 * 
	 * @return childrenNumber
	 **/
	@Schema(description = "")
	public Integer getChildrenNumber() {
		return childrenNumber;
	}

	public void setChildrenNumber(Integer childrenNumber) {
		this.childrenNumber = childrenNumber;
	}

	public MaternalHistoryDto ageAtBirth(Integer ageAtBirth) {
		this.ageAtBirth = ageAtBirth;
		return this;
	}

	/**
	 * Get ageAtBirth
	 * 
	 * @return ageAtBirth
	 **/
	@Schema(description = "")
	public Integer getAgeAtBirth() {
		return ageAtBirth;
	}

	public void setAgeAtBirth(Integer ageAtBirth) {
		this.ageAtBirth = ageAtBirth;
	}

	public MaternalHistoryDto conjunctivitis(YesNoUnknown conjunctivitis) {
		this.conjunctivitis = conjunctivitis;
		return this;
	}

	/**
	 * Get conjunctivitis
	 * 
	 * @return conjunctivitis
	 **/
	@Schema(description = "")
	public YesNoUnknown getConjunctivitis() {
		return conjunctivitis;
	}

	public void setConjunctivitis(YesNoUnknown conjunctivitis) {
		this.conjunctivitis = conjunctivitis;
	}

	public MaternalHistoryDto conjunctivitisOnset(Instant conjunctivitisOnset) {
		this.conjunctivitisOnset = conjunctivitisOnset;
		return this;
	}

	/**
	 * Get conjunctivitisOnset
	 * 
	 * @return conjunctivitisOnset
	 **/
	@Schema(description = "")
	public Instant getConjunctivitisOnset() {
		return conjunctivitisOnset;
	}

	public void setConjunctivitisOnset(Instant conjunctivitisOnset) {
		this.conjunctivitisOnset = conjunctivitisOnset;
	}

	public MaternalHistoryDto conjunctivitisMonth(Integer conjunctivitisMonth) {
		this.conjunctivitisMonth = conjunctivitisMonth;
		return this;
	}

	/**
	 * Get conjunctivitisMonth
	 * 
	 * @return conjunctivitisMonth
	 **/
	@Schema(description = "")
	public Integer getConjunctivitisMonth() {
		return conjunctivitisMonth;
	}

	public void setConjunctivitisMonth(Integer conjunctivitisMonth) {
		this.conjunctivitisMonth = conjunctivitisMonth;
	}

	public MaternalHistoryDto maculopapularRash(YesNoUnknown maculopapularRash) {
		this.maculopapularRash = maculopapularRash;
		return this;
	}

	/**
	 * Get maculopapularRash
	 * 
	 * @return maculopapularRash
	 **/
	@Schema(description = "")
	public YesNoUnknown getMaculopapularRash() {
		return maculopapularRash;
	}

	public void setMaculopapularRash(YesNoUnknown maculopapularRash) {
		this.maculopapularRash = maculopapularRash;
	}

	public MaternalHistoryDto maculopapularRashOnset(Instant maculopapularRashOnset) {
		this.maculopapularRashOnset = maculopapularRashOnset;
		return this;
	}

	/**
	 * Get maculopapularRashOnset
	 * 
	 * @return maculopapularRashOnset
	 **/
	@Schema(description = "")
	public Instant getMaculopapularRashOnset() {
		return maculopapularRashOnset;
	}

	public void setMaculopapularRashOnset(Instant maculopapularRashOnset) {
		this.maculopapularRashOnset = maculopapularRashOnset;
	}

	public MaternalHistoryDto maculopapularRashMonth(Integer maculopapularRashMonth) {
		this.maculopapularRashMonth = maculopapularRashMonth;
		return this;
	}

	/**
	 * Get maculopapularRashMonth
	 * 
	 * @return maculopapularRashMonth
	 **/
	@Schema(description = "")
	public Integer getMaculopapularRashMonth() {
		return maculopapularRashMonth;
	}

	public void setMaculopapularRashMonth(Integer maculopapularRashMonth) {
		this.maculopapularRashMonth = maculopapularRashMonth;
	}

	public MaternalHistoryDto swollenLymphs(YesNoUnknown swollenLymphs) {
		this.swollenLymphs = swollenLymphs;
		return this;
	}

	/**
	 * Get swollenLymphs
	 * 
	 * @return swollenLymphs
	 **/
	@Schema(description = "")
	public YesNoUnknown getSwollenLymphs() {
		return swollenLymphs;
	}

	public void setSwollenLymphs(YesNoUnknown swollenLymphs) {
		this.swollenLymphs = swollenLymphs;
	}

	public MaternalHistoryDto swollenLymphsOnset(Instant swollenLymphsOnset) {
		this.swollenLymphsOnset = swollenLymphsOnset;
		return this;
	}

	/**
	 * Get swollenLymphsOnset
	 * 
	 * @return swollenLymphsOnset
	 **/
	@Schema(description = "")
	public Instant getSwollenLymphsOnset() {
		return swollenLymphsOnset;
	}

	public void setSwollenLymphsOnset(Instant swollenLymphsOnset) {
		this.swollenLymphsOnset = swollenLymphsOnset;
	}

	public MaternalHistoryDto swollenLymphsMonth(Integer swollenLymphsMonth) {
		this.swollenLymphsMonth = swollenLymphsMonth;
		return this;
	}

	/**
	 * Get swollenLymphsMonth
	 * 
	 * @return swollenLymphsMonth
	 **/
	@Schema(description = "")
	public Integer getSwollenLymphsMonth() {
		return swollenLymphsMonth;
	}

	public void setSwollenLymphsMonth(Integer swollenLymphsMonth) {
		this.swollenLymphsMonth = swollenLymphsMonth;
	}

	public MaternalHistoryDto arthralgiaArthritis(YesNoUnknown arthralgiaArthritis) {
		this.arthralgiaArthritis = arthralgiaArthritis;
		return this;
	}

	/**
	 * Get arthralgiaArthritis
	 * 
	 * @return arthralgiaArthritis
	 **/
	@Schema(description = "")
	public YesNoUnknown getArthralgiaArthritis() {
		return arthralgiaArthritis;
	}

	public void setArthralgiaArthritis(YesNoUnknown arthralgiaArthritis) {
		this.arthralgiaArthritis = arthralgiaArthritis;
	}

	public MaternalHistoryDto arthralgiaArthritisOnset(Instant arthralgiaArthritisOnset) {
		this.arthralgiaArthritisOnset = arthralgiaArthritisOnset;
		return this;
	}

	/**
	 * Get arthralgiaArthritisOnset
	 * 
	 * @return arthralgiaArthritisOnset
	 **/
	@Schema(description = "")
	public Instant getArthralgiaArthritisOnset() {
		return arthralgiaArthritisOnset;
	}

	public void setArthralgiaArthritisOnset(Instant arthralgiaArthritisOnset) {
		this.arthralgiaArthritisOnset = arthralgiaArthritisOnset;
	}

	public MaternalHistoryDto arthralgiaArthritisMonth(Integer arthralgiaArthritisMonth) {
		this.arthralgiaArthritisMonth = arthralgiaArthritisMonth;
		return this;
	}

	/**
	 * Get arthralgiaArthritisMonth
	 * 
	 * @return arthralgiaArthritisMonth
	 **/
	@Schema(description = "")
	public Integer getArthralgiaArthritisMonth() {
		return arthralgiaArthritisMonth;
	}

	public void setArthralgiaArthritisMonth(Integer arthralgiaArthritisMonth) {
		this.arthralgiaArthritisMonth = arthralgiaArthritisMonth;
	}

	public MaternalHistoryDto otherComplications(YesNoUnknown otherComplications) {
		this.otherComplications = otherComplications;
		return this;
	}

	/**
	 * Get otherComplications
	 * 
	 * @return otherComplications
	 **/
	@Schema(description = "")
	public YesNoUnknown getOtherComplications() {
		return otherComplications;
	}

	public void setOtherComplications(YesNoUnknown otherComplications) {
		this.otherComplications = otherComplications;
	}

	public MaternalHistoryDto otherComplicationsOnset(Instant otherComplicationsOnset) {
		this.otherComplicationsOnset = otherComplicationsOnset;
		return this;
	}

	/**
	 * Get otherComplicationsOnset
	 * 
	 * @return otherComplicationsOnset
	 **/
	@Schema(description = "")
	public Instant getOtherComplicationsOnset() {
		return otherComplicationsOnset;
	}

	public void setOtherComplicationsOnset(Instant otherComplicationsOnset) {
		this.otherComplicationsOnset = otherComplicationsOnset;
	}

	public MaternalHistoryDto otherComplicationsMonth(Integer otherComplicationsMonth) {
		this.otherComplicationsMonth = otherComplicationsMonth;
		return this;
	}

	/**
	 * Get otherComplicationsMonth
	 * 
	 * @return otherComplicationsMonth
	 **/
	@Schema(description = "")
	public Integer getOtherComplicationsMonth() {
		return otherComplicationsMonth;
	}

	public void setOtherComplicationsMonth(Integer otherComplicationsMonth) {
		this.otherComplicationsMonth = otherComplicationsMonth;
	}

	public MaternalHistoryDto otherComplicationsDetails(String otherComplicationsDetails) {
		this.otherComplicationsDetails = otherComplicationsDetails;
		return this;
	}

	/**
	 * Get otherComplicationsDetails
	 * 
	 * @return otherComplicationsDetails
	 **/
	@Schema(description = "")
	public String getOtherComplicationsDetails() {
		return otherComplicationsDetails;
	}

	public void setOtherComplicationsDetails(String otherComplicationsDetails) {
		this.otherComplicationsDetails = otherComplicationsDetails;
	}

	public MaternalHistoryDto rubella(YesNoUnknown rubella) {
		this.rubella = rubella;
		return this;
	}

	/**
	 * Get rubella
	 * 
	 * @return rubella
	 **/
	@Schema(description = "")
	public YesNoUnknown getRubella() {
		return rubella;
	}

	public void setRubella(YesNoUnknown rubella) {
		this.rubella = rubella;
	}

	public MaternalHistoryDto rubellaOnset(Instant rubellaOnset) {
		this.rubellaOnset = rubellaOnset;
		return this;
	}

	/**
	 * Get rubellaOnset
	 * 
	 * @return rubellaOnset
	 **/
	@Schema(description = "")
	public Instant getRubellaOnset() {
		return rubellaOnset;
	}

	public void setRubellaOnset(Instant rubellaOnset) {
		this.rubellaOnset = rubellaOnset;
	}

	public MaternalHistoryDto rashExposure(YesNoUnknown rashExposure) {
		this.rashExposure = rashExposure;
		return this;
	}

	/**
	 * Get rashExposure
	 * 
	 * @return rashExposure
	 **/
	@Schema(description = "")
	public YesNoUnknown getRashExposure() {
		return rashExposure;
	}

	public void setRashExposure(YesNoUnknown rashExposure) {
		this.rashExposure = rashExposure;
	}

	public MaternalHistoryDto rashExposureDate(Instant rashExposureDate) {
		this.rashExposureDate = rashExposureDate;
		return this;
	}

	/**
	 * Get rashExposureDate
	 * 
	 * @return rashExposureDate
	 **/
	@Schema(description = "")
	public Instant getRashExposureDate() {
		return rashExposureDate;
	}

	public void setRashExposureDate(Instant rashExposureDate) {
		this.rashExposureDate = rashExposureDate;
	}

	public MaternalHistoryDto rashExposureMonth(Integer rashExposureMonth) {
		this.rashExposureMonth = rashExposureMonth;
		return this;
	}

	/**
	 * Get rashExposureMonth
	 * 
	 * @return rashExposureMonth
	 **/
	@Schema(description = "")
	public Integer getRashExposureMonth() {
		return rashExposureMonth;
	}

	public void setRashExposureMonth(Integer rashExposureMonth) {
		this.rashExposureMonth = rashExposureMonth;
	}

	public MaternalHistoryDto rashExposureRegion(RegionReferenceDto rashExposureRegion) {
		this.rashExposureRegion = rashExposureRegion;
		return this;
	}

	/**
	 * Get rashExposureRegion
	 * 
	 * @return rashExposureRegion
	 **/
	@Schema(description = "")
	public RegionReferenceDto getRashExposureRegion() {
		return rashExposureRegion;
	}

	public void setRashExposureRegion(RegionReferenceDto rashExposureRegion) {
		this.rashExposureRegion = rashExposureRegion;
	}

	public MaternalHistoryDto rashExposureDistrict(DistrictReferenceDto rashExposureDistrict) {
		this.rashExposureDistrict = rashExposureDistrict;
		return this;
	}

	/**
	 * Get rashExposureDistrict
	 * 
	 * @return rashExposureDistrict
	 **/
	@Schema(description = "")
	public DistrictReferenceDto getRashExposureDistrict() {
		return rashExposureDistrict;
	}

	public void setRashExposureDistrict(DistrictReferenceDto rashExposureDistrict) {
		this.rashExposureDistrict = rashExposureDistrict;
	}

	public MaternalHistoryDto rashExposureCommunity(CommunityReferenceDto rashExposureCommunity) {
		this.rashExposureCommunity = rashExposureCommunity;
		return this;
	}

	/**
	 * Get rashExposureCommunity
	 * 
	 * @return rashExposureCommunity
	 **/
	@Schema(description = "")
	public CommunityReferenceDto getRashExposureCommunity() {
		return rashExposureCommunity;
	}

	public void setRashExposureCommunity(CommunityReferenceDto rashExposureCommunity) {
		this.rashExposureCommunity = rashExposureCommunity;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MaternalHistoryDto maternalHistoryDto = (MaternalHistoryDto) o;
		return Objects.equals(this.creationDate, maternalHistoryDto.creationDate)
				&& Objects.equals(this.changeDate, maternalHistoryDto.changeDate)
				&& Objects.equals(this.uuid, maternalHistoryDto.uuid)
				&& Objects.equals(this.pseudonymized, maternalHistoryDto.pseudonymized)
				&& Objects.equals(this.childrenNumber, maternalHistoryDto.childrenNumber)
				&& Objects.equals(this.ageAtBirth, maternalHistoryDto.ageAtBirth)
				&& Objects.equals(this.conjunctivitis, maternalHistoryDto.conjunctivitis)
				&& Objects.equals(this.conjunctivitisOnset, maternalHistoryDto.conjunctivitisOnset)
				&& Objects.equals(this.conjunctivitisMonth, maternalHistoryDto.conjunctivitisMonth)
				&& Objects.equals(this.maculopapularRash, maternalHistoryDto.maculopapularRash)
				&& Objects.equals(this.maculopapularRashOnset, maternalHistoryDto.maculopapularRashOnset)
				&& Objects.equals(this.maculopapularRashMonth, maternalHistoryDto.maculopapularRashMonth)
				&& Objects.equals(this.swollenLymphs, maternalHistoryDto.swollenLymphs)
				&& Objects.equals(this.swollenLymphsOnset, maternalHistoryDto.swollenLymphsOnset)
				&& Objects.equals(this.swollenLymphsMonth, maternalHistoryDto.swollenLymphsMonth)
				&& Objects.equals(this.arthralgiaArthritis, maternalHistoryDto.arthralgiaArthritis)
				&& Objects.equals(this.arthralgiaArthritisOnset, maternalHistoryDto.arthralgiaArthritisOnset)
				&& Objects.equals(this.arthralgiaArthritisMonth, maternalHistoryDto.arthralgiaArthritisMonth)
				&& Objects.equals(this.otherComplications, maternalHistoryDto.otherComplications)
				&& Objects.equals(this.otherComplicationsOnset, maternalHistoryDto.otherComplicationsOnset)
				&& Objects.equals(this.otherComplicationsMonth, maternalHistoryDto.otherComplicationsMonth)
				&& Objects.equals(this.otherComplicationsDetails, maternalHistoryDto.otherComplicationsDetails)
				&& Objects.equals(this.rubella, maternalHistoryDto.rubella)
				&& Objects.equals(this.rubellaOnset, maternalHistoryDto.rubellaOnset)
				&& Objects.equals(this.rashExposure, maternalHistoryDto.rashExposure)
				&& Objects.equals(this.rashExposureDate, maternalHistoryDto.rashExposureDate)
				&& Objects.equals(this.rashExposureMonth, maternalHistoryDto.rashExposureMonth)
				&& Objects.equals(this.rashExposureRegion, maternalHistoryDto.rashExposureRegion)
				&& Objects.equals(this.rashExposureDistrict, maternalHistoryDto.rashExposureDistrict)
				&& Objects.equals(this.rashExposureCommunity, maternalHistoryDto.rashExposureCommunity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationDate, changeDate, uuid, pseudonymized, childrenNumber, ageAtBirth, conjunctivitis,
				conjunctivitisOnset, conjunctivitisMonth, maculopapularRash, maculopapularRashOnset, maculopapularRashMonth,
				swollenLymphs, swollenLymphsOnset, swollenLymphsMonth, arthralgiaArthritis, arthralgiaArthritisOnset,
				arthralgiaArthritisMonth, otherComplications, otherComplicationsOnset, otherComplicationsMonth,
				otherComplicationsDetails, rubella, rubellaOnset, rashExposure, rashExposureDate, rashExposureMonth,
				rashExposureRegion, rashExposureDistrict, rashExposureCommunity);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MaternalHistoryDto {\n");

		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
		sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("    pseudonymized: ").append(toIndentedString(pseudonymized)).append("\n");
		sb.append("    childrenNumber: ").append(toIndentedString(childrenNumber)).append("\n");
		sb.append("    ageAtBirth: ").append(toIndentedString(ageAtBirth)).append("\n");
		sb.append("    conjunctivitis: ").append(toIndentedString(conjunctivitis)).append("\n");
		sb.append("    conjunctivitisOnset: ").append(toIndentedString(conjunctivitisOnset)).append("\n");
		sb.append("    conjunctivitisMonth: ").append(toIndentedString(conjunctivitisMonth)).append("\n");
		sb.append("    maculopapularRash: ").append(toIndentedString(maculopapularRash)).append("\n");
		sb.append("    maculopapularRashOnset: ").append(toIndentedString(maculopapularRashOnset)).append("\n");
		sb.append("    maculopapularRashMonth: ").append(toIndentedString(maculopapularRashMonth)).append("\n");
		sb.append("    swollenLymphs: ").append(toIndentedString(swollenLymphs)).append("\n");
		sb.append("    swollenLymphsOnset: ").append(toIndentedString(swollenLymphsOnset)).append("\n");
		sb.append("    swollenLymphsMonth: ").append(toIndentedString(swollenLymphsMonth)).append("\n");
		sb.append("    arthralgiaArthritis: ").append(toIndentedString(arthralgiaArthritis)).append("\n");
		sb.append("    arthralgiaArthritisOnset: ").append(toIndentedString(arthralgiaArthritisOnset)).append("\n");
		sb.append("    arthralgiaArthritisMonth: ").append(toIndentedString(arthralgiaArthritisMonth)).append("\n");
		sb.append("    otherComplications: ").append(toIndentedString(otherComplications)).append("\n");
		sb.append("    otherComplicationsOnset: ").append(toIndentedString(otherComplicationsOnset)).append("\n");
		sb.append("    otherComplicationsMonth: ").append(toIndentedString(otherComplicationsMonth)).append("\n");
		sb.append("    otherComplicationsDetails: ").append(toIndentedString(otherComplicationsDetails)).append("\n");
		sb.append("    rubella: ").append(toIndentedString(rubella)).append("\n");
		sb.append("    rubellaOnset: ").append(toIndentedString(rubellaOnset)).append("\n");
		sb.append("    rashExposure: ").append(toIndentedString(rashExposure)).append("\n");
		sb.append("    rashExposureDate: ").append(toIndentedString(rashExposureDate)).append("\n");
		sb.append("    rashExposureMonth: ").append(toIndentedString(rashExposureMonth)).append("\n");
		sb.append("    rashExposureRegion: ").append(toIndentedString(rashExposureRegion)).append("\n");
		sb.append("    rashExposureDistrict: ").append(toIndentedString(rashExposureDistrict)).append("\n");
		sb.append("    rashExposureCommunity: ").append(toIndentedString(rashExposureCommunity)).append("\n");
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