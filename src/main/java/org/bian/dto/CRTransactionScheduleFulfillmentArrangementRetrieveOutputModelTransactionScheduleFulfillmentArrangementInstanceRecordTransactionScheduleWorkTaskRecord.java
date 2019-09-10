package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecordTransacScheTaskFeeTransac;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecord
 */
public class CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecord   {
  private String transactionScheduleWorkTaskType = null;

  private String transactionScheduleWorkTaskDescription = null;

  private String transactionScheduleWorkTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String transactionScheduleWorkTaskResult = null;

  private CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecordTransacScheTaskFeeTransac transactionScheduleTaskFeeTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. generate report/notification) 
   * @return transactionScheduleWorkTaskType
  **/

  public String getTransactionScheduleWorkTaskType() {
    return transactionScheduleWorkTaskType;
  }

  public void setTransactionScheduleWorkTaskType(String transactionScheduleWorkTaskType) {
    this.transactionScheduleWorkTaskType = transactionScheduleWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the task performed 
   * @return transactionScheduleWorkTaskDescription
  **/

  public String getTransactionScheduleWorkTaskDescription() {
    return transactionScheduleWorkTaskDescription;
  }

  public void setTransactionScheduleWorkTaskDescription(String transactionScheduleWorkTaskDescription) {
    this.transactionScheduleWorkTaskDescription = transactionScheduleWorkTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the work task 
   * @return transactionScheduleWorkTaskWorkProducts
  **/

  public String getTransactionScheduleWorkTaskWorkProducts() {
    return transactionScheduleWorkTaskWorkProducts;
  }

  public void setTransactionScheduleWorkTaskWorkProducts(String transactionScheduleWorkTaskWorkProducts) {
    this.transactionScheduleWorkTaskWorkProducts = transactionScheduleWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task 
   * @return transactionScheduleWorkTaskResult
  **/

  public String getTransactionScheduleWorkTaskResult() {
    return transactionScheduleWorkTaskResult;
  }

  public void setTransactionScheduleWorkTaskResult(String transactionScheduleWorkTaskResult) {
    this.transactionScheduleWorkTaskResult = transactionScheduleWorkTaskResult;
  }


  /**
   * Get transactionScheduleTaskFeeTransaction
   * @return transactionScheduleTaskFeeTransaction
  **/

  public CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecordTransacScheTaskFeeTransac getTransactionScheduleTaskFeeTransaction() {
    return transactionScheduleTaskFeeTransaction;
  }

  public void setTransactionScheduleTaskFeeTransaction(CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecordTransacScheTaskFeeTransac transactionScheduleTaskFeeTransaction) {
    this.transactionScheduleTaskFeeTransaction = transactionScheduleTaskFeeTransaction;
  }


}

