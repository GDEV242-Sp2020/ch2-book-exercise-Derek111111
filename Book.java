            /**
             * author: Derek Ammerlaan
             * Book Class
             */
class Book
{
                 // The fields.
    private String author;
    private String title;
    private String genre;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
            
    /**
     * Constructor, will set author, title, pages, and
     * coursetext fields to their respective parameters.
     */
    public Book(String bookAuthor, String bookTitle, 
                int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;
    }

    /**
     * Return the value of the author field
     * @return: author of the book
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Return the title field of the book
     * @return: title of book
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the genre field of the book
     * @return: genre of book
     */
    public String getGenre()
    {
        return genre;   
    }
    
    /**
     * Returns pages field of book
     * @return: number of pages book has
     */
    public int getPages()
    {
        return pages;   
    }
    
    /**
     *Returns the refnumber field of the book
     *@return: refnumber of book
     */
    public String getRefNumber()
    {
        return refNumber;   
    }
    
    /**
     * Return borrowed field of book
     * @return: how many times book was borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Returns coursetext field of book
     * @return: if book is used as a textbook
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * Display the author field of the book object
     * in the console
     */
    public void printAuthor()
    {
        System.out.println("Author: " + author);   
    }
    
    /**
     * Display the title field of the book object
     * in the console
     */
    public void printTitle()
    {
        System.out.println("Title: " + title);   
    }
    
    /**
     * Display the genre field of the book object
     * in the console
     */
    public void printGenre()
    {
        System.out.println("Genre: " + genre);    
    }
    
    /**
     * Takes in parameter ref and sets the
     * refNumber field to ref if ref has
     * at least 3 characters
     * @param: String ref to be assigned to 
     * refNumber field
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() > 3)
        {
            refNumber = ref; 
        }else
        {
            System.out.println("Error: Parameter was not at " +
                                 "least 3 characters long");
        }
    }
    
    /**
     * Increased the borrowed field by 1 
     */
    public void incrementBorrowed()
    {
        borrowed++;
    }
    
    /**
     * Displays the pages field of the book object
     * in the console
     */
    public void printPages()
    {
        System.out.println("Pages: " + pages);   
    }
    
    /**
     * Display a formatted text of author, title
     * pages, borrowed fields of the book, as well
     * as refNumber if it has been assigned a value
     */
    public void printDetails()
    {
         String printString = "Author: " + author + ", Title: " + 
                            title + ", Pages: " + pages;
         if(refNumber.length() > 0)
         {
             printString = printString + ", RefNumber: " + refNumber;
         }else
         {
             printString = printString + "ZZZ";
         }
         System.out.println(printString + ", This book has been borrowed "+
                                            borrowed + " times");   
    }
}
