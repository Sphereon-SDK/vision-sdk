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
    <version>0.1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:vision-sdk-java8:0.1.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/vision-sdk-java8-0.1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.vision.handler.*;
import com.sphereon.sdk.vision.handler.auth.*;
import com.sphereon.sdk.vision.model.*;
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
        String jobid = "jobid_example"; // String | jobid
        try {
            VisionJob result = apiInstance.classifyJob(jobid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisionApi#classifyJob");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*VisionApi* | [**classifyJob**](docs/VisionApi.md#classifyJob) | **PUT** /barcode/0.1/{jobid} | Start classification of a vision job
*VisionApi* | [**createVisionJob**](docs/VisionApi.md#createVisionJob) | **POST** /barcode/0.1/ | Create a new vision job
*VisionApi* | [**deleteVisionJob**](docs/VisionApi.md#deleteVisionJob) | **DELETE** /barcode/0.1/{jobid} | Delete a vision job manually
*VisionApi* | [**getClassificationResult**](docs/VisionApi.md#getClassificationResult) | **GET** /barcode/0.1/{jobid}/result | Get classification response of a vision job
*VisionApi* | [**getVisionJob**](docs/VisionApi.md#getVisionJob) | **GET** /barcode/0.1/{jobid} | Get a vision job
*VisionApi* | [**uploadFile**](docs/VisionApi.md#uploadFile) | **POST** /barcode/0.1/{jobid} | Upload an image for a vision job


## Documentation for Models

 - [ClassificationResponse](docs/ClassificationResponse.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Tag](docs/Tag.md)
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

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@sphereon.com

