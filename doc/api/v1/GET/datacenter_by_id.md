## Get Datacnter By ID

### Method:

GET

### Endpoint:

```console
/api/datacenter/byID/2
```

### Response:

```json
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
}
```
