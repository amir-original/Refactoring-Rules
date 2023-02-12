package blogLink;

public class BlogPost {
    private final User author;
    private final String id;

    public BlogPost(User author, String id) {
        this.author = author;
        this.id = id;
    }

    public String generateLink(final Website website){
        return author.generateLink(website,id);
    }
}
