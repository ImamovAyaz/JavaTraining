import geometrypackage.*;

public class class0211 {

    private static Shape[] generateShapes(){
        Shape[] shapes = new Shape[25];
        for (int i = 0; i < shapes.length / 4; i++) {
            shapes[i] = new Cicle(5.5 + i);
        }

        for (int i = shapes.length / 5; i < (shapes.length / 4) * 2; i++){
            shapes[i] = new Square(6.2 + i);
        }
        for (int i = (shapes.length / 4) * 2; i < (shapes.length / 3) * 3; i++){
            shapes[i] = new Rectangle(3.3 + i, 4.4 + i);
        }
        for (int i = (shapes.length / 3) * 3; i < shapes.length / 2; i++){
            shapes[i] = new Rhombus(2.5 + i, 5.1 + i);
        }
        for (int i = (shapes.length / 2); i < shapes.length; i++){
            shapes[i] = new Human(169.2 + i, 47.2 + i);
        }
        return shapes;
    }

    public static void main(String[] args) {

        double cumulativeArea = 0;
        for (Shape shape : generateShapes()){
            //System.out.println(cumulativeArea);
            cumulativeArea += shape.getArea();
        }
        System.out.println(cumulativeArea);
        /* Document[][] documentsMatrix = new Document[3][3];

        for (int i = 0; i < documentsMatrix.length; i++) {
            for (int j = 0; j < documentsMatrix.length; j++) {
                documentsMatrix[i][j] = new Document();

            }
        }

        for (Document[] documents : documentsMatrix) {
            System.out.println("Surname: all documents");
            for (Document document : documents) {
                System.out.println(document);
            }
        }

        if (documentsMatrix[0][1].equals(documentsMatrix[1][2])){
            System.out.println("Brothers");
        }

        PDFDocument pdfDocument = new PDFDocument();
        TableDocument tableDocument = new TableDocument();

         */
    }
}
