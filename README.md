<div align="left">

[![Visit Xyte](./header.png)](https://xyte.io)

# [Xyte](https://xyte.io)

Xyte's Device Cloud is the first all-in-one servitization platform designed for device and hardware manufacturers to cloudify, operate, support, and commercialize their connected devices in a unified platform. 

We enable OEMs across different industries to navigate their digital journey, transforming their devices into integrated business solutions that combine hardware, software and services. The only business and commerce platform designed specifically for IoT device manufacturers, our fully-federated Device Cloud empowers OEMs to manage the complete lifecycle of their devices, from the minute they leave the warehouse through aftermarket sales to end customers.

Our out-of-the-box applications for asset management, remote support, ecommerce and subscription management, financing, and a powerful and secure back office suite help OEMs boost revenue and market growth, optimize operational efficiencies, gain instant insights into equipment and device performance, and develop sustainable customer relationships.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Xyte&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>xyte-java-sdk</artifactId>
  <version>1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:xyte-java-sdk:1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/xyte-java-sdk-1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Xyte;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeviceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://url";
    
    configuration.sec0  = "YOUR API KEY";
    Xyte client = new Xyte(configuration);
    String RAW_BODY = "RAW_BODY_example";
    String deviceId = "deviceId_example";
    String dumpId = "dumpId_example";
    try {
      DeviceAppendDumpFileResponse result = client
              .device
              .appendDumpFile(RAW_BODY, deviceId, dumpId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLength());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#appendDumpFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceAppendDumpFileResponse> response = client
              .device
              .appendDumpFile(RAW_BODY, deviceId, dumpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#appendDumpFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://url*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DeviceApi* | [**appendDumpFile**](docs/DeviceApi.md#appendDumpFile) | **PUT** /v1/devices/{deviceId}/dumps/{dumpId} | Append Dump File
*DeviceApi* | [**closeIncident**](docs/DeviceApi.md#closeIncident) | **DELETE** /v1/devices/{deviceId}/incidents/{incidentId} | Close Incident
*DeviceApi* | [**createRegistration**](docs/DeviceApi.md#createRegistration) | **POST** /v1/devices | Register Device
*DeviceApi* | [**deleteDevice**](docs/DeviceApi.md#deleteDevice) | **DELETE** /core/v1/partner/devices/{device_id} | Delete Device
*DeviceApi* | [**getAllDeviceStateHistories**](docs/DeviceApi.md#getAllDeviceStateHistories) | **GET** /core/v1/partner/devices/histories | Get All Device&#39;s State History
*DeviceApi* | [**getChildDevices**](docs/DeviceApi.md#getChildDevices) | **GET** /v1/devices/{parent_id}/children | Get Child Devices
*DeviceApi* | [**getCommand**](docs/DeviceApi.md#getCommand) | **GET** /v1/devices/{deviceId}/command | Get Command
*DeviceApi* | [**getConfig**](docs/DeviceApi.md#getConfig) | **GET** /v1/devices/{deviceId}/config | Get Config
*DeviceApi* | [**getConfig_0**](docs/DeviceApi.md#getConfig_0) | **GET** /core/v1/partner/devices/{device_id}/config | Get Device Configuration
*DeviceApi* | [**getFile**](docs/DeviceApi.md#getFile) | **GET** /v1/devices/{deviceId}/files/{fileUuid} | Get File
*DeviceApi* | [**getFiles**](docs/DeviceApi.md#getFiles) | **GET** /v1/devices/{deviceId}/files | Get Files
*DeviceApi* | [**getIncidents**](docs/DeviceApi.md#getIncidents) | **GET** /v1/devices/{deviceId}/incidents | Get Incidents
*DeviceApi* | [**getInfo**](docs/DeviceApi.md#getInfo) | **GET** /v1/devices/{deviceId} | Get Device Info
*DeviceApi* | [**getInfo_0**](docs/DeviceApi.md#getInfo_0) | **GET** /core/v1/partner/devices/{device_id} | Get Device Info
*DeviceApi* | [**getLicense**](docs/DeviceApi.md#getLicense) | **GET** /v1/devices/{deviceId}/license | Get License
*DeviceApi* | [**getLicenses**](docs/DeviceApi.md#getLicenses) | **GET** /v1/devices/{deviceId}/licenses | Get Licenses
*DeviceApi* | [**getSpaceInfo**](docs/DeviceApi.md#getSpaceInfo) | **GET** /v1/devices/{deviceId}/space | Get Space Info
*DeviceApi* | [**getStateHistory**](docs/DeviceApi.md#getStateHistory) | **GET** /core/v1/partner/devices/{device_id}/history | Get Device State History
*DeviceApi* | [**getTelemetries**](docs/DeviceApi.md#getTelemetries) | **GET** /core/v1/partner/devices/{device_id}/telemetries | Get Device Telemetries
*DeviceApi* | [**listCommands**](docs/DeviceApi.md#listCommands) | **GET** /core/v1/partner/devices/{device_id}/commands | Get Device Commands
*DeviceApi* | [**listDevices**](docs/DeviceApi.md#listDevices) | **GET** /core/v1/partner/devices | List Devices
*DeviceApi* | [**openIncident**](docs/DeviceApi.md#openIncident) | **POST** /v1/devices/{deviceId}/incidents | Open Incident
*DeviceApi* | [**registerChildDevice**](docs/DeviceApi.md#registerChildDevice) | **POST** /v1/devices/{parent_id}/children | Register Child Device
*DeviceApi* | [**sendChildTelemetries**](docs/DeviceApi.md#sendChildTelemetries) | **POST** /v1/devices/{deviceId}/children/telemetries | Send Child Telemetries
*DeviceApi* | [**sendCommand**](docs/DeviceApi.md#sendCommand) | **POST** /v1/devices/{deviceId}/command | Update Command
*DeviceApi* | [**sendDumpFile**](docs/DeviceApi.md#sendDumpFile) | **POST** /v1/devices/{deviceId}/dumps/{mime-type}/{filename} | Send Dump
*DeviceApi* | [**sendTelemetry**](docs/DeviceApi.md#sendTelemetry) | **POST** /v1/devices/{deviceId}/telemetry | Send Telemetry
*DeviceApi* | [**setConfig**](docs/DeviceApi.md#setConfig) | **POST** /v1/devices/{deviceId}/config | Set Config
*DeviceApi* | [**updateCloudSettings**](docs/DeviceApi.md#updateCloudSettings) | **PUT** /v1/devices/{deviceId}/cloud_settings | Set Cloud Settings
*DeviceApi* | [**updateDevice**](docs/DeviceApi.md#updateDevice) | **PUT** /v1/devices/{deviceId} | Update Device
*DeviceApi* | [**updateLicense**](docs/DeviceApi.md#updateLicense) | **POST** /v1/devices/{deviceId}/licenses | Update License
*TicketApi* | [**addComment**](docs/TicketApi.md#addComment) | **POST** /core/v1/partner/tickets/{ticket_id}/message | Add Comment
*TicketApi* | [**close**](docs/TicketApi.md#close) | **POST** /core/v1/partner/tickets/{ticket_id}/resolved | Close Ticket
*TicketApi* | [**getById**](docs/TicketApi.md#getById) | **GET** /core/v1/partner/tickets/{ticket_id} (COPY) | Get Ticket
*TicketApi* | [**list**](docs/TicketApi.md#list) | **GET** /core/v1/partner/tickets | List Tickets
*TicketApi* | [**updateTicketById**](docs/TicketApi.md#updateTicketById) | **PUT** /core/v1/partner/tickets/{ticket_id} | Update Ticket


## Documentation for Models

 - [DeviceAppendDumpFileRequest](docs/DeviceAppendDumpFileRequest.md)
 - [DeviceAppendDumpFileResponse](docs/DeviceAppendDumpFileResponse.md)
 - [DeviceCloseIncidentResponse](docs/DeviceCloseIncidentResponse.md)
 - [DeviceCreateRegistrationRequest](docs/DeviceCreateRegistrationRequest.md)
 - [DeviceCreateRegistrationResponse](docs/DeviceCreateRegistrationResponse.md)
 - [DeviceDeleteDeviceResponse](docs/DeviceDeleteDeviceResponse.md)
 - [DeviceGetChildDevicesResponseInner](docs/DeviceGetChildDevicesResponseInner.md)
 - [DeviceGetConfig200Response](docs/DeviceGetConfig200Response.md)
 - [DeviceGetConfigResponse](docs/DeviceGetConfigResponse.md)
 - [DeviceGetConfigResponseConfig](docs/DeviceGetConfigResponseConfig.md)
 - [DeviceGetConfigResponseConfigNetwork](docs/DeviceGetConfigResponseConfigNetwork.md)
 - [DeviceGetConfigResponseConfigOther](docs/DeviceGetConfigResponseConfigOther.md)
 - [DeviceGetIncidentsResponse](docs/DeviceGetIncidentsResponse.md)
 - [DeviceGetInfo200Response](docs/DeviceGetInfo200Response.md)
 - [DeviceGetInfo200ResponseDataInner](docs/DeviceGetInfo200ResponseDataInner.md)
 - [DeviceGetInfo200ResponseDataInnerFirmware](docs/DeviceGetInfo200ResponseDataInnerFirmware.md)
 - [DeviceGetInfo200ResponseDataInnerModel](docs/DeviceGetInfo200ResponseDataInnerModel.md)
 - [DeviceGetInfo200ResponsePageInfo](docs/DeviceGetInfo200ResponsePageInfo.md)
 - [DeviceGetInfoResponse](docs/DeviceGetInfoResponse.md)
 - [DeviceGetInfoResponseConfig](docs/DeviceGetInfoResponseConfig.md)
 - [DeviceGetInfoResponseCustom](docs/DeviceGetInfoResponseCustom.md)
 - [DeviceGetInfoResponsePartner](docs/DeviceGetInfoResponsePartner.md)
 - [DeviceGetInfoResponseState](docs/DeviceGetInfoResponseState.md)
 - [DeviceGetSpaceInfoResponse](docs/DeviceGetSpaceInfoResponse.md)
 - [DeviceGetSpaceInfoResponseLocation](docs/DeviceGetSpaceInfoResponseLocation.md)
 - [DeviceGetSpaceInfoResponseLocationCoordinates](docs/DeviceGetSpaceInfoResponseLocationCoordinates.md)
 - [DeviceGetTelemetriesResponseInner](docs/DeviceGetTelemetriesResponseInner.md)
 - [DeviceGetTelemetriesResponseInnerTelemetries](docs/DeviceGetTelemetriesResponseInnerTelemetries.md)
 - [DeviceListCommandsResponse](docs/DeviceListCommandsResponse.md)
 - [DeviceListCommandsResponseDataInner](docs/DeviceListCommandsResponseDataInner.md)
 - [DeviceListCommandsResponsePageInfo](docs/DeviceListCommandsResponsePageInfo.md)
 - [DeviceListDevicesResponse](docs/DeviceListDevicesResponse.md)
 - [DeviceListDevicesResponseDataInner](docs/DeviceListDevicesResponseDataInner.md)
 - [DeviceListDevicesResponseDataInnerFirmware](docs/DeviceListDevicesResponseDataInnerFirmware.md)
 - [DeviceListDevicesResponseDataInnerModel](docs/DeviceListDevicesResponseDataInnerModel.md)
 - [DeviceListDevicesResponsePageInfo](docs/DeviceListDevicesResponsePageInfo.md)
 - [DeviceOpenIncidentRequest](docs/DeviceOpenIncidentRequest.md)
 - [DeviceOpenIncidentResponse](docs/DeviceOpenIncidentResponse.md)
 - [DeviceRegisterChildDeviceRequest](docs/DeviceRegisterChildDeviceRequest.md)
 - [DeviceRegisterChildDeviceResponse](docs/DeviceRegisterChildDeviceResponse.md)
 - [DeviceSendChildTelemetriesRequest](docs/DeviceSendChildTelemetriesRequest.md)
 - [DeviceSendChildTelemetriesResponse](docs/DeviceSendChildTelemetriesResponse.md)
 - [DeviceSendChildTelemetriesResponse11303e815d564910A47268676375d995](docs/DeviceSendChildTelemetriesResponse11303e815d564910A47268676375d995.md)
 - [DeviceSendChildTelemetriesResponseB4adc7484462493381739d40e0a17d22](docs/DeviceSendChildTelemetriesResponseB4adc7484462493381739d40e0a17d22.md)
 - [DeviceSendCommandRequest](docs/DeviceSendCommandRequest.md)
 - [DeviceSendCommandResponse](docs/DeviceSendCommandResponse.md)
 - [DeviceSendDumpFileRequest](docs/DeviceSendDumpFileRequest.md)
 - [DeviceSendDumpFileResponse](docs/DeviceSendDumpFileResponse.md)
 - [DeviceSendTelemetryRequest](docs/DeviceSendTelemetryRequest.md)
 - [DeviceSendTelemetryResponse](docs/DeviceSendTelemetryResponse.md)
 - [DeviceSetConfigRequest](docs/DeviceSetConfigRequest.md)
 - [DeviceSetConfigResponse](docs/DeviceSetConfigResponse.md)
 - [DeviceUpdateCloudSettingsRequest](docs/DeviceUpdateCloudSettingsRequest.md)
 - [DeviceUpdateDeviceRequest](docs/DeviceUpdateDeviceRequest.md)
 - [DeviceUpdateDeviceResponse](docs/DeviceUpdateDeviceResponse.md)
 - [DeviceUpdateDeviceResponseConfig](docs/DeviceUpdateDeviceResponseConfig.md)
 - [DeviceUpdateDeviceResponseDetails](docs/DeviceUpdateDeviceResponseDetails.md)
 - [DeviceUpdateDeviceResponsePartner](docs/DeviceUpdateDeviceResponsePartner.md)
 - [DeviceUpdateDeviceResponseState](docs/DeviceUpdateDeviceResponseState.md)
 - [DeviceUpdateLicenseRequest](docs/DeviceUpdateLicenseRequest.md)
 - [DeviceUpdateLicenseResponse](docs/DeviceUpdateLicenseResponse.md)
 - [TicketAddCommentRequest](docs/TicketAddCommentRequest.md)
 - [TicketAddCommentResponse](docs/TicketAddCommentResponse.md)
 - [TicketAddCommentResponseCommentsInner](docs/TicketAddCommentResponseCommentsInner.md)
 - [TicketCloseResponse](docs/TicketCloseResponse.md)
 - [TicketCloseResponseCommentsInner](docs/TicketCloseResponseCommentsInner.md)
 - [TicketGetByIdResponse](docs/TicketGetByIdResponse.md)
 - [TicketGetByIdResponseCommentsInner](docs/TicketGetByIdResponseCommentsInner.md)
 - [TicketListResponseInner](docs/TicketListResponseInner.md)
 - [TicketUpdateTicketByIdRequest](docs/TicketUpdateTicketByIdRequest.md)
 - [TicketUpdateTicketByIdResponse](docs/TicketUpdateTicketByIdResponse.md)
 - [TicketUpdateTicketByIdResponseCommentsInner](docs/TicketUpdateTicketByIdResponseCommentsInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
