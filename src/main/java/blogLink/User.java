package blogLink;

public class User {
    private final String username;

    public User(String username) {
        this.username = username;
    }

    public String generateLink(Website website,String id){
        return website.generateLink(this.username,id);
    }
}
