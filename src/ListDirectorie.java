import java.io.File;

public class ListDirectorie {

private static StringBuffer indent = new StringBuffer();

 public static void main(String[] args) {
   File[] roots = null;

  // if(args.length>0) {                               // Check for command line argument                            
     File directory = new File("C:");
     if(directory.isDirectory()) {                   // If it is a directory
       roots = new File[1];                          // then store it ready for listing
       roots[0] = directory;
     } else {                                        // otherwise issue message and bail out
       System.out.println(directory.getName()+" is not a directory");
       System.exit(1);
     }
                     
                           
   ListDirectorie lister = new ListDirectorie();    // Create object to do the listing
   for(int count = 0 ; count<roots.length ; count++)              // and list all the directories
     lister.listDirectories(roots[count]);
 }

 // Lists directories recursively with each subdirectory level indented two spaces
 private void listDirectories(File rootDirectory) {
   String name = rootDirectory.getName();
   if(name.length()==0)                              
     name = rootDirectory.getPath();                  
   System.out.println(indent.toString()+name);      
   indent.append("  ");                              
   File[] fileList = rootDirectory.listFiles();  
   if(fileList != null)                              
     for(int count = 0 ; count<fileList.length ; count++)        
       listDirectories(fileList[count]);

   indent.delete(indent.length()-2, indent.length());
   return;                                            
 }

 // Filter method to only accept directories
 public boolean accept(File file) {
   return file.isDirectory();
 }

}