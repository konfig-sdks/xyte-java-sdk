

# DeviceCreateRegistrationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mac** | **String** | MAC address of the device |  [optional] |
|**sn** | **String** | Unique device serial number |  |
|**cloudId** | **String** | Unique device identifier (must specify this or mac) |  [optional] |
|**firmwareVersion** | **String** | Semver based firmware version |  |
|**hardwareKey** | **String** | Key defined in the model&#39;s hardware key section |  |
|**name** | **String** | Display name for the end-user |  [optional] |
|**details** | **Object** | Generic JSON object with unconstrained data |  [optional] |
|**subModel** | **String** | Additional model details text |  [optional] |
|**parentId** | **String** | UUID of the parent device |  [optional] |



