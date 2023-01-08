package newpackage;

public class TableDocument extends Documents {
    private String name;
    private String path;

    public TableDocument() {

    }

    public TableDocument(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public void AddText(String text) {
        //Add text
    }
}
