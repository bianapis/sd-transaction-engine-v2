package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementExecuteInputModelExecuteRecordType;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementExecuteInputModelTransactionScheduleFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementExecuteInputModel
 */
public class CRTransactionScheduleFulfillmentArrangementExecuteInputModel   {
  private String transactionEngineServicingSessionReference = null;

  private String transactionScheduleFulfillmentArrangementInstanceReference = null;

  private CRTransactionScheduleFulfillmentArrangementExecuteInputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord = null;

  private CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction = null;

  private Object transactionScheduleFulfillmentArrangementExecuteActionTaskRecord = null;

  private CRTransactionScheduleFulfillmentArrangementExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * Get transactionScheduleFulfillmentArrangementInstanceRecord
   * @return transactionScheduleFulfillmentArrangementInstanceRecord
  **/

  public CRTransactionScheduleFulfillmentArrangementExecuteInputModelTransactionScheduleFulfillmentArrangementInstanceRecord getTransactionScheduleFulfillmentArrangementInstanceRecord() {
    return transactionScheduleFulfillmentArrangementInstanceRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceRecord(CRTransactionScheduleFulfillmentArrangementExecuteInputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord) {
    this.transactionScheduleFulfillmentArrangementInstanceRecord = transactionScheduleFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get transactionScheduleFinancialTransaction
   * @return transactionScheduleFinancialTransaction
  **/

  public CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction getTransactionScheduleFinancialTransaction() {
    return transactionScheduleFinancialTransaction;
  }

  public void setTransactionScheduleFinancialTransaction(CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction) {
    this.transactionScheduleFinancialTransaction = transactionScheduleFinancialTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return transactionScheduleFulfillmentArrangementExecuteActionTaskRecord
  **/

  public Object getTransactionScheduleFulfillmentArrangementExecuteActionTaskRecord() {
    return transactionScheduleFulfillmentArrangementExecuteActionTaskRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementExecuteActionTaskRecord(Object transactionScheduleFulfillmentArrangementExecuteActionTaskRecord) {
    this.transactionScheduleFulfillmentArrangementExecuteActionTaskRecord = transactionScheduleFulfillmentArrangementExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRTransactionScheduleFulfillmentArrangementExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRTransactionScheduleFulfillmentArrangementExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

