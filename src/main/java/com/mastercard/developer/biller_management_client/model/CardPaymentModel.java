/*
 * Bill Pay Exchange Biller Management API
 * Biller Management Service
 *
 * OpenAPI spec version: 1.0.0
 * Contact: Bill_Pay_Development_Support@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.biller_management_client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Biller Card Payment Model
 */
@ApiModel(description = "Biller Card Payment Model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-30T10:30:57.815-06:00[America/Chicago]")
public class CardPaymentModel {
  public static final String SERIALIZED_NAME_CARD_ENABLED = "cardEnabled";
  @SerializedName(SERIALIZED_NAME_CARD_ENABLED)
  private String cardEnabled;

  public static final String SERIALIZED_NAME_CARD_NETWORKS = "cardNetworks";
  @SerializedName(SERIALIZED_NAME_CARD_NETWORKS)
  private List<String> cardNetworks = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CARD_TYPES = "cardTypes";
  @SerializedName(SERIALIZED_NAME_CARD_TYPES)
  private List<String> cardTypes = new ArrayList<String>();

  public CardPaymentModel cardEnabled(String cardEnabled) {
    this.cardEnabled = cardEnabled;
    return this;
  }

   /**
   * Card Payment Support Flag, avaliable values are: Yes, No
   * @return cardEnabled
  **/
  @ApiModelProperty(example = "Yes", required = true, value = "Card Payment Support Flag, avaliable values are: Yes, No")
  public String getCardEnabled() {
    return cardEnabled;
  }

  public void setCardEnabled(String cardEnabled) {
    this.cardEnabled = cardEnabled;
  }

  public CardPaymentModel cardNetworks(List<String> cardNetworks) {
    this.cardNetworks = cardNetworks;
    return this;
  }

  public CardPaymentModel addCardNetworksItem(String cardNetworksItem) {
    this.cardNetworks.add(cardNetworksItem);
    return this;
  }

   /**
   * Card Networks, avaliable values are: MAST, VISA, AMEX, DSVR
   * @return cardNetworks
  **/
  @ApiModelProperty(example = "[\"MAST\",\"VISA\"]", required = true, value = "Card Networks, avaliable values are: MAST, VISA, AMEX, DSVR")
  public List<String> getCardNetworks() {
    return cardNetworks;
  }

  public void setCardNetworks(List<String> cardNetworks) {
    this.cardNetworks = cardNetworks;
  }

  public CardPaymentModel cardTypes(List<String> cardTypes) {
    this.cardTypes = cardTypes;
    return this;
  }

  public CardPaymentModel addCardTypesItem(String cardTypesItem) {
    this.cardTypes.add(cardTypesItem);
    return this;
  }

   /**
   * Card Types, avaliable values are: CRDT, DEBT, PRPD
   * @return cardTypes
  **/
  @ApiModelProperty(example = "[\"CRDT\"]", required = true, value = "Card Types, avaliable values are: CRDT, DEBT, PRPD")
  public List<String> getCardTypes() {
    return cardTypes;
  }

  public void setCardTypes(List<String> cardTypes) {
    this.cardTypes = cardTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardPaymentModel cardPaymentModel = (CardPaymentModel) o;
    return Objects.equals(this.cardEnabled, cardPaymentModel.cardEnabled) &&
        Objects.equals(this.cardNetworks, cardPaymentModel.cardNetworks) &&
        Objects.equals(this.cardTypes, cardPaymentModel.cardTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardEnabled, cardNetworks, cardTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardPaymentModel {\n");

    sb.append("    cardEnabled: ").append(toIndentedString(cardEnabled)).append("\n");
    sb.append("    cardNetworks: ").append(toIndentedString(cardNetworks)).append("\n");
    sb.append("    cardTypes: ").append(toIndentedString(cardTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
