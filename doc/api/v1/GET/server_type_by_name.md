## Get Server Type by Name

### Method:
GET

### Endpoint:

```console
/api/servers/type/cx11
```

### Response:

```json
[
    {
        "id": 1,
        "name": "cx11",
        "description": "CX11",
        "cores": 1,
        "memory": 2,
        "disk": 20,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0040000000",
                    "gross": "0.0047600000000000"
                },
                "priceMonthly": {
                    "net": "2.4900000000",
                    "gross": "2.9631000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0040000000",
                    "gross": "0.0047600000000000"
                },
                "priceMonthly": {
                    "net": "2.4900000000",
                    "gross": "2.9631000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0040000000",
                    "gross": "0.0047600000000000"
                },
                "priceMonthly": {
                    "net": "2.4900000000",
                    "gross": "2.9631000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "shared"
    }
]
```