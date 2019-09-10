package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord
 */
public class CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord   {
  private String transactionScheduleFulfillmentArrangementInstanceReportReference = null;

  private String transactionScheduleFulfillmentArrangementInstanceReportType = null;

  private String transactionScheduleFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return transactionScheduleFulfillmentArrangementInstanceReportReference
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceReportReference() {
    return transactionScheduleFulfillmentArrangementInstanceReportReference;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReportReference(String transactionScheduleFulfillmentArrangementInstanceReportReference) {
    this.transactionScheduleFulfillmentArrangementInstanceReportReference = transactionScheduleFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionScheduleFulfillmentArrangementInstanceReportType
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceReportType() {
    return transactionScheduleFulfillmentArrangementInstanceReportType;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReportType(String transactionScheduleFulfillmentArrangementInstanceReportType) {
    this.transactionScheduleFulfillmentArrangementInstanceReportType = transactionScheduleFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transactionScheduleFulfillmentArrangementInstanceReportParameters
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceReportParameters() {
    return transactionScheduleFulfillmentArrangementInstanceReportParameters;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReportParameters(String transactionScheduleFulfillmentArrangementInstanceReportParameters) {
    this.transactionScheduleFulfillmentArrangementInstanceReportParameters = transactionScheduleFulfillmentArrangementInstanceReportParameters;
  }


}

