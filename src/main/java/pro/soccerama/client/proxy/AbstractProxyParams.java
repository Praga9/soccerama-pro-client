package pro.soccerama.client.proxy;

/**
 * Created by kevin on 28/05/2016.
 */
public abstract class AbstractProxyParams {
    private String customIncludes;

    public String getCustomIncludes() {
        return customIncludes;
    }

    public void setCustomIncludes(String customIncludes) {
        this.customIncludes = customIncludes;
    }
}
