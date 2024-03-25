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
import com.konfigthis.client.model.DeviceGetInfoResponseConfig;
import com.konfigthis.client.model.DeviceGetInfoResponseCustom;
import com.konfigthis.client.model.DeviceGetInfoResponsePartner;
import com.konfigthis.client.model.DeviceGetInfoResponseState;
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
 * DeviceGetInfoResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DeviceGetInfoResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PARTNER = "partner";
  @SerializedName(SERIALIZED_NAME_PARTNER)
  private DeviceGetInfoResponsePartner partner;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private DeviceGetInfoResponseConfig config;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private DeviceGetInfoResponseState state;

  public static final String SERIALIZED_NAME_LAST_SEEN = "last_seen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private String lastSeen;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private DeviceGetInfoResponseCustom custom;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FIRMWARE_VERSION = "firmware_version";
  @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION)
  private String firmwareVersion;

  public static final String SERIALIZED_NAME_CLAIMED = "claimed";
  @SerializedName(SERIALIZED_NAME_CLAIMED)
  private String claimed;

  public DeviceGetInfoResponse() {
  }

  public DeviceGetInfoResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99xxxxx-xxxx-xxxx-xxxx-xxxxxxxxxx", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public DeviceGetInfoResponse partner(DeviceGetInfoResponsePartner partner) {
    
    
    
    
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceGetInfoResponsePartner getPartner() {
    return partner;
  }


  public void setPartner(DeviceGetInfoResponsePartner partner) {
    
    
    
    this.partner = partner;
  }


  public DeviceGetInfoResponse config(DeviceGetInfoResponseConfig config) {
    
    
    
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceGetInfoResponseConfig getConfig() {
    return config;
  }


  public void setConfig(DeviceGetInfoResponseConfig config) {
    
    
    
    this.config = config;
  }


  public DeviceGetInfoResponse state(DeviceGetInfoResponseState state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceGetInfoResponseState getState() {
    return state;
  }


  public void setState(DeviceGetInfoResponseState state) {
    
    
    
    this.state = state;
  }


  public DeviceGetInfoResponse lastSeen(String lastSeen) {
    
    
    
    
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-17T09:55:35.250Z", value = "")

  public String getLastSeen() {
    return lastSeen;
  }


  public void setLastSeen(String lastSeen) {
    
    
    
    this.lastSeen = lastSeen;
  }


  public DeviceGetInfoResponse custom(DeviceGetInfoResponseCustom custom) {
    
    
    
    
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceGetInfoResponseCustom getCustom() {
    return custom;
  }


  public void setCustom(DeviceGetInfoResponseCustom custom) {
    
    
    
    this.custom = custom;
  }


  public DeviceGetInfoResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Phone 550- Desktop", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public DeviceGetInfoResponse firmwareVersion(String firmwareVersion) {
    
    
    
    
    this.firmwareVersion = firmwareVersion;
    return this;
  }

   /**
   * Get firmwareVersion
   * @return firmwareVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0.2", value = "")

  public String getFirmwareVersion() {
    return firmwareVersion;
  }


  public void setFirmwareVersion(String firmwareVersion) {
    
    
    
    this.firmwareVersion = firmwareVersion;
  }


  public DeviceGetInfoResponse claimed(String claimed) {
    
    
    
    
    this.claimed = claimed;
    return this;
  }

   /**
   * Get claimed
   * @return claimed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xvision lab", value = "")

  public String getClaimed() {
    return claimed;
  }


  public void setClaimed(String claimed) {
    
    
    
    this.claimed = claimed;
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
   * @return the DeviceGetInfoResponse instance itself
   */
  public DeviceGetInfoResponse putAdditionalProperty(String key, Object value) {
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
    DeviceGetInfoResponse deviceGetInfoResponse = (DeviceGetInfoResponse) o;
    return Objects.equals(this.id, deviceGetInfoResponse.id) &&
        Objects.equals(this.partner, deviceGetInfoResponse.partner) &&
        Objects.equals(this.config, deviceGetInfoResponse.config) &&
        Objects.equals(this.state, deviceGetInfoResponse.state) &&
        Objects.equals(this.lastSeen, deviceGetInfoResponse.lastSeen) &&
        Objects.equals(this.custom, deviceGetInfoResponse.custom) &&
        Objects.equals(this.name, deviceGetInfoResponse.name) &&
        Objects.equals(this.firmwareVersion, deviceGetInfoResponse.firmwareVersion) &&
        Objects.equals(this.claimed, deviceGetInfoResponse.claimed)&&
        Objects.equals(this.additionalProperties, deviceGetInfoResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, partner, config, state, lastSeen, custom, name, firmwareVersion, claimed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceGetInfoResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    claimed: ").append(toIndentedString(claimed)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("partner");
    openapiFields.add("config");
    openapiFields.add("state");
    openapiFields.add("last_seen");
    openapiFields.add("custom");
    openapiFields.add("name");
    openapiFields.add("firmware_version");
    openapiFields.add("claimed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeviceGetInfoResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeviceGetInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceGetInfoResponse is not found in the empty JSON string", DeviceGetInfoResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `partner`
      if (jsonObj.get("partner") != null && !jsonObj.get("partner").isJsonNull()) {
        DeviceGetInfoResponsePartner.validateJsonObject(jsonObj.getAsJsonObject("partner"));
      }
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        DeviceGetInfoResponseConfig.validateJsonObject(jsonObj.getAsJsonObject("config"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        DeviceGetInfoResponseState.validateJsonObject(jsonObj.getAsJsonObject("state"));
      }
      if ((jsonObj.get("last_seen") != null && !jsonObj.get("last_seen").isJsonNull()) && !jsonObj.get("last_seen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_seen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_seen").toString()));
      }
      // validate the optional field `custom`
      if (jsonObj.get("custom") != null && !jsonObj.get("custom").isJsonNull()) {
        DeviceGetInfoResponseCustom.validateJsonObject(jsonObj.getAsJsonObject("custom"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("firmware_version") != null && !jsonObj.get("firmware_version").isJsonNull()) && !jsonObj.get("firmware_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firmware_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firmware_version").toString()));
      }
      if ((jsonObj.get("claimed") != null && !jsonObj.get("claimed").isJsonNull()) && !jsonObj.get("claimed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `claimed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("claimed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceGetInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceGetInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceGetInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceGetInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceGetInfoResponse>() {
           @Override
           public void write(JsonWriter out, DeviceGetInfoResponse value) throws IOException {
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
           public DeviceGetInfoResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeviceGetInfoResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeviceGetInfoResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceGetInfoResponse
  * @throws IOException if the JSON string is invalid with respect to DeviceGetInfoResponse
  */
  public static DeviceGetInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceGetInfoResponse.class);
  }

 /**
  * Convert an instance of DeviceGetInfoResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

