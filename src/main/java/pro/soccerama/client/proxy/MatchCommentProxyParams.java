package pro.soccerama.client.proxy;

/**
 * Created by kevin on 21/05/2016.
 */
public class MatchCommentProxyParams extends AbstractProxyParams{
	private Integer matchId;

	/**
	 *
	 * @return
	 */
	public Integer getMatchId() {
		return matchId;
	}

	/**
	 * @param matchId
	 */
	public void setMatchId(final Integer matchId) {
		this.matchId = matchId;
	}

	/**
	 * @return
	 */
	public boolean isValidMatchId() {
		return matchId != null && matchId > 0;
	}
}
