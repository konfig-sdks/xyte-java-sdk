

# DeviceOpenIncidentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Short title |  |
|**description** | **String** |  |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) | Critical, High, Moderate, Low, Planning |  [optional] |
|**issue** | **String** | Short text to uniquely identify the issue (only one incident of each issue type can be open at a time) |  [optional] |
|**RAW_BODY** | **String** |  |  [optional] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |



