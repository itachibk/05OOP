package graphiceditor.after;

public class Jpg implements IFile{
  public static final String EXTENSION = "jpg";
  private String fileOpenned;

  @Override
  public String openFile(String fileName) {
    fileOpenned = fileName;
    System.out.println(EXTENSION + ":  open " + fileName);
  }

  @Override
  public void parseFile() {
    System.out.println(EXTENSION + ": parse");
  }

  @Override
  public void saveFile() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  save");
    } else {
      System.out.println("Nothing to save");
    }
  }
}
