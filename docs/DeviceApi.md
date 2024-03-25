# DeviceApi

All URIs are relative to *http://url*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appendDumpFile**](DeviceApi.md#appendDumpFile) | **PUT** /v1/devices/{deviceId}/dumps/{dumpId} | Append Dump File |
| [**closeIncident**](DeviceApi.md#closeIncident) | **DELETE** /v1/devices/{deviceId}/incidents/{incidentId} | Close Incident |
| [**createRegistration**](DeviceApi.md#createRegistration) | **POST** /v1/devices | Register Device |
| [**deleteDevice**](DeviceApi.md#deleteDevice) | **DELETE** /core/v1/partner/devices/{device_id} | Delete Device |
| [**getAllDeviceStateHistories**](DeviceApi.md#getAllDeviceStateHistories) | **GET** /core/v1/partner/devices/histories | Get All Device&#39;s State History |
| [**getChildDevices**](DeviceApi.md#getChildDevices) | **GET** /v1/devices/{parent_id}/children | Get Child Devices |
| [**getCommand**](DeviceApi.md#getCommand) | **GET** /v1/devices/{deviceId}/command | Get Command |
| [**getConfig**](DeviceApi.md#getConfig) | **GET** /v1/devices/{deviceId}/config | Get Config |
| [**getConfig_0**](DeviceApi.md#getConfig_0) | **GET** /core/v1/partner/devices/{device_id}/config | Get Device Configuration |
| [**getFile**](DeviceApi.md#getFile) | **GET** /v1/devices/{deviceId}/files/{fileUuid} | Get File |
| [**getFiles**](DeviceApi.md#getFiles) | **GET** /v1/devices/{deviceId}/files | Get Files |
| [**getIncidents**](DeviceApi.md#getIncidents) | **GET** /v1/devices/{deviceId}/incidents | Get Incidents |
| [**getInfo**](DeviceApi.md#getInfo) | **GET** /v1/devices/{deviceId} | Get Device Info |
| [**getInfo_0**](DeviceApi.md#getInfo_0) | **GET** /core/v1/partner/devices/{device_id} | Get Device Info |
| [**getLicense**](DeviceApi.md#getLicense) | **GET** /v1/devices/{deviceId}/license | Get License |
| [**getLicenses**](DeviceApi.md#getLicenses) | **GET** /v1/devices/{deviceId}/licenses | Get Licenses |
| [**getSpaceInfo**](DeviceApi.md#getSpaceInfo) | **GET** /v1/devices/{deviceId}/space | Get Space Info |
| [**getStateHistory**](DeviceApi.md#getStateHistory) | **GET** /core/v1/partner/devices/{device_id}/history | Get Device State History |
| [**getTelemetries**](DeviceApi.md#getTelemetries) | **GET** /core/v1/partner/devices/{device_id}/telemetries | Get Device Telemetries |
| [**listCommands**](DeviceApi.md#listCommands) | **GET** /core/v1/partner/devices/{device_id}/commands | Get Device Commands |
| [**listDevices**](DeviceApi.md#listDevices) | **GET** /core/v1/partner/devices | List Devices |
| [**openIncident**](DeviceApi.md#openIncident) | **POST** /v1/devices/{deviceId}/incidents | Open Incident |
| [**registerChildDevice**](DeviceApi.md#registerChildDevice) | **POST** /v1/devices/{parent_id}/children | Register Child Device |
| [**sendChildTelemetries**](DeviceApi.md#sendChildTelemetries) | **POST** /v1/devices/{deviceId}/children/telemetries | Send Child Telemetries |
| [**sendCommand**](DeviceApi.md#sendCommand) | **POST** /v1/devices/{deviceId}/command | Update Command |
| [**sendDumpFile**](DeviceApi.md#sendDumpFile) | **POST** /v1/devices/{deviceId}/dumps/{mime-type}/{filename} | Send Dump |
| [**sendTelemetry**](DeviceApi.md#sendTelemetry) | **POST** /v1/devices/{deviceId}/telemetry | Send Telemetry |
| [**setConfig**](DeviceApi.md#setConfig) | **POST** /v1/devices/{deviceId}/config | Set Config |
| [**updateCloudSettings**](DeviceApi.md#updateCloudSettings) | **PUT** /v1/devices/{deviceId}/cloud_settings | Set Cloud Settings |
| [**updateDevice**](DeviceApi.md#updateDevice) | **PUT** /v1/devices/{deviceId} | Update Device |
| [**updateLicense**](DeviceApi.md#updateLicense) | **POST** /v1/devices/{deviceId}/licenses | Update License |


<a name="appendDumpFile"></a>
# **appendDumpFile**
> DeviceAppendDumpFileResponse appendDumpFile(deviceId, dumpId).deviceAppendDumpFileRequest(deviceAppendDumpFileRequest).execute();

Append Dump File



### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **dumpId** | **String**|  | |
| **deviceAppendDumpFileRequest** | [**DeviceAppendDumpFileRequest**](DeviceAppendDumpFileRequest.md)|  | [optional] |

### Return type

[**DeviceAppendDumpFileResponse**](DeviceAppendDumpFileResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="closeIncident"></a>
# **closeIncident**
> DeviceCloseIncidentResponse closeIncident(deviceId, incidentId).execute();

Close Incident



### Example
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
    String deviceId = "deviceId_example"; // Unique Device ID
    String incidentId = "incidentId_example"; // The unique id of the incident to close
    try {
      DeviceCloseIncidentResponse result = client
              .device
              .closeIncident(deviceId, incidentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#closeIncident");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceCloseIncidentResponse> response = client
              .device
              .closeIncident(deviceId, incidentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#closeIncident");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| Unique Device ID | |
| **incidentId** | **String**| The unique id of the incident to close | |

### Return type

[**DeviceCloseIncidentResponse**](DeviceCloseIncidentResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createRegistration"></a>
# **createRegistration**
> DeviceCreateRegistrationResponse createRegistration().deviceCreateRegistrationRequest(deviceCreateRegistrationRequest).execute();

Register Device



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Xyte;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeviceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://url";
    Xyte client = new Xyte(configuration);
    String sn = "sn_example"; // Unique device serial number
    String firmwareVersion = "1.0.0"; // Semver based firmware version
    String hardwareKey = "hardwareKey_example"; // Key defined in the model's hardware key section
    String mac = "mac_example"; // MAC address of the device
    String cloudId = "cloudId_example"; // Unique device identifier (must specify this or mac)
    String name = "name_example"; // Display name for the end-user
    Object details = null; // Generic JSON object with unconstrained data
    String subModel = "subModel_example"; // Additional model details text
    String parentId = "parentId_example"; // UUID of the parent device
    try {
      DeviceCreateRegistrationResponse result = client
              .device
              .createRegistration(sn, firmwareVersion, hardwareKey)
              .mac(mac)
              .cloudId(cloudId)
              .name(name)
              .details(details)
              .subModel(subModel)
              .parentId(parentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAccessKey());
      System.out.println(result.getHubUrl());
      System.out.println(result.getHubUrlStaticCert());
      System.out.println(result.getMqttHubUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#createRegistration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceCreateRegistrationResponse> response = client
              .device
              .createRegistration(sn, firmwareVersion, hardwareKey)
              .mac(mac)
              .cloudId(cloudId)
              .name(name)
              .details(details)
              .subModel(subModel)
              .parentId(parentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#createRegistration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceCreateRegistrationRequest** | [**DeviceCreateRegistrationRequest**](DeviceCreateRegistrationRequest.md)|  | [optional] |

### Return type

[**DeviceCreateRegistrationResponse**](DeviceCreateRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | 2XX |  -  |

<a name="deleteDevice"></a>
# **deleteDevice**
> DeviceDeleteDeviceResponse deleteDevice(deviceId).execute();

Delete Device



### Example
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
    String deviceId = "deviceId_example"; // Device's unique ID
    try {
      DeviceDeleteDeviceResponse result = client
              .device
              .deleteDevice(deviceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#deleteDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceDeleteDeviceResponse> response = client
              .device
              .deleteDevice(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#deleteDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| Device&#39;s unique ID | |

### Return type

[**DeviceDeleteDeviceResponse**](DeviceDeleteDeviceResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getAllDeviceStateHistories"></a>
# **getAllDeviceStateHistories**
> String getAllDeviceStateHistories().status(status).from(from).to(to).page(page).execute();

Get All Device&#39;s State History



### Example
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
    String status = "status_example"; // Filter by state: online, offline, unavailable, error
    OffsetDateTime from = OffsetDateTime.now(); // Query range
    OffsetDateTime to = OffsetDateTime.now(); // Query range
    Integer page = 56; // Pagination (500 records per page)
    try {
      String result = client
              .device
              .getAllDeviceStateHistories()
              .status(status)
              .from(from)
              .to(to)
              .page(page)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getAllDeviceStateHistories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .device
              .getAllDeviceStateHistories()
              .status(status)
              .from(from)
              .to(to)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getAllDeviceStateHistories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | **String**| Filter by state: online, offline, unavailable, error | [optional] |
| **from** | **OffsetDateTime**| Query range | [optional] |
| **to** | **OffsetDateTime**| Query range | [optional] |
| **page** | **Integer**| Pagination (500 records per page) | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getChildDevices"></a>
# **getChildDevices**
> List&lt;DeviceGetChildDevicesResponseInner&gt; getChildDevices(parentId).execute();

Get Child Devices



### Example
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
    String parentId = "parentId_example"; // The ID of the parent device
    try {
      List<DeviceGetChildDevicesResponseInner> result = client
              .device
              .getChildDevices(parentId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getChildDevices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DeviceGetChildDevicesResponseInner>> response = client
              .device
              .getChildDevices(parentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getChildDevices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parentId** | **String**| The ID of the parent device | |

### Return type

[**List&lt;DeviceGetChildDevicesResponseInner&gt;**](DeviceGetChildDevicesResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getCommand"></a>
# **getCommand**
> Object getCommand(deviceId).execute();

Get Command



### Example
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
    String deviceId = "deviceId_example";
    try {
      Object result = client
              .device
              .getCommand(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getCommand");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .device
              .getCommand(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getCommand");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getConfig"></a>
# **getConfig**
> DeviceGetConfigResponse getConfig(deviceId).execute();

Get Config



### Example
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
    String deviceId = "deviceId_example";
    try {
      DeviceGetConfigResponse result = client
              .device
              .getConfig(deviceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getName());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getConfig());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceGetConfigResponse> response = client
              .device
              .getConfig(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |

### Return type

[**DeviceGetConfigResponse**](DeviceGetConfigResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getConfig_0"></a>
# **getConfig_0**
> DeviceGetConfig200Response getConfig_0(deviceId).execute();

Get Device Configuration



### Example
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
    String deviceId = "deviceId_example"; // Unique Device ID
    try {
      DeviceGetConfig200Response result = client
              .device
              .getConfig_0(deviceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getConfig());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getConfig_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceGetConfig200Response> response = client
              .device
              .getConfig_0(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getConfig_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| Unique Device ID | |

### Return type

[**DeviceGetConfig200Response**](DeviceGetConfig200Response.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getFile"></a>
# **getFile**
> String getFile(deviceId, fileUuid).execute();

Get File



### Example
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
    String deviceId = "deviceId_example";
    String fileUuid = "fileUuid_example";
    try {
      String result = client
              .device
              .getFile(deviceId, fileUuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .device
              .getFile(deviceId, fileUuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **fileUuid** | **String**|  | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getFiles"></a>
# **getFiles**
> String getFiles(deviceId).execute();

Get Files



### Example
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
    String deviceId = "deviceId_example";
    try {
      String result = client
              .device
              .getFiles(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getFiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .device
              .getFiles(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getFiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getIncidents"></a>
# **getIncidents**
> DeviceGetIncidentsResponse getIncidents(deviceId).execute();

Get Incidents



### Example
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
    String deviceId = "deviceId_example"; // Device's unique ID
    try {
      DeviceGetIncidentsResponse result = client
              .device
              .getIncidents(deviceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getIncidents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceGetIncidentsResponse> response = client
              .device
              .getIncidents(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getIncidents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| Device&#39;s unique ID | |

### Return type

[**DeviceGetIncidentsResponse**](DeviceGetIncidentsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="getInfo"></a>
# **getInfo**
> DeviceGetInfoResponse getInfo(deviceId).execute();

Get Device Info



### Example
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
    String deviceId = "deviceId_example";
    try {
      DeviceGetInfoResponse result = client
              .device
              .getInfo(deviceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getPartner());
      System.out.println(result.getConfig());
      System.out.println(result.getState());
      System.out.println(result.getLastSeen());
      System.out.println(result.getCustom());
      System.out.println(result.getName());
      System.out.println(result.getFirmwareVersion());
      System.out.println(result.getClaimed());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceGetInfoResponse> response = client
              .device
              .getInfo(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |

### Return type

[**DeviceGetInfoResponse**](DeviceGetInfoResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getInfo_0"></a>
# **getInfo_0**
> DeviceGetInfo200Response getInfo_0(deviceId).execute();

Get Device Info



### Example
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
    String deviceId = "deviceId_example"; // Device's unique ID
    try {
      DeviceGetInfo200Response result = client
              .device
              .getInfo_0(deviceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPageInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getInfo_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceGetInfo200Response> response = client
              .device
              .getInfo_0(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getInfo_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| Device&#39;s unique ID | |

### Return type

[**DeviceGetInfo200Response**](DeviceGetInfo200Response.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getLicense"></a>
# **getLicense**
> Object getLicense(deviceId).execute();

Get License



### Example
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
    String deviceId = "deviceId_example";
    try {
      Object result = client
              .device
              .getLicense(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getLicense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .device
              .getLicense(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getLicense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getLicenses"></a>
# **getLicenses**
> Object getLicenses(deviceId).execute();

Get Licenses



### Example
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
    String deviceId = "deviceId_example";
    try {
      Object result = client
              .device
              .getLicenses(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .device
              .getLicenses(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getSpaceInfo"></a>
# **getSpaceInfo**
> DeviceGetSpaceInfoResponse getSpaceInfo(deviceId).execute();

Get Space Info



### Example
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
    String deviceId = "deviceId_example";
    try {
      DeviceGetSpaceInfoResponse result = client
              .device
              .getSpaceInfo(deviceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLocation());
      System.out.println(result.getTemperatureUnits());
      System.out.println(result.getMaintenance());
      System.out.println(result.getName());
      System.out.println(result.getLocalTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getSpaceInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceGetSpaceInfoResponse> response = client
              .device
              .getSpaceInfo(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getSpaceInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |

### Return type

[**DeviceGetSpaceInfoResponse**](DeviceGetSpaceInfoResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="getStateHistory"></a>
# **getStateHistory**
> String getStateHistory(deviceId).status(status).from(from).to(to).page(page).execute();

Get Device State History



### Example
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
    String deviceId = "deviceId_example"; // Unique Device ID
    String status = "status_example"; // Filter by state: online, offline, unavailable, error
    OffsetDateTime from = OffsetDateTime.now(); // Query range
    OffsetDateTime to = OffsetDateTime.now(); // Query range
    Integer page = 56; // Pagination (500 records per page)
    try {
      String result = client
              .device
              .getStateHistory(deviceId)
              .status(status)
              .from(from)
              .to(to)
              .page(page)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getStateHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .device
              .getStateHistory(deviceId)
              .status(status)
              .from(from)
              .to(to)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getStateHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| Unique Device ID | |
| **status** | **String**| Filter by state: online, offline, unavailable, error | [optional] |
| **from** | **OffsetDateTime**| Query range | [optional] |
| **to** | **OffsetDateTime**| Query range | [optional] |
| **page** | **Integer**| Pagination (500 records per page) | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getTelemetries"></a>
# **getTelemetries**
> List&lt;DeviceGetTelemetriesResponseInner&gt; getTelemetries(deviceId).execute();

Get Device Telemetries



### Example
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
    String deviceId = "deviceId_example"; // Unique Device ID
    try {
      List<DeviceGetTelemetriesResponseInner> result = client
              .device
              .getTelemetries(deviceId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getTelemetries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DeviceGetTelemetriesResponseInner>> response = client
              .device
              .getTelemetries(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getTelemetries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| Unique Device ID | |

### Return type

[**List&lt;DeviceGetTelemetriesResponseInner&gt;**](DeviceGetTelemetriesResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listCommands"></a>
# **listCommands**
> DeviceListCommandsResponse listCommands(deviceId).status(status).execute();

Get Device Commands



### Example
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
    String deviceId = "deviceId_example"; // Unique Device ID
    String status = "status_example"; // Filter by command status: scheduled, pending, done, failed, aborted, in_progress
    try {
      DeviceListCommandsResponse result = client
              .device
              .listCommands(deviceId)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPageInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#listCommands");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceListCommandsResponse> response = client
              .device
              .listCommands(deviceId)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#listCommands");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| Unique Device ID | |
| **status** | **String**| Filter by command status: scheduled, pending, done, failed, aborted, in_progress | [optional] |

### Return type

[**DeviceListCommandsResponse**](DeviceListCommandsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listDevices"></a>
# **listDevices**
> DeviceListDevicesResponse listDevices().modelId(modelId).sn(sn).mac(mac).page(page).execute();

List Devices



### Example
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
    String modelId = "modelId_example"; // Filter by model id
    String sn = "sn_example"; // Filter by Serial Number
    String mac = "mac_example"; // Filter by MAC address
    String page = "page_example"; // Pagination selector
    try {
      DeviceListDevicesResponse result = client
              .device
              .listDevices()
              .modelId(modelId)
              .sn(sn)
              .mac(mac)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPageInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#listDevices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceListDevicesResponse> response = client
              .device
              .listDevices()
              .modelId(modelId)
              .sn(sn)
              .mac(mac)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#listDevices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**| Filter by model id | [optional] |
| **sn** | **String**| Filter by Serial Number | [optional] |
| **mac** | **String**| Filter by MAC address | [optional] |
| **page** | **String**| Pagination selector | [optional] |

### Return type

[**DeviceListDevicesResponse**](DeviceListDevicesResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="openIncident"></a>
# **openIncident**
> DeviceOpenIncidentResponse openIncident(deviceId).deviceOpenIncidentRequest(deviceOpenIncidentRequest).execute();

Open Incident



### Example
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
    String title = "title_example"; // Short title
    String deviceId = "deviceId_example";
    String description = "description_example";
    String priority = "1"; // Critical, High, Moderate, Low, Planning
    String issue = "Randomly generated tag"; // Short text to uniquely identify the issue (only one incident of each issue type can be open at a time)
    String RAW_BODY = "RAW_BODY_example";
    try {
      DeviceOpenIncidentResponse result = client
              .device
              .openIncident(title, deviceId)
              .description(description)
              .priority(priority)
              .issue(issue)
              .RAW_BODY(RAW_BODY)
              .execute();
      System.out.println(result);
      System.out.println(result.getIncidentId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#openIncident");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceOpenIncidentResponse> response = client
              .device
              .openIncident(title, deviceId)
              .description(description)
              .priority(priority)
              .issue(issue)
              .RAW_BODY(RAW_BODY)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#openIncident");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **deviceOpenIncidentRequest** | [**DeviceOpenIncidentRequest**](DeviceOpenIncidentRequest.md)|  | [optional] |

### Return type

[**DeviceOpenIncidentResponse**](DeviceOpenIncidentResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="registerChildDevice"></a>
# **registerChildDevice**
> DeviceRegisterChildDeviceResponse registerChildDevice(parentId).deviceRegisterChildDeviceRequest(deviceRegisterChildDeviceRequest).execute();

Register Child Device



### Example
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
    String firmwareVersion = "firmwareVersion_example";
    String modelId = "modelId_example";
    String parentId = "parentId_example"; // The ID of the parent device
    String subModel = "subModel_example";
    String sn = "sn_example";
    String mac = "mac_example";
    String name = "name_example";
    Object details = null;
    try {
      DeviceRegisterChildDeviceResponse result = client
              .device
              .registerChildDevice(firmwareVersion, modelId, parentId)
              .subModel(subModel)
              .sn(sn)
              .mac(mac)
              .name(name)
              .details(details)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAccessKey());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#registerChildDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceRegisterChildDeviceResponse> response = client
              .device
              .registerChildDevice(firmwareVersion, modelId, parentId)
              .subModel(subModel)
              .sn(sn)
              .mac(mac)
              .name(name)
              .details(details)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#registerChildDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parentId** | **String**| The ID of the parent device | |
| **deviceRegisterChildDeviceRequest** | [**DeviceRegisterChildDeviceRequest**](DeviceRegisterChildDeviceRequest.md)|  | [optional] |

### Return type

[**DeviceRegisterChildDeviceResponse**](DeviceRegisterChildDeviceResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="sendChildTelemetries"></a>
# **sendChildTelemetries**
> DeviceSendChildTelemetriesResponse sendChildTelemetries(deviceId).deviceSendChildTelemetriesRequest(deviceSendChildTelemetriesRequest).execute();

Send Child Telemetries



### Example
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
    Object RAW_BODY = null; // Mapping of child device UUIDs to telemetry data for each device
    String deviceId = "deviceId_example";
    try {
      DeviceSendChildTelemetriesResponse result = client
              .device
              .sendChildTelemetries(RAW_BODY, deviceId)
              .execute();
      System.out.println(result);
      System.out.println(result.get11303e815d564910A47268676375d995());
      System.out.println(result.getB4adc7484462493381739d40e0a17d22());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#sendChildTelemetries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceSendChildTelemetriesResponse> response = client
              .device
              .sendChildTelemetries(RAW_BODY, deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#sendChildTelemetries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **deviceSendChildTelemetriesRequest** | [**DeviceSendChildTelemetriesRequest**](DeviceSendChildTelemetriesRequest.md)|  | [optional] |

### Return type

[**DeviceSendChildTelemetriesResponse**](DeviceSendChildTelemetriesResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="sendCommand"></a>
# **sendCommand**
> DeviceSendCommandResponse sendCommand(deviceId).deviceSendCommandRequest(deviceSendCommandRequest).execute();

Update Command



### Example
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
    String status = "done";
    String id = "id_example";
    String deviceId = "deviceId_example";
    String message = "message_example";
    try {
      DeviceSendCommandResponse result = client
              .device
              .sendCommand(status, id, deviceId)
              .message(message)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#sendCommand");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceSendCommandResponse> response = client
              .device
              .sendCommand(status, id, deviceId)
              .message(message)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#sendCommand");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **deviceSendCommandRequest** | [**DeviceSendCommandRequest**](DeviceSendCommandRequest.md)|  | [optional] |

### Return type

[**DeviceSendCommandResponse**](DeviceSendCommandResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="sendDumpFile"></a>
# **sendDumpFile**
> DeviceSendDumpFileResponse sendDumpFile(deviceId, mimeType, filename).deviceSendDumpFileRequest(deviceSendDumpFileRequest).execute();

Send Dump



### Example
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
    File RAW_BODY = new File("/path/to/file"); // Raw configuration dump
    String deviceId = "deviceId_example";
    String mimeType = "text/plain";
    String filename = "filename";
    try {
      DeviceSendDumpFileResponse result = client
              .device
              .sendDumpFile(RAW_BODY, deviceId, mimeType, filename)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#sendDumpFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceSendDumpFileResponse> response = client
              .device
              .sendDumpFile(RAW_BODY, deviceId, mimeType, filename)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#sendDumpFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **mimeType** | **String**|  | [default to text/plain] |
| **filename** | **String**|  | [default to filename] |
| **deviceSendDumpFileRequest** | [**DeviceSendDumpFileRequest**](DeviceSendDumpFileRequest.md)|  | [optional] |

### Return type

[**DeviceSendDumpFileResponse**](DeviceSendDumpFileResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="sendTelemetry"></a>
# **sendTelemetry**
> DeviceSendTelemetryResponse sendTelemetry(deviceId).deviceSendTelemetryRequest(deviceSendTelemetryRequest).execute();

Send Telemetry



### Example
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
    String status = "online";
    String deviceId = "deviceId_example";
    LocalDate timestamp = LocalDate.now();
    String telemetries = "telemetries_example";
    Boolean override = true;
    try {
      DeviceSendTelemetryResponse result = client
              .device
              .sendTelemetry(status, deviceId)
              .timestamp(timestamp)
              .telemetries(telemetries)
              .override(override)
              .execute();
      System.out.println(result);
      System.out.println(result.getConfigVersion());
      System.out.println(result.getCommand());
      System.out.println(result.getInfoVersion());
      System.out.println(result.getNewLicenses());
      System.out.println(result.getLatestFwVersion());
      System.out.println(result.getLatestFwFileId());
      System.out.println(result.getSpaceDataVersion());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#sendTelemetry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceSendTelemetryResponse> response = client
              .device
              .sendTelemetry(status, deviceId)
              .timestamp(timestamp)
              .telemetries(telemetries)
              .override(override)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#sendTelemetry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **deviceSendTelemetryRequest** | [**DeviceSendTelemetryRequest**](DeviceSendTelemetryRequest.md)|  | [optional] |

### Return type

[**DeviceSendTelemetryResponse**](DeviceSendTelemetryResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="setConfig"></a>
# **setConfig**
> DeviceSetConfigResponse setConfig(deviceId).deviceSetConfigRequest(deviceSetConfigRequest).execute();

Set Config



### Example
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
    String deviceId = "deviceId_example";
    String RAW_BODY = "RAW_BODY_example"; // Put your raw JSON config here
    try {
      DeviceSetConfigResponse result = client
              .device
              .setConfig(deviceId)
              .RAW_BODY(RAW_BODY)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#setConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceSetConfigResponse> response = client
              .device
              .setConfig(deviceId)
              .RAW_BODY(RAW_BODY)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#setConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **deviceSetConfigRequest** | [**DeviceSetConfigRequest**](DeviceSetConfigRequest.md)|  | [optional] |

### Return type

[**DeviceSetConfigResponse**](DeviceSetConfigResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateCloudSettings"></a>
# **updateCloudSettings**
> String updateCloudSettings(deviceId).deviceUpdateCloudSettingsRequest(deviceUpdateCloudSettingsRequest).execute();

Set Cloud Settings



### Example
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
    String deviceId = "deviceId_example";
    String property = "property_example"; // The Property you would like to change
    String value = "value_example"; // The value to set for the given propery
    try {
      String result = client
              .device
              .updateCloudSettings(deviceId)
              .property(property)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#updateCloudSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .device
              .updateCloudSettings(deviceId)
              .property(property)
              .value(value)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#updateCloudSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **deviceUpdateCloudSettingsRequest** | [**DeviceUpdateCloudSettingsRequest**](DeviceUpdateCloudSettingsRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateDevice"></a>
# **updateDevice**
> DeviceUpdateDeviceResponse updateDevice(deviceId).deviceUpdateDeviceRequest(deviceUpdateDeviceRequest).execute();

Update Device



### Example
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
    String deviceId = "deviceId_example";
    String firmwareVersion = "firmwareVersion_example";
    String name = "name_example"; // Friendly device name
    String spaceVersion = "spaceVersion_example"; // Latest version of the space information the device has applied
    String configVersion = "configVersion_example"; // Latest version of the configuration the device has applied
    Object details = null; // Details of the device. Will be visible in a different tab on the device's view calls 'Details'.
    try {
      DeviceUpdateDeviceResponse result = client
              .device
              .updateDevice(deviceId)
              .firmwareVersion(firmwareVersion)
              .name(name)
              .spaceVersion(spaceVersion)
              .configVersion(configVersion)
              .details(details)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getPartner());
      System.out.println(result.getConfig());
      System.out.println(result.getState());
      System.out.println(result.getLastSeen());
      System.out.println(result.getCustom());
      System.out.println(result.getName());
      System.out.println(result.getFirmwareVersion());
      System.out.println(result.getClaimed());
      System.out.println(result.getDetails());
      System.out.println(result.getTest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#updateDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceUpdateDeviceResponse> response = client
              .device
              .updateDevice(deviceId)
              .firmwareVersion(firmwareVersion)
              .name(name)
              .spaceVersion(spaceVersion)
              .configVersion(configVersion)
              .details(details)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#updateDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **deviceUpdateDeviceRequest** | [**DeviceUpdateDeviceRequest**](DeviceUpdateDeviceRequest.md)|  | [optional] |

### Return type

[**DeviceUpdateDeviceResponse**](DeviceUpdateDeviceResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateLicense"></a>
# **updateLicense**
> DeviceUpdateLicenseResponse updateLicense(deviceId).deviceUpdateLicenseRequest(deviceUpdateLicenseRequest).execute();

Update License



### Example
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
    String id = "id_example";
    String state = "state_example";
    String deviceId = "deviceId_example";
    String error = "error_example";
    try {
      DeviceUpdateLicenseResponse result = client
              .device
              .updateLicense(id, state, deviceId)
              .error(error)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getSignature());
      System.out.println(result.getId());
      System.out.println(result.getExpiresAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#updateLicense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceUpdateLicenseResponse> response = client
              .device
              .updateLicense(id, state, deviceId)
              .error(error)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#updateLicense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**|  | |
| **deviceUpdateLicenseRequest** | [**DeviceUpdateLicenseRequest**](DeviceUpdateLicenseRequest.md)|  | [optional] |

### Return type

[**DeviceUpdateLicenseResponse**](DeviceUpdateLicenseResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

