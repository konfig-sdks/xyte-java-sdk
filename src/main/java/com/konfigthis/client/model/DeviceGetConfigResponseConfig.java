/*
 * Testing API
 * Xyte's Device Cloud is the first all-in-one servitization platform designed for device and hardware manufacturers to cloudify, operate, support, and commercialize their connected devices in a unified platform.   We enable OEMs across different industries to navigate their digital journey, transforming their devices into integrated business solutions that combine hardware, software and services. The only business and commerce platform designed specifically for IoT device manufacturers, our fully-federated Device Cloud empowers OEMs to manage the complete lifecycle of their devices, from the minute they leave the warehouse through aftermarket sales to end customers.  Our out-of-the-box applications for asset management, remote support, ecommerce and subscription management, financing, and a powerful and secure back office suite help OEMs boost revenue and market growth, optimize operational efficiencies, gain instant insights into equipment and device performance, and develop sustainable customer relationships.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.DeviceGetConfigResponseConfigNetwork;
import com.konfigthis.client.model.DeviceGetConfigResponseConfigOther;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * DeviceGetConfigResponseConfig
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DeviceGetConfigResponseConfig {
  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private DeviceGetConfigResponseConfigNetwork network;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private DeviceGetConfigResponseConfigOther other;

  public DeviceGetConfigResponseConfig() {
  }

  public DeviceGetConfigResponseConfig network(DeviceGetConfigResponseConfigNetwork network) {
    
    
    
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceGetConfigResponseConfigNetwork getNetwork() {
    return network;
  }


  public void setNetwork(DeviceGetConfigResponseConfigNetwork network) {
    
    
    
    this.network = network;
  }


  public DeviceGetConfigResponseConfig other(DeviceGetConfigResponseConfigOther other) {
    
    
    
    
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceGetConfigResponseConfigOther getOther() {
    return other;
  }


  public void setOther(DeviceGetConfigResponseConfigOther other) {
    
    
    
    this.other = other;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DeviceGetConfigResponseConfig instance itself
   */
  public DeviceGetConfigResponseConfig putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceGetConfigResponseConfig deviceGetConfigResponseConfig = (DeviceGetConfigResponseConfig) o;
    return Objects.equals(this.network, deviceGetConfigResponseConfig.network) &&
        Objects.equals(this.other, deviceGetConfigResponseConfig.other)&&
        Objects.equals(this.additionalProperties, deviceGetConfigResponseConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, other, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceGetConfigResponseConfig {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("network");
    openapiFields.add("other");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeviceGetConfigResponseConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeviceGetConfigResponseConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceGetConfigResponseConfig is not found in the empty JSON string", DeviceGetConfigResponseConfig.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `network`
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) {
        DeviceGetConfigResponseConfigNetwork.validateJsonObject(jsonObj.getAsJsonObject("network"));
      }
      // validate the optional field `other`
      if (jsonObj.get("other") != null && !jsonObj.get("other").isJsonNull()) {
        DeviceGetConfigResponseConfigOther.validateJsonObject(jsonObj.getAsJsonObject("other"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceGetConfigResponseConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceGetConfigResponseConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceGetConfigResponseConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceGetConfigResponseConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceGetConfigResponseConfig>() {
           @Override
           public void write(JsonWriter out, DeviceGetConfigResponseConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DeviceGetConfigResponseConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeviceGetConfigResponseConfig instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeviceGetConfigResponseConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceGetConfigResponseConfig
  * @throws IOException if the JSON string is invalid with respect to DeviceGetConfigResponseConfig
  */
  public static DeviceGetConfigResponseConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceGetConfigResponseConfig.class);
  }

 /**
  * Convert an instance of DeviceGetConfigResponseConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

