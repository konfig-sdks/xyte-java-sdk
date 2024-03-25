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
 * DeviceUpdateDeviceResponseState
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DeviceUpdateDeviceResponseState {
  public static final String SERIALIZED_NAME_TEMP = "temp";
  @SerializedName(SERIALIZED_NAME_TEMP)
  private Integer temp = 0;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ECO_MODE = "eco_mode";
  @SerializedName(SERIALIZED_NAME_ECO_MODE)
  private Boolean ecoMode = true;

  public static final String SERIALIZED_NAME_PRESENCE = "presence";
  @SerializedName(SERIALIZED_NAME_PRESENCE)
  private Boolean presence = true;

  public static final String SERIALIZED_NAME_TEMP_DIR = "temp_dir";
  @SerializedName(SERIALIZED_NAME_TEMP_DIR)
  private Integer tempDir = 0;

  public static final String SERIALIZED_NAME_DATA_RATE = "data_rate";
  @SerializedName(SERIALIZED_NAME_DATA_RATE)
  private Integer dataRate = 0;

  public static final String SERIALIZED_NAME_COFFEE_USED = "coffee_used";
  @SerializedName(SERIALIZED_NAME_COFFEE_USED)
  private Integer coffeeUsed = 0;

  public static final String SERIALIZED_NAME_POWER_STATUS = "power_status";
  @SerializedName(SERIALIZED_NAME_POWER_STATUS)
  private Boolean powerStatus = true;

  public static final String SERIALIZED_NAME_AMBIENT_LIGHT = "ambient_light";
  @SerializedName(SERIALIZED_NAME_AMBIENT_LIGHT)
  private Integer ambientLight = 0;

  public static final String SERIALIZED_NAME_DATA_RATE_DIR = "data_rate_dir";
  @SerializedName(SERIALIZED_NAME_DATA_RATE_DIR)
  private Integer dataRateDir = 0;

  public static final String SERIALIZED_NAME_MOTION_SENSOR = "motion_sensor";
  @SerializedName(SERIALIZED_NAME_MOTION_SENSOR)
  private Boolean motionSensor = true;

  public static final String SERIALIZED_NAME_COFFEE_USED_DIR = "coffee_used_dir";
  @SerializedName(SERIALIZED_NAME_COFFEE_USED_DIR)
  private Integer coffeeUsedDir = 0;

  public static final String SERIALIZED_NAME_AMBIENT_LIGHT_DIR = "ambient_light_dir";
  @SerializedName(SERIALIZED_NAME_AMBIENT_LIGHT_DIR)
  private Integer ambientLightDir = 0;

  public DeviceUpdateDeviceResponseState() {
  }

  public DeviceUpdateDeviceResponseState temp(Integer temp) {
    
    
    
    
    this.temp = temp;
    return this;
  }

   /**
   * Get temp
   * @return temp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "39", value = "")

  public Integer getTemp() {
    return temp;
  }


  public void setTemp(Integer temp) {
    
    
    
    this.temp = temp;
  }


  public DeviceUpdateDeviceResponseState status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "online", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public DeviceUpdateDeviceResponseState ecoMode(Boolean ecoMode) {
    
    
    
    
    this.ecoMode = ecoMode;
    return this;
  }

   /**
   * Get ecoMode
   * @return ecoMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getEcoMode() {
    return ecoMode;
  }


  public void setEcoMode(Boolean ecoMode) {
    
    
    
    this.ecoMode = ecoMode;
  }


  public DeviceUpdateDeviceResponseState presence(Boolean presence) {
    
    
    
    
    this.presence = presence;
    return this;
  }

   /**
   * Get presence
   * @return presence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPresence() {
    return presence;
  }


  public void setPresence(Boolean presence) {
    
    
    
    this.presence = presence;
  }


  public DeviceUpdateDeviceResponseState tempDir(Integer tempDir) {
    
    
    
    
    this.tempDir = tempDir;
    return this;
  }

   /**
   * Get tempDir
   * @return tempDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getTempDir() {
    return tempDir;
  }


  public void setTempDir(Integer tempDir) {
    
    
    
    this.tempDir = tempDir;
  }


  public DeviceUpdateDeviceResponseState dataRate(Integer dataRate) {
    
    
    
    
    this.dataRate = dataRate;
    return this;
  }

   /**
   * Get dataRate
   * @return dataRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "")

  public Integer getDataRate() {
    return dataRate;
  }


  public void setDataRate(Integer dataRate) {
    
    
    
    this.dataRate = dataRate;
  }


  public DeviceUpdateDeviceResponseState coffeeUsed(Integer coffeeUsed) {
    
    
    
    
    this.coffeeUsed = coffeeUsed;
    return this;
  }

   /**
   * Get coffeeUsed
   * @return coffeeUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "")

  public Integer getCoffeeUsed() {
    return coffeeUsed;
  }


  public void setCoffeeUsed(Integer coffeeUsed) {
    
    
    
    this.coffeeUsed = coffeeUsed;
  }


  public DeviceUpdateDeviceResponseState powerStatus(Boolean powerStatus) {
    
    
    
    
    this.powerStatus = powerStatus;
    return this;
  }

   /**
   * Get powerStatus
   * @return powerStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getPowerStatus() {
    return powerStatus;
  }


  public void setPowerStatus(Boolean powerStatus) {
    
    
    
    this.powerStatus = powerStatus;
  }


  public DeviceUpdateDeviceResponseState ambientLight(Integer ambientLight) {
    
    
    
    
    this.ambientLight = ambientLight;
    return this;
  }

   /**
   * Get ambientLight
   * @return ambientLight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "")

  public Integer getAmbientLight() {
    return ambientLight;
  }


  public void setAmbientLight(Integer ambientLight) {
    
    
    
    this.ambientLight = ambientLight;
  }


  public DeviceUpdateDeviceResponseState dataRateDir(Integer dataRateDir) {
    
    
    
    
    this.dataRateDir = dataRateDir;
    return this;
  }

   /**
   * Get dataRateDir
   * @return dataRateDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getDataRateDir() {
    return dataRateDir;
  }


  public void setDataRateDir(Integer dataRateDir) {
    
    
    
    this.dataRateDir = dataRateDir;
  }


  public DeviceUpdateDeviceResponseState motionSensor(Boolean motionSensor) {
    
    
    
    
    this.motionSensor = motionSensor;
    return this;
  }

   /**
   * Get motionSensor
   * @return motionSensor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getMotionSensor() {
    return motionSensor;
  }


  public void setMotionSensor(Boolean motionSensor) {
    
    
    
    this.motionSensor = motionSensor;
  }


  public DeviceUpdateDeviceResponseState coffeeUsedDir(Integer coffeeUsedDir) {
    
    
    
    
    this.coffeeUsedDir = coffeeUsedDir;
    return this;
  }

   /**
   * Get coffeeUsedDir
   * @return coffeeUsedDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getCoffeeUsedDir() {
    return coffeeUsedDir;
  }


  public void setCoffeeUsedDir(Integer coffeeUsedDir) {
    
    
    
    this.coffeeUsedDir = coffeeUsedDir;
  }


  public DeviceUpdateDeviceResponseState ambientLightDir(Integer ambientLightDir) {
    
    
    
    
    this.ambientLightDir = ambientLightDir;
    return this;
  }

   /**
   * Get ambientLightDir
   * @return ambientLightDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getAmbientLightDir() {
    return ambientLightDir;
  }


  public void setAmbientLightDir(Integer ambientLightDir) {
    
    
    
    this.ambientLightDir = ambientLightDir;
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
   * @return the DeviceUpdateDeviceResponseState instance itself
   */
  public DeviceUpdateDeviceResponseState putAdditionalProperty(String key, Object value) {
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
    DeviceUpdateDeviceResponseState deviceUpdateDeviceResponseState = (DeviceUpdateDeviceResponseState) o;
    return Objects.equals(this.temp, deviceUpdateDeviceResponseState.temp) &&
        Objects.equals(this.status, deviceUpdateDeviceResponseState.status) &&
        Objects.equals(this.ecoMode, deviceUpdateDeviceResponseState.ecoMode) &&
        Objects.equals(this.presence, deviceUpdateDeviceResponseState.presence) &&
        Objects.equals(this.tempDir, deviceUpdateDeviceResponseState.tempDir) &&
        Objects.equals(this.dataRate, deviceUpdateDeviceResponseState.dataRate) &&
        Objects.equals(this.coffeeUsed, deviceUpdateDeviceResponseState.coffeeUsed) &&
        Objects.equals(this.powerStatus, deviceUpdateDeviceResponseState.powerStatus) &&
        Objects.equals(this.ambientLight, deviceUpdateDeviceResponseState.ambientLight) &&
        Objects.equals(this.dataRateDir, deviceUpdateDeviceResponseState.dataRateDir) &&
        Objects.equals(this.motionSensor, deviceUpdateDeviceResponseState.motionSensor) &&
        Objects.equals(this.coffeeUsedDir, deviceUpdateDeviceResponseState.coffeeUsedDir) &&
        Objects.equals(this.ambientLightDir, deviceUpdateDeviceResponseState.ambientLightDir)&&
        Objects.equals(this.additionalProperties, deviceUpdateDeviceResponseState.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temp, status, ecoMode, presence, tempDir, dataRate, coffeeUsed, powerStatus, ambientLight, dataRateDir, motionSensor, coffeeUsedDir, ambientLightDir, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceUpdateDeviceResponseState {\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ecoMode: ").append(toIndentedString(ecoMode)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    tempDir: ").append(toIndentedString(tempDir)).append("\n");
    sb.append("    dataRate: ").append(toIndentedString(dataRate)).append("\n");
    sb.append("    coffeeUsed: ").append(toIndentedString(coffeeUsed)).append("\n");
    sb.append("    powerStatus: ").append(toIndentedString(powerStatus)).append("\n");
    sb.append("    ambientLight: ").append(toIndentedString(ambientLight)).append("\n");
    sb.append("    dataRateDir: ").append(toIndentedString(dataRateDir)).append("\n");
    sb.append("    motionSensor: ").append(toIndentedString(motionSensor)).append("\n");
    sb.append("    coffeeUsedDir: ").append(toIndentedString(coffeeUsedDir)).append("\n");
    sb.append("    ambientLightDir: ").append(toIndentedString(ambientLightDir)).append("\n");
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
    openapiFields.add("temp");
    openapiFields.add("status");
    openapiFields.add("eco_mode");
    openapiFields.add("presence");
    openapiFields.add("temp_dir");
    openapiFields.add("data_rate");
    openapiFields.add("coffee_used");
    openapiFields.add("power_status");
    openapiFields.add("ambient_light");
    openapiFields.add("data_rate_dir");
    openapiFields.add("motion_sensor");
    openapiFields.add("coffee_used_dir");
    openapiFields.add("ambient_light_dir");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeviceUpdateDeviceResponseState
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeviceUpdateDeviceResponseState.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceUpdateDeviceResponseState is not found in the empty JSON string", DeviceUpdateDeviceResponseState.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceUpdateDeviceResponseState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceUpdateDeviceResponseState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceUpdateDeviceResponseState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceUpdateDeviceResponseState.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceUpdateDeviceResponseState>() {
           @Override
           public void write(JsonWriter out, DeviceUpdateDeviceResponseState value) throws IOException {
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
           public DeviceUpdateDeviceResponseState read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeviceUpdateDeviceResponseState instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeviceUpdateDeviceResponseState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceUpdateDeviceResponseState
  * @throws IOException if the JSON string is invalid with respect to DeviceUpdateDeviceResponseState
  */
  public static DeviceUpdateDeviceResponseState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceUpdateDeviceResponseState.class);
  }

 /**
  * Convert an instance of DeviceUpdateDeviceResponseState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

