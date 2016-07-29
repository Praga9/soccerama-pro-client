package pro.soccerama.client.proxy;

/**
 * Created by kevin on 21/05/2016.
 */
public class StandingProxyParams extends AbstractProxyParams{
	private Integer seasonId;

	/**
	 * @return
	 */
	public Integer getSeasonId() {
		return seasonId;
	}

	/**
	 * @param seasonId
	 */
	public void setSeasonId(final Integer seasonId) {
		this.seasonId = seasonId;
	}

	/**
	 * @return
	 */
	public boolean isValidSeasonId() {
		return seasonId != null && seasonId > 0;
	}
}
