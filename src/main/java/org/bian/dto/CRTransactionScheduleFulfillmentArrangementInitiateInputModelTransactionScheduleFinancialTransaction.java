package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransactionDateType;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction
 */
public class CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction   {
  private CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransactionDateType dateType = null;


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

