package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementExchangeOutputModel
 */
public class CRTransactionScheduleFulfillmentArrangementExchangeOutputModel   {
  private String transactionScheduleFulfillmentArrangementExchangeActionTaskReference = null;

  private Object transactionScheduleFulfillmentArrangementExchangeActionTaskRecord = null;

  private String transactionScheduleFulfillmentArrangementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Schedule Fulfillment Arrangement instance exchange service call 
   * @return transactionScheduleFulfillmentArrangementExchangeActionTaskReference
  **/

  public String getTransactionScheduleFulfillmentArrangementExchangeActionTaskReference() {
    return transactionScheduleFulfillmentArrangementExchangeActionTaskReference;
  }

  public void setTransactionScheduleFulfillmentArrangementExchangeActionTaskReference(String transactionScheduleFulfillmentArrangementExchangeActionTaskReference) {
    this.transactionScheduleFulfillmentArrangementExchangeActionTaskReference = transactionScheduleFulfillmentArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return transactionScheduleFulfillmentArrangementExchangeActionTaskRecord
  **/

  public Object getTransactionScheduleFulfillmentArrangementExchangeActionTaskRecord() {
    return transactionScheduleFulfillmentArrangementExchangeActionTaskRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementExchangeActionTaskRecord(Object transactionScheduleFulfillmentArrangementExchangeActionTaskRecord) {
    this.transactionScheduleFulfillmentArrangementExchangeActionTaskRecord = transactionScheduleFulfillmentArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return transactionScheduleFulfillmentArrangementExchangeActionResponse
  **/

  public String getTransactionScheduleFulfillmentArrangementExchangeActionResponse() {
    return transactionScheduleFulfillmentArrangementExchangeActionResponse;
  }

  public void setTransactionScheduleFulfillmentArrangementExchangeActionResponse(String transactionScheduleFulfillmentArrangementExchangeActionResponse) {
    this.transactionScheduleFulfillmentArrangementExchangeActionResponse = transactionScheduleFulfillmentArrangementExchangeActionResponse;
  }


}

