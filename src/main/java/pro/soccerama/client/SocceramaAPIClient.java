package pro.soccerama.client;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;

import pro.soccerama.client.exception.InvalidSocceramaServiceInstanceException;
import pro.soccerama.client.proxy.CompetitionProxy;
import pro.soccerama.client.proxy.LivescoreProxy;
import pro.soccerama.client.proxy.MatchCommentProxy;
import pro.soccerama.client.proxy.MatchProxy;
import pro.soccerama.client.proxy.MatchStatisticsProxy;
import pro.soccerama.client.proxy.OddProxy;
import pro.soccerama.client.proxy.PlayerProxy;
import pro.soccerama.client.proxy.SeasonProxy;
import pro.soccerama.client.proxy.StandingProxy;
import pro.soccerama.client.proxy.TeamProxy;

public class SocceramaAPIClient {

	private static SocceramaAPIClient INSTANCE;
	private String apiToken = null;

	/**
	 * @param apiToken
	 */
	private SocceramaAPIClient(final String apiToken) {
		super();
		// Hide constructor
		this.apiToken = apiToken;

		Unirest.setObjectMapper(createObjectMapper());
		Unirest.setHttpClient(createSSLHttpClient());
	}

	/**
	 * Retourne l'instance courante
	 *
	 * @return
	 */
	public static SocceramaAPIClient getInstance() {
		checkInstance();

		return INSTANCE;
	}

	private static void checkInstance() {
		if (INSTANCE == null || INSTANCE.getApiToken() == null) {
			throw new InvalidSocceramaServiceInstanceException();
		}
	}

	/**
	 * Retourne l'instance courante ou la crée
	 *
	 * @param apiToken
	 * @return
	 */
	public static SocceramaAPIClient getInstance(final String apiToken) {
		if (INSTANCE == null || INSTANCE.getApiToken() == null || !INSTANCE.getApiToken().equals(apiToken)) {
			INSTANCE = new SocceramaAPIClient(apiToken);
		}

		return INSTANCE;
	}

	/**
	 * Retourne une instance du proxy Competition
	 *
	 * @return
	 */
	public CompetitionProxy getCompetitionProxyInstance() {
		checkInstance();
		return CompetitionProxy.getInstance();
	}

	/**
	 * Retourne une instance du proxy Season
	 *
	 * @return
	 */
	public SeasonProxy getSeasonProxyInstance() {
		checkInstance();
		return SeasonProxy.getInstance();
	}

	/**
	 * Retourne une instance du proxy Team
	 *
	 * @return
	 */
	public TeamProxy getTeamProxyInstance() {
		checkInstance();
		return TeamProxy.getInstance();
	}

	/**
	 * Retourne une instance du proxy Match
	 *
	 * @return
	 */
	public MatchProxy getMatchProxyInstance() {
		checkInstance();
		return MatchProxy.getInstance();
	}

	/**
	 * Retourne une instance du proxy Player
	 *
	 * @return
	 */
	public PlayerProxy getPlayerProxyInstance() {
		checkInstance();
		return PlayerProxy.getInstance();
	}

	/**
	 * Retourne une instance du proxy Livescore
	 *
	 * @return
	 */
	public LivescoreProxy getLivescoreProxyInstance() {
		checkInstance();
		return LivescoreProxy.getInstance();
	}

	/**
	 * Retourne une instance du proxy Match Comment
	 *
	 * @return
	 */
	public MatchCommentProxy getMatchCommentProxyInstance() {
		checkInstance();
		return MatchCommentProxy.getInstance();
	}

	/**
	 * Retourne une instance du proxy Standing
	 *
	 * @return
	 */
	public StandingProxy getStandingProxyInstance() {
		checkInstance();
		return StandingProxy.getInstance();
	}

	/**
	 * Retourne une instance du proxy Match statistics
	 *
	 * @return
	 */
	public MatchStatisticsProxy getMatchStatisticsProxyInstance() {
		checkInstance();
		return MatchStatisticsProxy.getInstance();
	}

	/**
	 * Retourne une instance du proxy Odds
	 *
	 * @return
	 */
	public OddProxy getOddsProxyInstance() {
		checkInstance();
		return OddProxy.getInstance();
	}

	/**
	 * Retourne l'API Key
	 *
	 * @return
	 */
	public String getApiToken() {
		return apiToken;
	}

	/**
	 * @return
	 */
	private HttpClient createSSLHttpClient() {

		final TrustStrategy acceptingTrustStrategy = new TrustStrategy() {

			@Override
			public boolean isTrusted(final X509Certificate[] arg0, final String arg1) throws CertificateException {
				return true;
			}
		};

		SSLContext sslContext = null;
		try {
			sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
		} catch (final Exception e) {
			System.out.println("Could not create SSLContext");
		}

		return HttpClientBuilder.create().setSSLContext(sslContext).build();
	}

	/**
	 * @return
	 */
	private ObjectMapper createObjectMapper() {
		return new ObjectMapper() {
			private final com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();

			@Override
			public <T> T readValue(final String value, final Class<T> valueType) {
				try {
					return jacksonObjectMapper.readValue(value, valueType);
				} catch (final IOException e) {
					throw new RuntimeException(e);
				}
			}

			@Override
			public String writeValue(final Object value) {
				try {
					return jacksonObjectMapper.writeValueAsString(value);
				} catch (final JsonProcessingException e) {
					throw new RuntimeException(e);
				}
			}
		};
	}

}
