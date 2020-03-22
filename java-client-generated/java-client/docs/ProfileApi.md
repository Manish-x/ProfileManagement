# ProfileApi

All URIs are relative to *https://test.swagger.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProfile**](ProfileApi.md#addProfile) | **POST** /profile | Add new profile
[**deleteProfile**](ProfileApi.md#deleteProfile) | **DELETE** /profile/{applicantId} | Delete profile
[**queryProfile**](ProfileApi.md#queryProfile) | **GET** /profile | query profile
[**readProfile**](ProfileApi.md#readProfile) | **GET** /profile/{applicantId} | Find profile by applicant ID
[**updateProfile**](ProfileApi.md#updateProfile) | **PUT** /profile | Update an existing profile


<a name="addProfile"></a>
# **addProfile**
> ProfileResponse addProfile(body)

Add new profile



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: profile_auth
OAuth profile_auth = (OAuth) defaultClient.getAuthentication("profile_auth");
profile_auth.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
Profile body = new Profile(); // Profile | create new profile
try {
    ProfileResponse result = apiInstance.addProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#addProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Profile**](Profile.md)| create new profile |

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[profile_auth](../README.md#profile_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="deleteProfile"></a>
# **deleteProfile**
> ProfileResponse deleteProfile(applicantId)

Delete profile



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: profile_auth
OAuth profile_auth = (OAuth) defaultClient.getAuthentication("profile_auth");
profile_auth.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
Long applicantId = 789L; // Long | applicantId  to delete
try {
    ProfileResponse result = apiInstance.deleteProfile(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#deleteProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **Long**| applicantId  to delete |

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[profile_auth](../README.md#profile_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="queryProfile"></a>
# **queryProfile**
> ProfileResponse queryProfile()

query profile



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: profile_auth
OAuth profile_auth = (OAuth) defaultClient.getAuthentication("profile_auth");
profile_auth.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
try {
    ProfileResponse result = apiInstance.queryProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#queryProfile");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[profile_auth](../README.md#profile_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="readProfile"></a>
# **readProfile**
> ProfileResponse readProfile(applicantId)

Find profile by applicant ID

Returns profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ProfileApi apiInstance = new ProfileApi();
Long applicantId = 789L; // Long | applicant ID of profile
try {
    ProfileResponse result = apiInstance.readProfile(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#readProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **Long**| applicant ID of profile |

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateProfile"></a>
# **updateProfile**
> ProfileResponse updateProfile(body)

Update an existing profile



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: profile_auth
OAuth profile_auth = (OAuth) defaultClient.getAuthentication("profile_auth");
profile_auth.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
Profile body = new Profile(); // Profile | update profile
try {
    ProfileResponse result = apiInstance.updateProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#updateProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Profile**](Profile.md)| update profile |

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[profile_auth](../README.md#profile_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

