# TempoLuogo — Android V1

App Android per rilevare automaticamente il tempo trascorso nei luoghi configurati dall'utente.

## Stato

Fase 1 completata:
- progetto Android/Kotlin
- Jetpack Compose
- Room database
- entità `Place` e `Visit`
- DAO e database locale
- shell UI con Oggi, Cronologia, Luoghi e Report
- manifest con permessi di localizzazione/background
- fondazioni per geofence e foreground service

## Prossime fasi

1. gestione luoghi e mappa
2. geofencing reale
3. macchina a stati ingresso/permanenza/uscita
4. funzionamento in background e riavvio
5. report giornaliero, settimanale e mensile
6. modifica manuale ed esportazione

## Build

Aprire il progetto in Android Studio con JDK 17 e sincronizzare Gradle. La chiave Google Maps verrà configurata nella fase dedicata alla mappa e non viene inclusa nel repository.
