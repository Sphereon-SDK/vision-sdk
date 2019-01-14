# vision-sdk-java8

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sphereon.sdk</groupId>
    <artifactId>vision-sdk-java8</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:vision-sdk-java8:0.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/vision-sdk-java8-0.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.vision.handler.*;
import com.sphereon.sdk.vision.handler.auth.*;
import com.sphereon.sdk.vision.handler.model.*;
import com.sphereon.sdk.vision.api.VisionApi;

import java.io.File;
import java.util.*;

public class VisionApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2schema
        OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
        oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

        VisionApi apiInstance = new VisionApi();
        VisionSettings visionSettings = new VisionSettings(); // VisionSettings | visionSettings
        try {
            VisionJob result = apiInstance.createVisionJob(visionSettings);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisionApi#createVisionJob");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/vision/0.2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*VisionApi* | [**createVisionJob**](docs/VisionApi.md#createVisionJob) | **POST** /jobs | Create a new vision job
*VisionApi* | [**deleteVisionJob**](docs/VisionApi.md#deleteVisionJob) | **DELETE** /jobs/{jobId} | Delete a vision job manually
*VisionApi* | [**getVisionJob**](docs/VisionApi.md#getVisionJob) | **GET** /jobs/{jobId} | Get a vision job
*VisionApi* | [**submitVisionJob**](docs/VisionApi.md#submitVisionJob) | **PUT** /jobs/{jobId} | Start classification of a vision job
*VisionApi* | [**uploadFile**](docs/VisionApi.md#uploadFile) | **POST** /jobs/{jobId}/streams/multipart | Upload an image for a vision job


## Documentation for Models

 - [Credentials](docs/Credentials.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [InputResource](docs/InputResource.md)
 - [Lifecycle](docs/Lifecycle.md)
 - [Result](docs/Result.md)
 - [StatusMessage](docs/StatusMessage.md)
 - [StorageSettings](docs/StorageSettings.md)
 - [StreamLocation](docs/StreamLocation.md)
 - [Tag](docs/Tag.md)
 - [VendorResult](docs/VendorResult.md)
 - [VisionJob](docs/VisionJob.md)
 - [VisionSettings](docs/VisionSettings.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

dev@sphereon.com

