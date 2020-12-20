package graphiceditor.after;

interface IFile {
  public void (String fileName) ;
  public String openFile(String fileName);
  public void parseFile();
  public void saveFile();
}
