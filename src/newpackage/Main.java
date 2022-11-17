package newpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Documents pdfDocuments = new PDFDocument("pdf", "/path/PDFDocument");
        Documents docDocument = new DOCdocument("doc", "/path/DOCDocument");
        Documents tableDocument = new TableDocument("table", "/path/TableDocument");

        List<Documents> allDocuments = Arrays.asList(pdfDocuments,docDocument,tableDocument);
        for (Documents document : allDocuments){
            document.AddText("TEXT FOR " + document.toString());
        }
    }
}
