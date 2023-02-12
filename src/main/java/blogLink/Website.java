package blogLink;

public class Website {

    private final String url;

    public Website(String url) {
        this.url = url;
    }

    public String generateLink(String name,String id){
        return this.url + name + id;
    }
}
