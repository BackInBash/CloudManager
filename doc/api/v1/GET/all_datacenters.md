## Get All Datacnters

### Method:

GET

### Endpoint:

```console
/api/datacenter/all
```

### Response:

```json
[
  {
    "id": 2,
    "name": "nbg1-dc3",
    "description": "Nuremberg 1 DC 3",
    "location": {
      "id": 2,
      "name": "nbg1",
      "description": "Nuremberg DC Park 1",
      "country": "DE",
      "city": "Nuremberg",
      "latitude": 49.452102,
      "longitude": 11.076665
    },
    "serverTypes": {
      "supported": [2, 4, 6, 8, 10, 9, 7, 5, 3, 1, 11, 12, 13, 14, 15],
      "available": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    }
  },
  {
    "id": 3,
    "name": "hel1-dc2",
    "description": "Helsinki 1 DC 2",
    "location": {
      "id": 3,
      "name": "hel1",
      "description": "Helsinki DC Park 1",
      "country": "FI",
      "city": "Helsinki",
      "latitude": 60.169855,
      "longitude": 24.938379
    },
    "serverTypes": {
      "supported": [2, 4, 6, 8, 10, 9, 7, 5, 3, 1, 11, 12, 13, 14, 15],
      "available": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    }
  },
  {
    "id": 4,
    "name": "fsn1-dc14",
    "description": "Falkenstein 1 DC14",
    "location": {
      "id": 1,
      "name": "fsn1",
      "description": "Falkenstein DC Park 1",
      "country": "DE",
      "city": "Falkenstein",
      "latitude": 50.47612,
      "longitude": 12.370071
    },
    "serverTypes": {
      "supported": [2, 4, 6, 8, 10, 9, 7, 5, 3, 1, 11, 12, 13, 14, 15],
      "available": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
    }
  }
]
```
