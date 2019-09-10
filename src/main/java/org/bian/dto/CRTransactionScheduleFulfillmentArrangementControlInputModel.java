package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementControlInputModelTransactionScheduleFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementControlInputModel
 */
public class CRTransactionScheduleFulfillmentArrangementControlInputModel   {
  private String transactionEngineServicingSessionReference = null;

  private String transactionScheduleFulfillmentArrangementInstanceReference = null;

  private Object transactionScheduleFulfillmentArrangementControlActionTaskRecord = null;

  private CRTransactionScheduleFulfillmentArrangementControlInputModelTransactionScheduleFulfillmentArrangementControlActionRequest transactionScheduleFulfillmentArrangementControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return transactionEngineServicingSessionReference
  **/

  public String getTransactionEngineServicingSessionReference() {
    return transactionEngineServicingSessionReference;
  }

  public void setTransactionEngineServicingSessionReference(String transactionEngineServicingSessionReference) {
    this.transactionEngineServicingSessionReference = transactionEngineServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Schedule Fulfillment Arrangement instance 
   * @return transactionScheduleFulfillmentArrangementInstanceReference
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceReference() {
    return transactionScheduleFulfillmentArrangementInstanceReference;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReference(String transactionScheduleFulfillmentArrangementInstanceReference) {
    this.transactionScheduleFulfillmentArrangementInstanceReference = transactionScheduleFulfillmentArrangementInstanceReference;
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
   * Get transactionScheduleFulfillmentArrangementControlActionRequest
   * @return transactionScheduleFulfillmentArrangementControlActionRequest
  **/

  public CRTransactionScheduleFulfillmentArrangementControlInputModelTransactionScheduleFulfillmentArrangementControlActionRequest getTransactionScheduleFulfillmentArrangementControlActionRequest() {
    return transactionScheduleFulfillmentArrangementControlActionRequest;
  }

  public void setTransactionScheduleFulfillmentArrangementControlActionRequest(CRTransactionScheduleFulfillmentArrangementControlInputModelTransactionScheduleFulfillmentArrangementControlActionRequest transactionScheduleFulfillmentArrangementControlActionRequest) {
    this.transactionScheduleFulfillmentArrangementControlActionRequest = transactionScheduleFulfillmentArrangementControlActionRequest;
  }


}

