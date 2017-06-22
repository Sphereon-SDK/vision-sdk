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
import com.sphereon.sdk.vision.api.BarcodeReaderApi;

import java.io.File;
import java.util.*;

public class BarcodeReaderApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2schema
        OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
        oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

        BarcodeReaderApi apiInstance = new BarcodeReaderApi();
        String jobid = "jobid_example"; // String | jobid
        try {
            ReaderJobResponse result = apiInstance.deleteJob(jobid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeReaderApi#deleteJob");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BarcodeReaderApi* | [**deleteJob**](docs/BarcodeReaderApi.md#deleteJob) | **DELETE** /barcode/0.1.0/reader/{jobid} | Delete a job manually
*BarcodeReaderApi* | [**getJob**](docs/BarcodeReaderApi.md#getJob) | **GET** /barcode/0.1.0/reader/{jobid} | Job definition and state
*BarcodeReaderApi* | [**submitJob**](docs/BarcodeReaderApi.md#submitJob) | **PUT** /barcode/0.1.0/reader/{jobid} | Submit job for reading
*BarcodeReaderApi* | [**uploadFile**](docs/BarcodeReaderApi.md#uploadFile) | **POST** /barcode/0.1.0/reader | Upload the file


## Documentation for Models

 - [Barcode](docs/Barcode.md)
 - [BarcodeCoordinate](docs/BarcodeCoordinate.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Lifecycle](docs/Lifecycle.md)
 - [ReaderEngineTask](docs/ReaderEngineTask.md)
 - [ReaderJob](docs/ReaderJob.md)
 - [ReaderJobResponse](docs/ReaderJobResponse.md)
 - [ReaderJobSettings](docs/ReaderJobSettings.md)
 - [ReaderResultJobResponse](docs/ReaderResultJobResponse.md)


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

