package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecordTransactionScheduleTaskFeeTransaction
 */
public class CRTransactionScheduleFulfillmentArrangementInitiateOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecordTransacScheTaskFeeTransac   {
  private String transactionScheduleWorkTaskFeeTransactionDescription = null;

  private String transactionScheduleWorkTaskFeeTransactionType = null;

  private String transactionScheduleWorkTaskFeeTransactionCharge = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the fee 
   * @return transactionScheduleWorkTaskFeeTransactionDescription
  **/

  public String getTransactionScheduleWorkTaskFeeTransactionDescription() {
    return transactionScheduleWorkTaskFeeTransactionDescription;
  }

  public void setTransactionScheduleWorkTaskFeeTransactionDescription(String transactionScheduleWorkTaskFeeTransactionDescription) {
    this.transactionScheduleWorkTaskFeeTransactionDescription = transactionScheduleWorkTaskFeeTransactionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The fee type applied 
   * @return transactionScheduleWorkTaskFeeTransactionType
  **/

  public String getTransactionScheduleWorkTaskFeeTransactionType() {
    return transactionScheduleWorkTaskFeeTransactionType;
  }

  public void setTransactionScheduleWorkTaskFeeTransactionType(String transactionScheduleWorkTaskFeeTransactionType) {
    this.transactionScheduleWorkTaskFeeTransactionType = transactionScheduleWorkTaskFeeTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The derived fee amount to be charged 
   * @return transactionScheduleWorkTaskFeeTransactionCharge
  **/

  public String getTransactionScheduleWorkTaskFeeTransactionCharge() {
    return transactionScheduleWorkTaskFeeTransactionCharge;
  }

  public void setTransactionScheduleWorkTaskFeeTransactionCharge(String transactionScheduleWorkTaskFeeTransactionCharge) {
    this.transactionScheduleWorkTaskFeeTransactionCharge = transactionScheduleWorkTaskFeeTransactionCharge;
  }


}

