package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportTypeCreditFacilityFeeType;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportType
 */
public class BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportType   {
  private Object creditFacilityTaxReport = null;

  private BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportTypeCreditFacilityFeeType creditFacilityFeeType = null;

  private String creditFacilityPenalties = null;

  private String creditFacilityCollateralValuation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: A report summarizing tax considerations 
   * @return creditFacilityTaxReport
  **/

  public Object getCreditFacilityTaxReport() {
    return creditFacilityTaxReport;
  }

  public void setCreditFacilityTaxReport(Object creditFacilityTaxReport) {
    this.creditFacilityTaxReport = creditFacilityTaxReport;
  }


  /**
   * Get creditFacilityFeeType
   * @return creditFacilityFeeType
  **/

  public BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportTypeCreditFacilityFeeType getCreditFacilityFeeType() {
    return creditFacilityFeeType;
  }

  public void setCreditFacilityFeeType(BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportTypeCreditFacilityFeeType creditFacilityFeeType) {
    this.creditFacilityFeeType = creditFacilityFeeType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A report detailing penalties incurred as booked against loan account 
   * @return creditFacilityPenalties
  **/

  public String getCreditFacilityPenalties() {
    return creditFacilityPenalties;
  }

  public void setCreditFacilityPenalties(String creditFacilityPenalties) {
    this.creditFacilityPenalties = creditFacilityPenalties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A report detailing the current applied collateral valuation (value confirmed as of date) 
   * @return creditFacilityCollateralValuation
  **/

  public String getCreditFacilityCollateralValuation() {
    return creditFacilityCollateralValuation;
  }

  public void setCreditFacilityCollateralValuation(String creditFacilityCollateralValuation) {
    this.creditFacilityCollateralValuation = creditFacilityCollateralValuation;
  }


}

