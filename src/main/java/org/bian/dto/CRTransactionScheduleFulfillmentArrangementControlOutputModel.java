package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementControlOutputModel
 */
public class CRTransactionScheduleFulfillmentArrangementControlOutputModel   {
  private String transactionScheduleFulfillmentArrangementControlActionTaskReference = null;

  private Object transactionScheduleFulfillmentArrangementControlActionTaskRecord = null;

  private String transactionScheduleFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Schedule Fulfillment Arrangement instance control processing service call 
   * @return transactionScheduleFulfillmentArrangementControlActionTaskReference
  **/

  public String getTransactionScheduleFulfillmentArrangementControlActionTaskReference() {
    return transactionScheduleFulfillmentArrangementControlActionTaskReference;
  }

  public void setTransactionScheduleFulfillmentArrangementControlActionTaskReference(String transactionScheduleFulfillmentArrangementControlActionTaskReference) {
    this.transactionScheduleFulfillmentArrangementControlActionTaskReference = transactionScheduleFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return transactionScheduleFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getTransactionScheduleFulfillmentArrangementControlActionTaskRecord() {
    return transactionScheduleFulfillmentArrangementControlActionTaskRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementControlActionTaskRecord(Object transactionScheduleFulfillmentArrangementControlActionTaskRecord) {
    this.transactionScheduleFulfillmentArrangementControlActionTaskRecord = transactionScheduleFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return transactionScheduleFulfillmentArrangementControlActionResponse
  **/

  public String getTransactionScheduleFulfillmentArrangementControlActionResponse() {
    return transactionScheduleFulfillmentArrangementControlActionResponse;
  }

  public void setTransactionScheduleFulfillmentArrangementControlActionResponse(String transactionScheduleFulfillmentArrangementControlActionResponse) {
    this.transactionScheduleFulfillmentArrangementControlActionResponse = transactionScheduleFulfillmentArrangementControlActionResponse;
  }


}

