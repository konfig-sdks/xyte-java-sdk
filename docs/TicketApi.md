# TicketApi

All URIs are relative to *http://url*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addComment**](TicketApi.md#addComment) | **POST** /core/v1/partner/tickets/{ticket_id}/message | Add Comment |
| [**close**](TicketApi.md#close) | **POST** /core/v1/partner/tickets/{ticket_id}/resolved | Close Ticket |
| [**getById**](TicketApi.md#getById) | **GET** /core/v1/partner/tickets/{ticket_id} (COPY) | Get Ticket |
| [**list**](TicketApi.md#list) | **GET** /core/v1/partner/tickets | List Tickets |
| [**updateTicketById**](TicketApi.md#updateTicketById) | **PUT** /core/v1/partner/tickets/{ticket_id} | Update Ticket |


<a name="addComment"></a>
# **addComment**
> TicketAddCommentResponse addComment(ticketId).ticketAddCommentRequest(ticketAddCommentRequest).execute();

Add Comment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Xyte;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TicketApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://url";
    
    configuration.sec0  = "YOUR API KEY";
    Xyte client = new Xyte(configuration);
    String ticketId = "ticketId_example"; // Unique ticket ID
    String message = "message_example"; // Message to post
    try {
      TicketAddCommentResponse result = client
              .ticket
              .addComment(ticketId)
              .message(message)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDeviceId());
      System.out.println(result.getUserName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#addComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TicketAddCommentResponse> response = client
              .ticket
              .addComment(ticketId)
              .message(message)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#addComment");
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
| **ticketId** | **String**| Unique ticket ID | |
| **ticketAddCommentRequest** | [**TicketAddCommentRequest**](TicketAddCommentRequest.md)|  | [optional] |

### Return type

[**TicketAddCommentResponse**](TicketAddCommentResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="close"></a>
# **close**
> TicketCloseResponse close(ticketId).execute();

Close Ticket



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Xyte;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TicketApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://url";
    
    configuration.sec0  = "YOUR API KEY";
    Xyte client = new Xyte(configuration);
    String ticketId = "ticketId_example"; // Unique ticket ID
    try {
      TicketCloseResponse result = client
              .ticket
              .close(ticketId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDeviceId());
      System.out.println(result.getUserName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#close");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TicketCloseResponse> response = client
              .ticket
              .close(ticketId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#close");
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
| **ticketId** | **String**| Unique ticket ID | |

### Return type

[**TicketCloseResponse**](TicketCloseResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getById"></a>
# **getById**
> TicketGetByIdResponse getById(ticketId).execute();

Get Ticket



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Xyte;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TicketApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://url";
    
    configuration.sec0  = "YOUR API KEY";
    Xyte client = new Xyte(configuration);
    String ticketId = "ticketId_example"; // Unique ticket ID
    try {
      TicketGetByIdResponse result = client
              .ticket
              .getById(ticketId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDeviceId());
      System.out.println(result.getUserName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TicketGetByIdResponse> response = client
              .ticket
              .getById(ticketId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#getById");
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
| **ticketId** | **String**| Unique ticket ID | |

### Return type

[**TicketGetByIdResponse**](TicketGetByIdResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="list"></a>
# **list**
> List&lt;TicketListResponseInner&gt; list().execute();

List Tickets



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Xyte;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TicketApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://url";
    
    configuration.sec0  = "YOUR API KEY";
    Xyte client = new Xyte(configuration);
    try {
      List<TicketListResponseInner> result = client
              .ticket
              .list()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TicketListResponseInner>> response = client
              .ticket
              .list()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TicketListResponseInner&gt;**](TicketListResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateTicketById"></a>
# **updateTicketById**
> TicketUpdateTicketByIdResponse updateTicketById(ticketId).ticketUpdateTicketByIdRequest(ticketUpdateTicketByIdRequest).execute();

Update Ticket



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Xyte;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TicketApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://url";
    
    configuration.sec0  = "YOUR API KEY";
    Xyte client = new Xyte(configuration);
    String ticketId = "ticketId_example"; // Unique ticket ID
    String title = "title_example"; // New ticket title
    String description = "description_example"; // New ticket description
    try {
      TicketUpdateTicketByIdResponse result = client
              .ticket
              .updateTicketById(ticketId)
              .title(title)
              .description(description)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDeviceId());
      System.out.println(result.getUserName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#updateTicketById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TicketUpdateTicketByIdResponse> response = client
              .ticket
              .updateTicketById(ticketId)
              .title(title)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TicketApi#updateTicketById");
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
| **ticketId** | **String**| Unique ticket ID | |
| **ticketUpdateTicketByIdRequest** | [**TicketUpdateTicketByIdRequest**](TicketUpdateTicketByIdRequest.md)|  | [optional] |

### Return type

[**TicketUpdateTicketByIdResponse**](TicketUpdateTicketByIdResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

