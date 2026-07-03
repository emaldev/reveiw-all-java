public class Methods {
 
    String title; 
    String author; 
    int pages;
  
    
    public  void displayInfo(){
        System.out.println("Title: " + title + ", Author: "  + author + ", Pages: " + pages);
    }
    public void Play(){
        System.out.println("Name of book is : " + title + ", Author is: " + author + ", and the page is: " + pages);
    }

     
    

    
    public static void main(String[] args){
      Methods B1 = new Methods();
      Methods B2 = new Methods();
     
       Ebook B4 = new Ebook();
       B4.fileSize = "80 GB";
       B4.playList();
      B1.title = "Java ";
      B1.author = "Mohammad ";
      B1.pages = 613;
      B1.displayInfo();
      B2.title = "C++ Programming";
      B2.author = "Emal Hasanzada";
      B2.pages = 90123;
      B2.Play();
     

      

    


    }
}
    
    class Ebook extends Methods{
        String fileSize;
        public Ebook(String f, String t, String a, int p){
            fileSize = "90 GB";
        }
}

