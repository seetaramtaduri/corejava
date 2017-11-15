//accepts a filename from command line argument and displays the no.of characters,
//words,and lines in the file

import java.io.*;
class count
{
public static void main(String a[])throws Exception
{
int ch;
boolean prev=true;

int char_count=0;
int word_count=0;
int line_count=0;

FileInputStream fis =new FileInputStream(a[0]);
while((ch=fis.read())!=-1)
{
 if(ch!=' ')++char_count;
 if(!prev && ch==' ')++word_count;
 if(ch==' ') prev=true; else prev=false;
 if(ch=='\n')++line_count;

 }                 
 char_count -=line_count*2;
 word_count+=line_count;
 System.out.println("no of chars="+char_count);
 System.out.println("no of words="+word_count);
 System.out.println("no of lines="+line_count);

 fis.close();
 }
 }
