package wordcount;

public class Words {
    private String words;

    public Words(String words) {
        this.words = words;
    }

    public String getWords() {
        return this.words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public void removePunctuation() {
        this.words.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
    }

    public String[] splitWords() {
        return this.words.split(" +");
    }
}