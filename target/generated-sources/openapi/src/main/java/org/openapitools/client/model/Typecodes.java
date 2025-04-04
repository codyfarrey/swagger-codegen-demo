/*
 * IB REST API
 * The IB REST API reference documentation
 *
 * The version of the OpenAPI document: 2.13.0
 * Contact: api@interactivebrokers.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Many FYI endpoints reference a “typecode” value. The table below lists the available codes and what they correspond to.   * &#x60;BA&#x60; - Borrow Availability   * &#x60;CA&#x60; - Comparable Algo   * &#x60;DA&#x60; - Dividends Advisory   * &#x60;EA&#x60; - Upcoming Earnings   * &#x60;MF&#x60; - Mutual Fund Advisory   * &#x60;OE&#x60; - Option Expiration   * &#x60;PR&#x60; - Portfolio Builder Rebalance   * &#x60;SE&#x60; - Suspend Order on Economic Event   * &#x60;SG&#x60; - Short Term Gain turning Long Term   * &#x60;SM&#x60; - System Messages   * &#x60;T2&#x60; - Assignment Realizing Long-Term Gains   * &#x60;TO&#x60; - Takeover   * &#x60;UA&#x60; - User Alert   * &#x60;M8&#x60; - M871 Trades   * &#x60;PS&#x60; - Platform Use Suggestions   * &#x60;DL&#x60; - Unexercised Option Loss Prevention Reminder   * &#x60;PT&#x60; - Position Transfer   * &#x60;CB&#x60; - Missing Cost Basis   * &#x60;MS&#x60; - Milestones   * &#x60;TD&#x60; - MiFID || 10% Deprecation Notice   * &#x60;ST&#x60; - Save Taxes   * &#x60;TI&#x60; - Trade Idea   * &#x60;CT&#x60; - Cash Transfer 
 */
@JsonAdapter(Typecodes.Adapter.class)
public enum Typecodes {
  
  BA("BA"),
  
  CA("CA"),
  
  DA("DA"),
  
  EA("EA"),
  
  MF("MF"),
  
  OE("OE"),
  
  PR("PR"),
  
  SE("SE"),
  
  SG("SG"),
  
  SM("SM"),
  
  T2("T2"),
  
  TO("TO"),
  
  UA("UA"),
  
  M8("M8"),
  
  PS("PS"),
  
  DL("DL"),
  
  PT("PT"),
  
  CB("CB"),
  
  MS("MS"),
  
  TD("TD"),
  
  ST("ST"),
  
  TI("TI"),
  
  CT("CT");

  private String value;

  Typecodes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Typecodes fromValue(String value) {
    for (Typecodes b : Typecodes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Typecodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final Typecodes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Typecodes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Typecodes.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Typecodes.fromValue(value);
  }
}

