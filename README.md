# Cloud Manager

Der Cloud Manager ist ein API Service, der die Provisionierung, Inventarisierung und Monitoring einer Cloud Umgebung übernimmt.

## Features

- HTTP API: Die Kommunikation mit dem Service läuft über eine RESTfull API Schnittstelle.
- MySQL DB: Statische Daten liegen in einer MySQL Datenbank.
- Remote Execution: Per SSH können vorgegebene Aktionen ausgeführt werden z.B. Update.

## Funktionen

Über diesen Service kann:

- ein Server erstellt oder gelöscht werden.
- die Cloud Infrastruktur abgeglichen und inventarisiert werden (Dead Node detection).
- die Cloud Infrastruktur gemonitort werden.
- die Cloud Infrastruktur gewartet werden (z.B. Updates einspielen).

## Installation

Die Anwendung an sich ist stateless und benötigt nur ein paar statiche Parrameter, diese können der `CloudManager.conf` entnommen werden.


## Aufbau der `CloudManager.conf`

In der Config müssen eingetragen werden:
+ Hetzner Cloud API Key
+ MySQL Datenbank IP / Name / User und Passwort

```json
{
    APIKEY: "654sad5asd6a54d",
    DB_IP: 192.168.11.10,
    DB_NAME: CloudDB,
    DB_USER: DBManager,
    DB_PASSWORD: M@n@g3r
}
```
