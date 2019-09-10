package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransactionDateType;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFinancialTransaction
 */
public class CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFinancialTransaction   {
  private String transactionScheduleFinancialTransactionProductInstanceReference = null;

  private String transactionScheduleFinancialTransactionType = null;

  private String transactionScheduleFinancialTransactionDescription = null;

  private String transactionScheduleFinancialTransactionAmount = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String correspondenceInstanceReference = null;

  private CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransactionDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Identifies the payment source of the transaction - usually a reference to the parent product instance 
   * @return transactionScheduleFinancialTransactionProductInstanceReference
  **/

  public String getTransactionScheduleFinancialTransactionProductInstanceReference() {
    return transactionScheduleFinancialTransactionProductInstanceReference;
  }

  public void setTransactionScheduleFinancialTransactionProductInstanceReference(String transactionScheduleFinancialTransactionProductInstanceReference) {
    this.transactionScheduleFinancialTransactionProductInstanceReference = transactionScheduleFinancialTransactionProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The sub-type of financial transaction 
   * @return transactionScheduleFinancialTransactionType
  **/

  public String getTransactionScheduleFinancialTransactionType() {
    return transactionScheduleFinancialTransactionType;
  }

  public void setTransactionScheduleFinancialTransactionType(String transactionScheduleFinancialTransactionType) {
    this.transactionScheduleFinancialTransactionType = transactionScheduleFinancialTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any necessary details describing the purpose or reference properties of the transaction 
   * @return transactionScheduleFinancialTransactionDescription
  **/

  public String getTransactionScheduleFinancialTransactionDescription() {
    return transactionScheduleFinancialTransactionDescription;
  }

  public void setTransactionScheduleFinancialTransactionDescription(String transactionScheduleFinancialTransactionDescription) {
    this.transactionScheduleFinancialTransactionDescription = transactionScheduleFinancialTransactionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The volume or value of the transaction 
   * @return transactionScheduleFinancialTransactionAmount
  **/

  public String getTransactionScheduleFinancialTransactionAmount() {
    return transactionScheduleFinancialTransactionAmount;
  }

  public void setTransactionScheduleFinancialTransactionAmount(String transactionScheduleFinancialTransactionAmount) {
    this.transactionScheduleFinancialTransactionAmount = transactionScheduleFinancialTransactionAmount;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondence generated for the transaction (e.g. confirmation note) 
   * @return correspondenceInstanceReference
  **/

  public String getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransactionDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransactionDateType dateType) {
    this.dateType = dateType;
  }


}

