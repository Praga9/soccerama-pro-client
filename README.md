# soccerama-pro-client 
Client Library for Soccerama.pro V1.1 API

## Objectif
Cette bibliotheque à pour but de faciliter l'utilisation de l'API Soccerama.pro

## Utilisation
### 1 - Récupération d'une instance du client
```java
final SocceramaAPIClient instance = SocceramaAPIClient.getInstance(API_TOKEN);
```
### 2 - Récupération d'un proxy
```java
final OddProxy proxy = instance.getOddsProxyInstance();
```
### 3 - Parametrage de l'appel
```java
final OddProxyParams params = new OddProxyParams();
params.setMatchId(MATCH_ID);
```
### 4 - Appel de l'API
```java
final List<OddBookmaker> matchOdds = proxy.findByMatch(params);
```
## Liste des proxy disponibles

- CompetitionProxy
- CountryProxy
- LivescoreProxy
- MatchCommentProxy
- MatchProxy
- MatchStatisticsProxy
- OddProxy
- PlayerProxy
- SeasonProxy
- SocceramaProxy
- StandingProxy
- TeamProxy
