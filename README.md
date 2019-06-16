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