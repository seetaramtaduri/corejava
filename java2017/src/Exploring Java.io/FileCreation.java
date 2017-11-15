import java.io.*; 
    class  FileCreation 
     { 
       public static void main(String[] args)  
       { 
          try  
          { 
            File file = new File("MyFile.txt"); 
            // Create file if it does not exist 
            boolean success = file.createNewFile(); 
            if(success)  
            { 
              System.out.println("A File with a name"+file+"did not Exist and was created"); 
             }  
            else  
            { 
               System.out.println("File already exists.."); 
             } 
         }catch (IOException e) { } 
     } 
    } 