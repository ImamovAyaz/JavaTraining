package newpackage;

public class DOCdocument extends Documents {
    private String name;
    private String path;

    public DOCdocument() {

    }

    public DOCdocument(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public void AddText(String text) {
        //Add text
    }
}
