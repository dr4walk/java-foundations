package core.oop_hw;

public class Notebook {
    private final int numPages;
    private final String format;

    public Notebook(int numPages, String format) {
        this.numPages = numPages;
        this.format = format;
    }

    public int getNumPages() {
        return this.numPages;
    }

    public String getFormat() {
        return this.format;
    }
}
