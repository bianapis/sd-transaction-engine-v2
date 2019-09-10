package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFinancialTransaction;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementInitiateOutputModel
 */
public class CRTransactionScheduleFulfillmentArrangementInitiateOutputModel   {
  private String transactionScheduleFulfillmentArrangementInstanceReference = null;

  private String transactionScheduleFulfillmentArrangementInitiateActionReference = null;

  private Object transactionScheduleFulfillmentArrangementInitiateActionRecord = null;

  private String transactionScheduleFulfillmentArrangementInstanceStatus = null;

  private CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord = null;

  private CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionScheduleFulfillmentArrangementInitiateActionReference
  **/

  public String getTransactionScheduleFulfillmentArrangementInitiateActionReference() {
    return transactionScheduleFulfillmentArrangementInitiateActionReference;
  }

  public void setTransactionScheduleFulfillmentArrangementInitiateActionReference(String transactionScheduleFulfillmentArrangementInitiateActionReference) {
    this.transactionScheduleFulfillmentArrangementInitiateActionReference = transactionScheduleFulfillmentArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionScheduleFulfillmentArrangementInitiateActionRecord
  **/

  public Object getTransactionScheduleFulfillmentArrangementInitiateActionRecord() {
    return transactionScheduleFulfillmentArrangementInitiateActionRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInitiateActionRecord(Object transactionScheduleFulfillmentArrangementInitiateActionRecord) {
    this.transactionScheduleFulfillmentArrangementInitiateActionRecord = transactionScheduleFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Schedule Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return transactionScheduleFulfillmentArrangementInstanceStatus
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceStatus() {
    return transactionScheduleFulfillmentArrangementInstanceStatus;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceStatus(String transactionScheduleFulfillmentArrangementInstanceStatus) {
    this.transactionScheduleFulfillmentArrangementInstanceStatus = transactionScheduleFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get transactionScheduleFulfillmentArrangementInstanceRecord
   * @return transactionScheduleFulfillmentArrangementInstanceRecord
  **/

  public CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord getTransactionScheduleFulfillmentArrangementInstanceRecord() {
    return transactionScheduleFulfillmentArrangementInstanceRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceRecord(CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord) {
    this.transactionScheduleFulfillmentArrangementInstanceRecord = transactionScheduleFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get transactionScheduleFinancialTransaction
   * @return transactionScheduleFinancialTransaction
  **/

  public CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFinancialTransaction getTransactionScheduleFinancialTransaction() {
    return transactionScheduleFinancialTransaction;
  }

  public void setTransactionScheduleFinancialTransaction(CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction) {
    this.transactionScheduleFinancialTransaction = transactionScheduleFinancialTransaction;
  }


}

