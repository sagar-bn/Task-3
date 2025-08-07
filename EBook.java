public class EBook extends Book {
   private String fileFormat;

    public EBook(int id, String title, String author,String fileFormate) {
    super(id, title, author);
    this.fileFormat=fileFormat;
    }
     public String getfileFormat() {
       return fileFormat;
    }

    public String toString() {
       return super.toString() + " (EBook - Format: " + fileFormat + ")";
    }
 
  
}
