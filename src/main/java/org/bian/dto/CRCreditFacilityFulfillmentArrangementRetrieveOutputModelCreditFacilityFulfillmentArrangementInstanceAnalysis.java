package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceAnalysis
 */
public class CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceAnalysis   {
  private String creditFacilityFulfillmentArrangementInstanceAnalysisData = null;

  private String creditFacilityFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object creditFacilityFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditFacilityFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceAnalysisData() {
    return creditFacilityFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceAnalysisData(String creditFacilityFulfillmentArrangementInstanceAnalysisData) {
    this.creditFacilityFulfillmentArrangementInstanceAnalysisData = creditFacilityFulfillmentArrangementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return creditFacilityFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCreditFacilityFulfillmentArrangementInstanceAnalysisReport() {
    return creditFacilityFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceAnalysisReport(Object creditFacilityFulfillmentArrangementInstanceAnalysisReport) {
    this.creditFacilityFulfillmentArrangementInstanceAnalysisReport = creditFacilityFulfillmentArrangementInstanceAnalysisReport;
  }


}

