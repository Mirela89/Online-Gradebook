package model;
import java.time.LocalDateTime;

public class Anunt{
    private long id;
    private String title;
    private String content;
    private LocalDateTime dateTime;
    private Facultate authorFacultate; // Reference to the faculty who posted the announcement

    // Constructor
    private Anunt() {
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Facultate getAuthorFacultate() {
        return authorFacultate;
    }

    public void setAuthorFacultate(Facultate authorFacultate) {
        this.authorFacultate = authorFacultate;
    }

    // Builder class
    public static class Builder {
        private long id;
        private String title;
        private String content;
        private LocalDateTime dateTime;
        private Facultate authorFacultate;

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }

        public Builder withDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public Builder withAuthorFacultate(Facultate authorFacultate) {
            this.authorFacultate = authorFacultate;
            return this;
        }

        public Anunt build() {
            return new Anunt();
        }
    }
}
