import java.util.ArrayList;
import java.util.List;
import graphiceditor.before.GraphicsEditor;
import graphiceditor.after.GraphicsEditor;


public class App {
    public static void main(String[] args) {

        GraphicsEditor ge = new GraphicsEditor();
        try {
            ge.openFile("girl.bmp");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
