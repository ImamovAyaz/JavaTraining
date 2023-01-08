package newpackage;

public class PDFDocument extends Documents {
    private String name;
    private String path;

    public PDFDocument() {

    }

    public PDFDocument(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public void AddText(String text) {
        //Add text
    }
}
