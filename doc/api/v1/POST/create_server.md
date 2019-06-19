## Create Server

###Method:
POST

###Endpoint:
```console
/api/create/server
```
###Input:
+ Name des Servers
+ Server Typ
+ Datacenter ID
+ Name des OS Images
+ Tag zur späteren Filterung in der Datenbank (z.B. Testsystem, Kunde, Prod, ...)
+ Name des zuvor hochgeladenen Cloud Init Scripts

```json
{
	"Name": "TEST1",
	"Type": "cx11",
	"DC": "fsn1",
	"OS": "ubuntu-18.04",
	"Tag": "TEST",
	"UserData": "CTEST"
}
```

###Result:

```json
{
    "Action": "Create Server",
    "Result": "initializing"
}
```