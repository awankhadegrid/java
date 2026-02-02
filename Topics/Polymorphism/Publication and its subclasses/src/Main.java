import com.sun.source.tree.BreakTree;

class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        if (getDetails().isEmpty()) {
            return getType() + ": " + getTitle();
        } else {
            return getDetails();
        }
    }
    public String getTitle(){
        return this.title;
    }
    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;

    }
    @Override
    public String getType() {
        return "Newspaper";
    }
    @Override
    public String getDetails() {
        return getType()+" (source - "+source+"): "+getTitle();
    }


}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return "Article";
    }
    @Override
    public String getDetails() {
        return getType()+" (author - "+author+"): "+getTitle();
    }

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getType() {
        return "Announcement";
    }
    @Override
    public String getDetails() {
        return getType()+" (days to expire - "+daysToExpire+"): "+getTitle();
    }

}