/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CreditFacilityApiServiceImpl implements CreditFacilityApiService {

	public SDCreditFacilityActivateOutputModel activate(SDCreditFacilityActivateInputModel request){
		return JsonReader.read("activate-SDCreditFacilityActivateOutputModel.json",new TypeReference<SDCreditFacilityActivateOutputModel>(){});
	}
	
	public SDCreditFacilityConfigureOutputModel configure(String sdReferenceId, SDCreditFacilityConfigureInputModel request){
		return JsonReader.read("configure-SDCreditFacilityConfigureOutputModel.json",new TypeReference<SDCreditFacilityConfigureOutputModel>(){});
	}
	
	public CRCreditFacilityFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCreditFacilityFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRCreditFacilityFulfillmentArrangementControlOutputModel.json",new TypeReference<CRCreditFacilityFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQRestructuringExchangeOutputModel exchangeRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringExchangeInputModel request){
		return JsonReader.read("exchange-BQRestructuringExchangeOutputModel.json",new TypeReference<BQRestructuringExchangeOutputModel>(){});
	}
	
	public BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request){
		return JsonReader.read("execute-BQRepaymentExecuteOutputModel.json",new TypeReference<BQRepaymentExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public SDCreditFacilityFeedbackOutputModel feedback(String sdReferenceId, SDCreditFacilityFeedbackInputModel request){
		return JsonReader.read("feedback-SDCreditFacilityFeedbackOutputModel.json",new TypeReference<SDCreditFacilityFeedbackOutputModel>(){});
	}
	
	public CRCreditFacilityFulfillmentArrangementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCreditFacilityFulfillmentArrangementGrantInputModel request){
		return JsonReader.read("grant-CRCreditFacilityFulfillmentArrangementGrantOutputModel.json",new TypeReference<CRCreditFacilityFulfillmentArrangementGrantOutputModel>(){});
	}
	
	public CRCreditFacilityFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCreditFacilityFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCreditFacilityFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRCreditFacilityFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQRestructuringInitiateOutputModel initiateRestructuring(String sdReferenceId, String crReferenceId, BQRestructuringInitiateInputModel request){
		return JsonReader.read("initiate-BQRestructuringInitiateOutputModel.json",new TypeReference<BQRestructuringInitiateOutputModel>(){});
	}
	
	public BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request){
		return JsonReader.read("request-BQMaintenanceRequestOutputModel.json",new TypeReference<BQMaintenanceRequestOutputModel>(){});
	}
	
	public BQRepaymentRequestOutputModel requestRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentRequestInputModel request){
		return JsonReader.read("request-BQRepaymentRequestOutputModel.json",new TypeReference<BQRepaymentRequestOutputModel>(){});
	}
	
	public BQRestructuringRequestOutputModel requestRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringRequestInputModel request){
		return JsonReader.read("request-BQRestructuringRequestOutputModel.json",new TypeReference<BQRestructuringRequestOutputModel>(){});
	}
	
	public CRCreditFacilityFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCreditFacilityFulfillmentArrangementRequestInputModel request){
		return JsonReader.read("request-CRCreditFacilityFulfillmentArrangementRequestOutputModel.json",new TypeReference<CRCreditFacilityFulfillmentArrangementRequestOutputModel>(){});
	}
	
	public CRCreditFacilityFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCreditFacilityFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRCreditFacilityFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMaintenanceRetrieveOutputModel.json",new TypeReference<BQMaintenanceRetrieveOutputModel>(){});
	}
	
	public BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRepaymentRetrieveOutputModel.json",new TypeReference<BQRepaymentRetrieveOutputModel>(){});
	}
	
	public BQRestructuringRetrieveOutputModel retrieveRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRestructuringRetrieveOutputModel.json",new TypeReference<BQRestructuringRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCreditFacilityRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCreditFacilityRetrieveOutputModel.json",new TypeReference<SDCreditFacilityRetrieveOutputModel>(){});
	}
	
	public CRCreditFacilityFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditFacilityFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCreditFacilityFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRCreditFacilityFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request){
		return JsonReader.read("update-BQRepaymentUpdateOutputModel.json",new TypeReference<BQRepaymentUpdateOutputModel>(){});
	}
	
	public BQRestructuringUpdateOutputModel updateRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringUpdateInputModel request){
		return JsonReader.read("update-BQRestructuringUpdateOutputModel.json",new TypeReference<BQRestructuringUpdateOutputModel>(){});
	}
	
}
