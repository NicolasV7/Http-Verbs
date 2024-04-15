# Http-Verbs-Java-Spring-Boot

## 📚 Endpoints
| Endpoint | Description |
| :------- | :---------- |
| `GET /v1/api/task/getAll`           | Get all tasks                            |
| `POST /v1/api/task/create`           | Create a new task                            |
| `DELETE /v1/api/task/delete/{id}`           | Delete a task by id                            |                                                                       |
| `PATCH /v1/api/task/update/{id}`           | Update a task by id                            |                                                                       |
| `HEAD /v1/api/task/getHead`           | Get head task                            |                                                                       |
| `OPTIONS /v1/api/task/getOptions`           | Get options task                            |                                                                       |
## 📝 Postman Request
To send a `POST` or `PATCH` request to the `/v1/api/task/create` or `/v1/api/task/update/{id}` endpoint, provide the following JSON payload:

```json
{
	"_id":"060d5ec3aaf6c955c07f96f5",
	"title":"Example task",
	"description":"Example description",
	"done":false
}
```

## 🧞 Commands

All commands are run from the root of the project, from a terminal:

| Command                   | Action                                           |
| :------------------------ | :----------------------------------------------- |
| `mvn spring-boot:run`             | Run service                            |
| `mvn clean install`             | Build service                            |


