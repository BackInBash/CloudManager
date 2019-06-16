# Cloud Manager

Der Cloud Manager ist ein API Service, der die Provisionierung, Inventarisierung, Monitoring und Management einer Cloud Umgebung übernimmt.

## Features

- HTTP API: Die Kommunikation mit dem Service läuft über eine API Schnittstelle.
- MySQL DB: Die Inventur Daten liegen in einer MySQL Datenbank.
- Remote Execution: Auf den Servern wird ein WebSocket Client zum Einsatz kommen.

## Funktionen

Über diesen Service kann:

- ein Server erstellt oder gelöscht werden.
- die Cloud Infrastruktur abgeglichen und inventarisiert werden (Dead Node detection).
- die Cloud Infrastruktur gemonitort werden (z.B. Metrics oder Logs ).
- die Cloud Infrastruktur gewartet werden (z.B. Updates einspielen).

## Installation

Die Anwendung an sich ist stateless und benötigt nur ein paar statiche Parrameter, diese können der `CloudManager.conf` entnommen werden.

## API Endpoints

### Get All Servers

Endpoint:

```console
/api/servers/all
```

Response:

```json
[
  {
    "id": 2784005,
    "name": "test1",
    "status": "running",
    "created": "Jun 15, 2019 2:13:25 PM",
    "publicNet": {
      "ipv4": {
        "ip": "159.69.200.212",
        "blocked": false,
        "dnsPTR": "static.212.200.69.159.clients.your-server.de"
      },
      "ipv6": {
        "ip": "2a01:4f8:c2c:7b58::/64",
        "blocked": false,
        "dnsPTR": []
      },
      "floatingIPs": []
    },
    "serverType": {
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
    },
    "datacenter": {
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
        "supported": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15],
        "available": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
      }
    },
    "image": {
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
    "rescueEnabled": false,
    "locked": false,
    "outgoingTraffic": 0,
    "ingoingTraffic": 0,
    "includedTraffic": 21990232555520,
    "protection": { "delete": false, "rebuild": false },
    "labels": {},
    "volumes": []
  },
  {
    "id": 2784006,
    "name": "test2",
    "status": "running",
    "created": "Jun 15, 2019 2:13:31 PM",
    "publicNet": {
      "ipv4": {
        "ip": "195.201.19.81",
        "blocked": false,
        "dnsPTR": "static.81.19.201.195.clients.your-server.de"
      },
      "ipv6": {
        "ip": "2a01:4f8:c2c:7891::/64",
        "blocked": false,
        "dnsPTR": []
      },
      "floatingIPs": []
    },
    "serverType": {
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
    },
    "datacenter": {
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
        "supported": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15],
        "available": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
      }
    },
    "image": {
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
    "rescueEnabled": false,
    "locked": false,
    "outgoingTraffic": 0,
    "ingoingTraffic": 0,
    "includedTraffic": 21990232555520,
    "protection": { "delete": false, "rebuild": false },
    "labels": {},
    "volumes": []
  }
]
```

### Get Server by ID

Endpoint:

```console
/api/servers/byID/2784005
```

Response:

```json
{
  "id": 2784005,
  "name": "test1",
  "status": "running",
  "created": "Jun 15, 2019 2:13:25 PM",
  "publicNet": {
    "ipv4": {
      "ip": "159.69.200.212",
      "blocked": false,
      "dnsPTR": "static.212.200.69.159.clients.your-server.de"
    },
    "ipv6": { "ip": "2a01:4f8:c2c:7b58::/64", "blocked": false, "dnsPTR": [] },
    "floatingIPs": []
  },
  "serverType": {
    "id": 1,
    "name": "cx11",
    "description": "CX11",
    "cores": 1,
    "memory": 2,
    "disk": 20,
    "prices": [
      {
        "location": "fsn1",
        "priceHourly": { "net": "0.0040000000", "gross": "0.0047600000000000" },
        "priceMonthly": { "net": "2.4900000000", "gross": "2.9631000000000000" }
      },
      {
        "location": "nbg1",
        "priceHourly": { "net": "0.0040000000", "gross": "0.0047600000000000" },
        "priceMonthly": { "net": "2.4900000000", "gross": "2.9631000000000000" }
      },
      {
        "location": "hel1",
        "priceHourly": { "net": "0.0040000000", "gross": "0.0047600000000000" },
        "priceMonthly": { "net": "2.4900000000", "gross": "2.9631000000000000" }
      }
    ],
    "storageType": "local",
    "cpuType": "shared"
  },
  "datacenter": {
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
      "supported": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15],
      "available": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    }
  },
  "image": {
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
  "rescueEnabled": false,
  "locked": false,
  "outgoingTraffic": 0,
  "ingoingTraffic": 0,
  "includedTraffic": 21990232555520,
  "protection": { "delete": false, "rebuild": false },
  "labels": {},
  "volumes": []
}
```

### Get Server by Name

Endpoint:

```console
/api/servers/byName/test2
```

Response:

```json
[
  {
    "id": 2784006,
    "name": "test2",
    "status": "running",
    "created": "Jun 15, 2019 2:13:31 PM",
    "publicNet": {
      "ipv4": {
        "ip": "195.201.19.81",
        "blocked": false,
        "dnsPTR": "static.81.19.201.195.clients.your-server.de"
      },
      "ipv6": {
        "ip": "2a01:4f8:c2c:7891::/64",
        "blocked": false,
        "dnsPTR": []
      },
      "floatingIPs": []
    },
    "serverType": {
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
    },
    "datacenter": {
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
        "supported": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15],
        "available": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
      }
    },
    "image": {
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
    "rescueEnabled": false,
    "locked": false,
    "outgoingTraffic": 0,
    "ingoingTraffic": 0,
    "includedTraffic": 21990232555520,
    "protection": { "delete": false, "rebuild": false },
    "labels": {},
    "volumes": []
  }
]
```

### Delete Server by ID
Endpoint:

```console
/api/server/byID/2784038
```

Result:

```json
{
    "Action": "Delete Server",
    "Result": "success"
}
```

### Delete Server by Name
(Sollten mehrere Server mit dem Namen gefunden werden, bricht der Löschvorgang ab!)
Endpoint:

```console
<<<<<<< HEAD
/api/server/byID/2784039
=======
/api/server/byID/test2
>>>>>>> f48fb19c64873cd0bd6b5a8ff5883e499bf23b80
```

Result:

```json
{
    "Action": "Delete Server",
    "Result": "success"
}
```
