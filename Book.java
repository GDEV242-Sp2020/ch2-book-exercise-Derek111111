/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private String genre;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getGenre()
    {
     return genre;   
    }
    
    public String getPages()
    {
     return pages;   
    }
    
    public void printAuthor()
    {
      System.out.println("Author: " + author);   
    }
    
    public void printTitle()
    {
     System.out.println("Title: " + title);   
    }
    
    public void printGenre()
    {
     System.out.println("Genre: " + genre);    
    }
    
    public void printPages()
    {
     System.out.println("Pages: " + pages);   
    }
    
    public void printDetails()
    {
     System.out.println("Book Author: " + author);  
     System.out.println("Book Title: " + title);  
     System.out.println("Book Pages: " + pages);   
    }
}
