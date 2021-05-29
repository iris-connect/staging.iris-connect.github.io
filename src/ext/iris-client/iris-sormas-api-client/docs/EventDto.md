# EventDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**changeDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**uuid** | **String** |  |  [optional]
**pseudonymized** | **Boolean** |  |  [optional]
**superordinateEvent** | [**EventReferenceDto**](EventReferenceDto.md) |  |  [optional]
**eventStatus** | [**EventStatus**](EventStatus.md) |  | 
**riskLevel** | [**RiskLevel**](RiskLevel.md) |  |  [optional]
**eventInvestigationStatus** | [**EventInvestigationStatus**](EventInvestigationStatus.md) |  |  [optional]
**eventInvestigationStartDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**eventInvestigationEndDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**externalId** | **String** |  |  [optional]
**externalToken** | **String** |  |  [optional]
**eventTitle** | **String** |  |  [optional]
**eventDesc** | **String** |  | 
**nosocomial** | [**YesNoUnknown**](YesNoUnknown.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**reportDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**reportingUser** | [**UserReferenceDto**](UserReferenceDto.md) |  | 
**evolutionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**evolutionComment** | **String** |  |  [optional]
**eventLocation** | [**LocationDto**](LocationDto.md) |  |  [optional]
**typeOfPlace** | [**TypeOfPlace**](TypeOfPlace.md) |  |  [optional]
**meansOfTransport** | [**MeansOfTransport**](MeansOfTransport.md) |  |  [optional]
**meansOfTransportDetails** | **String** |  |  [optional]
**connectionNumber** | **String** |  |  [optional]
**travelDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**srcType** | [**EventSourceType**](EventSourceType.md) |  |  [optional]
**srcInstitutionalPartnerType** | [**InstitutionalPartnerType**](InstitutionalPartnerType.md) |  |  [optional]
**srcInstitutionalPartnerTypeDetails** | **String** |  |  [optional]
**srcFirstName** | **String** |  |  [optional]
**srcLastName** | **String** |  |  [optional]
**srcTelNo** | **String** |  |  [optional]
**srcEmail** | **String** |  |  [optional]
**srcMediaWebsite** | **String** |  |  [optional]
**srcMediaName** | **String** |  |  [optional]
**srcMediaDetails** | **String** |  |  [optional]
**disease** | [**Disease**](Disease.md) |  |  [optional]
**diseaseDetails** | **String** |  |  [optional]
**surveillanceOfficer** | [**UserReferenceDto**](UserReferenceDto.md) |  |  [optional]
**typeOfPlaceText** | **String** |  |  [optional]
**reportLat** | **Double** |  |  [optional]
**reportLon** | **Double** |  |  [optional]
**reportLatLonAccuracy** | **Float** |  |  [optional]
**transregionalOutbreak** | [**YesNoUnknown**](YesNoUnknown.md) |  |  [optional]
**diseaseTransmissionMode** | [**DiseaseTransmissionMode**](DiseaseTransmissionMode.md) |  |  [optional]
**multiDayEvent** | **Boolean** |  |  [optional]