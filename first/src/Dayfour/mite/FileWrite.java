package Dayfour.mite;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;
public class FileWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Freelancer free=new Freelancer("abc","java",7,100);
                  File file=new File(" C:/cs046/first.txt");
                 // file.createNewFile();
                  FileOutputStream fos=new FileOutputStream(file);
                  DeflaterOutputStream dos=new DeflaterOutputStream(fos);
                  dos.write(free.toString().getBytes());
                  dos.close();
                  fos.close();
                  System.out.println("file created and date added");
                  FileInputStream fin=new FileInputStream(file);
                  DeflaterInputStream din=new DeflaterInputStream(fin);
                  byte[] temp=new byte[fin.available()];
                  fin.read(temp);
                  fin.close();
                  din.close();
                  System.out.println(new String(temp));
                  
	}

}
