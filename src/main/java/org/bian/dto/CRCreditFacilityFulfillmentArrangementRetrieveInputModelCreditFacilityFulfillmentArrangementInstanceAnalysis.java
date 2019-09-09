package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceAnalysis
 */
public class CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceAnalysis   {
  private String creditFacilityFulfillmentArrangementInstanceAnalysisReference = null;

  private String creditFacilityFulfillmentArrangementInstanceAnalysisReportType = null;

  private String creditFacilityFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return creditFacilityFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceAnalysisReference() {
    return creditFacilityFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceAnalysisReference(String creditFacilityFulfillmentArrangementInstanceAnalysisReference) {
    this.creditFacilityFulfillmentArrangementInstanceAnalysisReference = creditFacilityFulfillmentArrangementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditFacilityFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceAnalysisReportType() {
    return creditFacilityFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceAnalysisReportType(String creditFacilityFulfillmentArrangementInstanceAnalysisReportType) {
    this.creditFacilityFulfillmentArrangementInstanceAnalysisReportType = creditFacilityFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditFacilityFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceAnalysisParameters() {
    return creditFacilityFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceAnalysisParameters(String creditFacilityFulfillmentArrangementInstanceAnalysisParameters) {
    this.creditFacilityFulfillmentArrangementInstanceAnalysisParameters = creditFacilityFulfillmentArrangementInstanceAnalysisParameters;
  }


}

