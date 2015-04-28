package dwsamplebase;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jjoergensen on 4/28/15.
 */
public class HelloWorldRepresentation {

    private long id;

    private String content;

    public HelloWorldRepresentation() {
        // Jackson deserialization
    }

    public HelloWorldRepresentation(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
