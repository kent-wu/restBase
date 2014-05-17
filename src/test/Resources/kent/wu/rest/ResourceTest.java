package kent.wu.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(Resource.class);
    }

    @Test
    public void hello(){
        String s = target().path("/resource/hello").request().get(String.class);
//        new ObjectMapper().readValues(s,String.class);
//        Response response = s;

//        assertThat(response.getStatus(),is(200));
        assertThat(s,is("hello world"));

    }


}