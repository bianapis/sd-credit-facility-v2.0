/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CreditFacilityApiService {

	SDCreditFacilityActivateOutputModel activate(SDCreditFacilityActivateInputModel request);
	
	SDCreditFacilityConfigureOutputModel configure(String sdReferenceId, SDCreditFacilityConfigureInputModel request);
	
	CRCreditFacilityFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCreditFacilityFulfillmentArrangementControlInputModel request);
	
	BQRestructuringExchangeOutputModel exchangeRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringExchangeInputModel request);
	
	BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	SDCreditFacilityFeedbackOutputModel feedback(String sdReferenceId, SDCreditFacilityFeedbackInputModel request);
	
	CRCreditFacilityFulfillmentArrangementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCreditFacilityFulfillmentArrangementGrantInputModel request);
	
	CRCreditFacilityFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCreditFacilityFulfillmentArrangementInitiateInputModel request);
	
	BQRestructuringInitiateOutputModel initiateRestructuring(String sdReferenceId, String crReferenceId, BQRestructuringInitiateInputModel request);
	
	BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request);
	
	BQRepaymentRequestOutputModel requestRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentRequestInputModel request);
	
	BQRestructuringRequestOutputModel requestRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringRequestInputModel request);
	
	CRCreditFacilityFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCreditFacilityFulfillmentArrangementRequestInputModel request);
	
	CRCreditFacilityFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRestructuringRetrieveOutputModel retrieveRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCreditFacilityRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCreditFacilityFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditFacilityFulfillmentArrangementUpdateInputModel request);
	
	BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request);
	
	BQRestructuringUpdateOutputModel updateRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringUpdateInputModel request);
	
}
