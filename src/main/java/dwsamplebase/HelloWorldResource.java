package dwsamplebase;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jjoergensen on 4/28/15.
 */

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final AtomicLong counter;

    public HelloWorldResource() {
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public HelloWorldRepresentation sayHello() {
        return new HelloWorldRepresentation(counter.incrementAndGet(), "Hello World!");
    }
}
