package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementExecuteInputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecord
 */
public class CRTransactionScheduleFulfillmentArrangementExecuteInputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecord   {
  private String transactionScheduleWorkTaskType = null;

  private String transactionScheduleWorkTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;


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


}

