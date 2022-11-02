import java.util.Objects;

public class Document {

    private String name;

    public Document() {
        name = "Document default name";
    }

    @Override
    public String toString() {
        return (super.toString() + " " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(name, document.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
