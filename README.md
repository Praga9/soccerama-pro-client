# soccerama-pro-client
Client Library for Soccerama.pro API

## Objectif
Cette bibliotheque à pour but de faciliter l'utilisation de l'API Soccerama.pro

## Utilisation
### 1 - Récupération d'une instance du client
final SocceramaAPIClient instance = SocceramaAPIClient.getInstance(API_TOKEN);

### 2 - Récupération d'un proxy
final OddProxy proxy = instance.getOddsProxyInstance();

### 3 - Parametrage de l'appel
final OddProxyParams params = new OddProxyParams();
params.setMatchId(MATCH_ID);

### 4 - Appel de l'API
final List<OddBookmaker> matchOdds = proxy.findByMatch(params);
