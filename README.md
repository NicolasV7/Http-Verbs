# Camel-Enigma-Resolve-Api

## 📚 Endpoints

| Endpoint | Description |
| :------- | :---------- |
| `/v1/getOneEnigma/`      | Home page   |
| `/v1/getOneEnigma/getStep` | Get steps page  |
| `/v1/getOneEnigma/swagger-ui.html` | Visual swagger page  |

## 🧞 Commands

All commands are run from the root of the project, from a terminal:

| Command                   | Action                                           |
| :------------------------ | :----------------------------------------------- |
| `mvn spring-boot:run`             | Run service                            |
| `mvn clean install`             | Build service                            |


## 📝 Postman Request
To send a POST request to the `/v1/getOneEnigma/getStep` endpoint, you can use Postman. Set the request method to `POST` and provide the following JSON payload:

```json
{  
   "data": [  
      {  
         "header": {  
            "id": "12345",
            "type": "StepsGiraffeRefrigerator"
         },
         "enigma": "How to put a giraffe into a refrigerator?"
      }
   ]
}
```

## 📝 Postman Check Services
To check the services `resolver-enigma-api-step-#` , you can use Postman. Set the request method to `GET` and provide the following URL: `/v1/getOneEnigma/get-One` or `/v1/getOneEnigma/get-Two` or `/v1/getOneEnigma/get-Three`

also you can use the following URL: `/v1/getOneEnigma/getStep` to check the services `resolver-enigma-api-step-#`. Set the request method to `POST` and provide the following JSON payload:

```json
{  
   "data": [  
      {  
         "header": {  
            "id": "12345",
            "type": "StepsGiraffeRefrigerator"
         },
         "step": "#" // 1, 2, 3
      }
   ]
}
```

## 📷 Screenshots


Orchestration Example:
![Screenshot](resolve-enigma-api-step-3/img/orchestration.png)

Service `POST` Example:
![Screenshot](resolve-enigma-api-step-3/img/service_post.png)

Service `GET` Example:
![Screenshot](resolve-enigma-api-step-3/img/service_get.png)



## 🚀 Project Structure

```text
/
├── src/
│   ├── java\co\com\villota\microservice/
│   │   ├── api/
|   |   |   ├── ApiException.java
|   |   |   ├── ApiOriginFilter.java
|   |   |   ├── ApiResponseMessage.java
|   |   |   ├── GetStepApi.java
|   |   |   ├── GetStepApiController.java
|   |   |   └── NotFoundException.java
│   │   ├── config/
|   |   |   └── ResolveEnigmaApiApplication.java
│   │   ├── model/
|   |   |   ├── client/
|   |   |   |   ├── ClientGetEnigmaStepResponse.java
|   |   |   |   ├── ClientHeader.java
|   |   |   |   └── ClientJsonApiBodyResponseSuccess.java
|   |   |   ├── ErrorDetail.java
|   |   |   ├── GetEnigmaRequest.java
|   |   |   ├── GetEnigmaStepResponse.java
|   |   |   ├── Header.java
|   |   |   ├── JsonApiBodyRequest.java
|   |   |   ├── JsonApiBodyResponseErrors.java
|   |   |   └── JsonApiBodyResponseSuccess.java
│   │   ├── routes/
|   |   |   ├── GetStepOneClientRoute.java
|   |   |   ├── GetStepThreeClientRoute.java
|   |   |   ├── GetStepTwoClientRoute.java
|   |   |   ├── ResolveEnigmaTransactionErrorRoute.java
|   |   |   └── SaveLogsClientRoute.java
│   │   ├── strategy/
│   │   └── ResolveEnigmaApiApplication.java
│   ├── resources/
|   |   ├── templates/
|   |   |   ├── GetStepOneClientTemplate.ftl
|   |   |   ├── GetStepTwoClientTemplate.ftl
|   |   |   ├── GetStepThreeClientTemplate.ftl
|   |   |   ├── ResolveEnigmaTransactionError.ftl
|   |   |   └── ResolveEnigmaTransactionTemplate.ftl
│   │   └── application.yml
└── pom.xml
```

## 📦 Requirements

| Requirement | Version |
| :---------- | :------ |
| Java        | 8       |
| Tomcat      | 9       |