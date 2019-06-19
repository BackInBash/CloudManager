## Get All OS Images

### Method:

GET

### Endpoint:

```console
/api/osimage/all
```

### Response:

```json
[
  {
    "id": 1,
    "type": "system",
    "status": "available",
    "name": "ubuntu-16.04",
    "description": "Ubuntu 16.04",
    "diskSize": 5.0,
    "created": "Jan 15, 2018 12:34:45 PM",
    "osFlavor": "ubuntu",
    "osVersion": "16.04",
    "rapidRedeploy": false,
    "protection": { "delete": false }
  },
  {
    "id": 2,
    "type": "system",
    "status": "available",
    "name": "debian-9",
    "description": "Debian 9",
    "diskSize": 5.0,
    "created": "Jan 15, 2018 12:34:45 PM",
    "osFlavor": "debian",
    "osVersion": "9",
    "rapidRedeploy": false,
    "protection": { "delete": false }
  },
  {
    "id": 3,
    "type": "system",
    "status": "available",
    "name": "centos-7",
    "description": "Centos 7",
    "diskSize": 5.0,
    "created": "Jan 15, 2018 12:34:45 PM",
    "osFlavor": "centos",
    "osVersion": "7",
    "rapidRedeploy": false,
    "protection": { "delete": false }
  },
  {
    "id": 168855,
    "type": "system",
    "status": "available",
    "name": "ubuntu-18.04",
    "description": "Ubuntu 18.04",
    "diskSize": 5.0,
    "created": "May 2, 2018 1:02:30 PM",
    "osFlavor": "ubuntu",
    "osVersion": "18.04",
    "rapidRedeploy": false,
    "protection": { "delete": false }
  },
  {
    "id": 3168834,
    "type": "system",
    "status": "available",
    "name": "fedora-29",
    "description": "Fedora 29",
    "diskSize": 5.0,
    "created": "Feb 28, 2019 11:00:05 AM",
    "osFlavor": "fedora",
    "osVersion": "29",
    "rapidRedeploy": false,
    "protection": { "delete": false }
  }
]
```
