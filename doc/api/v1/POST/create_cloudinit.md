## Create Cloud Init

###Method:
POST

###Endpoint:
```console
/api/create/cloudinit
```
###Input:
+ Name des Cloud Init Scripts
+ Base64 Encoded Cloud Init Script (SSH Schlüssel werden später automatisch hinzugefügt)

```json
{
	"Name": "CTEST",
	"Payload": "I2Nsb3VkLWNvbmZpZwpwYWNrYWdlX3VwZGF0ZTogdHJ1ZQpwYWNrYWdlX3VwZ3JhZGU6IHRydWUKCnBhY2thZ2VzOgogLSBodG9wCiAtIGlmdG9wCiAtIGFwYWNoZTIKIC0gdW56aXAKIC0gY3VybAogLSBnaXQKCnJ1bmNtZDoKIC0gWyBzaCwgLWMsICd0b3VjaCAvdG1wL2Nsb3VkaW5pdC13b3JrZWQnIF0K"
}
```

###Result:

```json
{
    "Action": "Create CloudInit",
    "Result": "Status: success"
}
```