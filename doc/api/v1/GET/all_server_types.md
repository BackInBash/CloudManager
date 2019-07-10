## Get All Server Types

### Method:

GET

### Endpoint:

```console
/api/servers/type/all
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
    },
    {
        "id": 2,
        "name": "cx11-ceph",
        "description": "CX11 Ceph Disk",
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
        "storageType": "network",
        "cpuType": "shared"
    },
    {
        "id": 3,
        "name": "cx21",
        "description": "CX21",
        "cores": 2,
        "memory": 4,
        "disk": 40,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0080000000",
                    "gross": "0.0095200000000000"
                },
                "priceMonthly": {
                    "net": "4.9000000000",
                    "gross": "5.8310000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0080000000",
                    "gross": "0.0095200000000000"
                },
                "priceMonthly": {
                    "net": "4.9000000000",
                    "gross": "5.8310000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0080000000",
                    "gross": "0.0095200000000000"
                },
                "priceMonthly": {
                    "net": "4.9000000000",
                    "gross": "5.8310000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "shared"
    },
    {
        "id": 4,
        "name": "cx21-ceph",
        "description": "CX21 Ceph Disk",
        "cores": 2,
        "memory": 4,
        "disk": 40,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0080000000",
                    "gross": "0.0095200000000000"
                },
                "priceMonthly": {
                    "net": "4.9000000000",
                    "gross": "5.8310000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0080000000",
                    "gross": "0.0095200000000000"
                },
                "priceMonthly": {
                    "net": "4.9000000000",
                    "gross": "5.8310000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0080000000",
                    "gross": "0.0095200000000000"
                },
                "priceMonthly": {
                    "net": "4.9000000000",
                    "gross": "5.8310000000000000"
                }
            }
        ],
        "storageType": "network",
        "cpuType": "shared"
    },
    {
        "id": 5,
        "name": "cx31",
        "description": "CX31",
        "cores": 2,
        "memory": 8,
        "disk": 80,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0140000000",
                    "gross": "0.0166600000000000"
                },
                "priceMonthly": {
                    "net": "8.9000000000",
                    "gross": "10.5910000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0140000000",
                    "gross": "0.0166600000000000"
                },
                "priceMonthly": {
                    "net": "8.9000000000",
                    "gross": "10.5910000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0140000000",
                    "gross": "0.0166600000000000"
                },
                "priceMonthly": {
                    "net": "8.9000000000",
                    "gross": "10.5910000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "shared"
    },
    {
        "id": 6,
        "name": "cx31-ceph",
        "description": "CX31 Ceph Disk",
        "cores": 2,
        "memory": 8,
        "disk": 80,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0140000000",
                    "gross": "0.0166600000000000"
                },
                "priceMonthly": {
                    "net": "8.9000000000",
                    "gross": "10.5910000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0140000000",
                    "gross": "0.0166600000000000"
                },
                "priceMonthly": {
                    "net": "8.9000000000",
                    "gross": "10.5910000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0140000000",
                    "gross": "0.0166600000000000"
                },
                "priceMonthly": {
                    "net": "8.9000000000",
                    "gross": "10.5910000000000000"
                }
            }
        ],
        "storageType": "network",
        "cpuType": "shared"
    },
    {
        "id": 7,
        "name": "cx41",
        "description": "CX41",
        "cores": 4,
        "memory": 16,
        "disk": 160,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0260000000",
                    "gross": "0.0309400000000000"
                },
                "priceMonthly": {
                    "net": "15.9000000000",
                    "gross": "18.9210000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0260000000",
                    "gross": "0.0309400000000000"
                },
                "priceMonthly": {
                    "net": "15.9000000000",
                    "gross": "18.9210000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0260000000",
                    "gross": "0.0309400000000000"
                },
                "priceMonthly": {
                    "net": "15.9000000000",
                    "gross": "18.9210000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "shared"
    },
    {
        "id": 8,
        "name": "cx41-ceph",
        "description": "CX41 Ceph Disk",
        "cores": 4,
        "memory": 16,
        "disk": 160,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0260000000",
                    "gross": "0.0309400000000000"
                },
                "priceMonthly": {
                    "net": "15.9000000000",
                    "gross": "18.9210000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0260000000",
                    "gross": "0.0309400000000000"
                },
                "priceMonthly": {
                    "net": "15.9000000000",
                    "gross": "18.9210000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0260000000",
                    "gross": "0.0309400000000000"
                },
                "priceMonthly": {
                    "net": "15.9000000000",
                    "gross": "18.9210000000000000"
                }
            }
        ],
        "storageType": "network",
        "cpuType": "shared"
    },
    {
        "id": 9,
        "name": "cx51",
        "description": "CX51",
        "cores": 8,
        "memory": 32,
        "disk": 240,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0500000000",
                    "gross": "0.0595000000000000"
                },
                "priceMonthly": {
                    "net": "29.9000000000",
                    "gross": "35.5810000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0500000000",
                    "gross": "0.0595000000000000"
                },
                "priceMonthly": {
                    "net": "29.9000000000",
                    "gross": "35.5810000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0500000000",
                    "gross": "0.0595000000000000"
                },
                "priceMonthly": {
                    "net": "29.9000000000",
                    "gross": "35.5810000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "shared"
    },
    {
        "id": 10,
        "name": "cx51-ceph",
        "description": "CX51 Ceph Disk",
        "cores": 8,
        "memory": 32,
        "disk": 240,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0500000000",
                    "gross": "0.0595000000000000"
                },
                "priceMonthly": {
                    "net": "29.9000000000",
                    "gross": "35.5810000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0500000000",
                    "gross": "0.0595000000000000"
                },
                "priceMonthly": {
                    "net": "29.9000000000",
                    "gross": "35.5810000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0500000000",
                    "gross": "0.0595000000000000"
                },
                "priceMonthly": {
                    "net": "29.9000000000",
                    "gross": "35.5810000000000000"
                }
            }
        ],
        "storageType": "network",
        "cpuType": "shared"
    },
    {
        "id": 11,
        "name": "ccx11",
        "description": "CCX11 Dedicated CPU",
        "cores": 2,
        "memory": 8,
        "disk": 80,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0300000000",
                    "gross": "0.0357000000000000"
                },
                "priceMonthly": {
                    "net": "19.9000000000",
                    "gross": "23.6810000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0300000000",
                    "gross": "0.0357000000000000"
                },
                "priceMonthly": {
                    "net": "19.9000000000",
                    "gross": "23.6810000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0300000000",
                    "gross": "0.0357000000000000"
                },
                "priceMonthly": {
                    "net": "19.9000000000",
                    "gross": "23.6810000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "dedicated"
    },
    {
        "id": 12,
        "name": "ccx21",
        "description": "CCX21 Dedicated CPU",
        "cores": 4,
        "memory": 16,
        "disk": 160,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.0600000000",
                    "gross": "0.0714000000000000"
                },
                "priceMonthly": {
                    "net": "34.9000000000",
                    "gross": "41.5310000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.0600000000",
                    "gross": "0.0714000000000000"
                },
                "priceMonthly": {
                    "net": "34.9000000000",
                    "gross": "41.5310000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.0600000000",
                    "gross": "0.0714000000000000"
                },
                "priceMonthly": {
                    "net": "34.9000000000",
                    "gross": "41.5310000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "dedicated"
    },
    {
        "id": 13,
        "name": "ccx31",
        "description": "CCX31 Dedicated CPU",
        "cores": 8,
        "memory": 32,
        "disk": 240,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.1200000000",
                    "gross": "0.1428000000000000"
                },
                "priceMonthly": {
                    "net": "69.9000000000",
                    "gross": "83.1810000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.1200000000",
                    "gross": "0.1428000000000000"
                },
                "priceMonthly": {
                    "net": "69.9000000000",
                    "gross": "83.1810000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.1200000000",
                    "gross": "0.1428000000000000"
                },
                "priceMonthly": {
                    "net": "69.9000000000",
                    "gross": "83.1810000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "dedicated"
    },
    {
        "id": 14,
        "name": "ccx41",
        "description": "CCX41 Dedicated CPU",
        "cores": 16,
        "memory": 64,
        "disk": 360,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.2400000000",
                    "gross": "0.2856000000000000"
                },
                "priceMonthly": {
                    "net": "139.9000000000",
                    "gross": "166.4810000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.2400000000",
                    "gross": "0.2856000000000000"
                },
                "priceMonthly": {
                    "net": "139.9000000000",
                    "gross": "166.4810000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.2400000000",
                    "gross": "0.2856000000000000"
                },
                "priceMonthly": {
                    "net": "139.9000000000",
                    "gross": "166.4810000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "dedicated"
    },
    {
        "id": 15,
        "name": "ccx51",
        "description": "CCX51 Dedicated CPU",
        "cores": 32,
        "memory": 128,
        "disk": 540,
        "prices": [
            {
                "location": "fsn1",
                "priceHourly": {
                    "net": "0.4800000000",
                    "gross": "0.5712000000000000"
                },
                "priceMonthly": {
                    "net": "269.9000000000",
                    "gross": "321.1810000000000000"
                }
            },
            {
                "location": "nbg1",
                "priceHourly": {
                    "net": "0.4800000000",
                    "gross": "0.5712000000000000"
                },
                "priceMonthly": {
                    "net": "269.9000000000",
                    "gross": "321.1810000000000000"
                }
            },
            {
                "location": "hel1",
                "priceHourly": {
                    "net": "0.4800000000",
                    "gross": "0.5712000000000000"
                },
                "priceMonthly": {
                    "net": "269.9000000000",
                    "gross": "321.1810000000000000"
                }
            }
        ],
        "storageType": "local",
        "cpuType": "dedicated"
    }
]
```