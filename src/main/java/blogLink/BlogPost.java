package blogLink;

public class BlogPost {
    private User author;
    private int id;

    public BlogPost(User author, int id) {
        this.author = author;
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
