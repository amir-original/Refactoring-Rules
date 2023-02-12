package blogLink;

public class BlogPostLinkGenerator {

    public String generateLink(Website website,BlogPost post){
        String url = website.getUrl();
        User user = post.getAuthor();
        String name = user.getUsername();
        int postId = post.getId();
        return url+name+postId;
    }
}
