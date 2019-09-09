package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceReportRecord
 */
public class CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceReportRecord   {
  private String creditFacilityFulfillmentArrangementInstanceReportData = null;

  private String creditFacilityFulfillmentArrangementInstanceReportType = null;

  private Object creditFacilityFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditFacilityFulfillmentArrangementInstanceReportData
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceReportData() {
    return creditFacilityFulfillmentArrangementInstanceReportData;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceReportData(String creditFacilityFulfillmentArrangementInstanceReportData) {
    this.creditFacilityFulfillmentArrangementInstanceReportData = creditFacilityFulfillmentArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditFacilityFulfillmentArrangementInstanceReport
  **/

  public Object getCreditFacilityFulfillmentArrangementInstanceReport() {
    return creditFacilityFulfillmentArrangementInstanceReport;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceReport(Object creditFacilityFulfillmentArrangementInstanceReport) {
    this.creditFacilityFulfillmentArrangementInstanceReport = creditFacilityFulfillmentArrangementInstanceReport;
  }


}

