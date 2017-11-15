import java.io.*;

class bufferedinputstream {
    public static void main(String args[]) throws IOException {

        byte data[] = "The specimen was #5 in the series.#comment_goes_here#".getBytes(); 

        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BufferedInputStream bufferedinputstream = new BufferedInputStream(in);

        int character;
        boolean silentflag = false;

        while ((character = bufferedinputstream.read()) != -1) {

            switch(character) {
            case '#':
                if (silentflag) {
                    silentflag = false;
                } else {
                    silentflag = true;
                    bufferedinputstream.mark(100);
                }
                break;
            case ' ':
                if (silentflag) {
                    silentflag = false;
                    System.out.print("#");
                    bufferedinputstream.reset();
                } else
                    System.out.print((char) character);
                break;
            default:
                if (!silentflag) System.out.print((char) character);
            }
        }
    }
}
