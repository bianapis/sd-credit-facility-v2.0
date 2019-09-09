package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportTypeCreditFacilityFeeType
 */
public class BQMaintenanceRequestInputModelMaintenanceInstanceRecordMaintenanceReportTypeCreditFacilityFeeType   {
  private String creditFacilityFees = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A report detailing fees applied to the loan account (range of fees possible for different actions) 
   * @return creditFacilityFees
  **/

  public String getCreditFacilityFees() {
    return creditFacilityFees;
  }

  public void setCreditFacilityFees(String creditFacilityFees) {
    this.creditFacilityFees = creditFacilityFees;
  }


}

