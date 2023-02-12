package blogLing;

import blogLink.BlogPost;
import blogLink.BlogPostLinkGenerator;
import blogLink.User;
import blogLink.Website;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BlogLinkShould {

    @Test
    void create_link() {
        final BlogPostLinkGenerator linkGenerator = new BlogPostLinkGenerator();
        final String url = "http://blog.ir/";
        final String username = "amir";
        final String postId = "post-545";
        final String link = linkGenerator.generateLink(new Website(url),
                new BlogPost(new User(username), postId));

        assertThat(link).isEqualTo(url+username+postId);
    }
}
