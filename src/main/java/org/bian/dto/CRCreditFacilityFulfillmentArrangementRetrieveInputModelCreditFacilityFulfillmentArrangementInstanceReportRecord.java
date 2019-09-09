package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceReportRecord
 */
public class CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceReportRecord   {
  private String creditFacilityFulfillmentArrangementInstanceReportReference = null;

  private String creditFacilityFulfillmentArrangementInstanceReportType = null;

  private String creditFacilityFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditFacilityFulfillmentArrangementInstanceReportReference
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceReportReference() {
    return creditFacilityFulfillmentArrangementInstanceReportReference;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceReportReference(String creditFacilityFulfillmentArrangementInstanceReportReference) {
    this.creditFacilityFulfillmentArrangementInstanceReportReference = creditFacilityFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditFacilityFulfillmentArrangementInstanceReportType
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceReportType() {
    return creditFacilityFulfillmentArrangementInstanceReportType;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceReportType(String creditFacilityFulfillmentArrangementInstanceReportType) {
    this.creditFacilityFulfillmentArrangementInstanceReportType = creditFacilityFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return creditFacilityFulfillmentArrangementInstanceReportParameters
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceReportParameters() {
    return creditFacilityFulfillmentArrangementInstanceReportParameters;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceReportParameters(String creditFacilityFulfillmentArrangementInstanceReportParameters) {
    this.creditFacilityFulfillmentArrangementInstanceReportParameters = creditFacilityFulfillmentArrangementInstanceReportParameters;
  }


}

