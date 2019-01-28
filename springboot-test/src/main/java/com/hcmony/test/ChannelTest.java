package com.hcmony.test;

import java.io.*;

public class ChannelTest {
	public static void main(String[] args) throws Exception{
		File file = null;
		FileInputStream fileInputStream=null;
		BufferedInputStream bufferedInputStream = null;
		BufferedReader reader = null;
		InputStreamReader reader1 = null;
		try {
			file = new File("D:\\a.txt");
			fileInputStream = new FileInputStream(file);
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			reader1 = new InputStreamReader(bufferedInputStream,"utf-8");
			reader = new BufferedReader(reader1);
			int tem = -1;
			int i=0;
			byte[] bytes = new byte[10];
			/*while ((tem=fileInputStream.read())!=-1){
				System.out.println(fileInputStream.read());
			}*/
			/*while ((tem = fileInputStream.read()) != -1) {
				bytes[i++] = (byte) fileInputStream.read();
			}*/
			/*while ((tem = bufferedInputStream.read(bytes)) != -1) {
				System.out.println(new String(bytes, 0, tem));
			}*/
			while ((tem = reader1.read()) != -1) {
				bytes[i++] = (byte) tem;
			}
			System.out.println(new String(bytes));
			/*String s = "";
			while (((s = reader.readLine())!=null) ){
				System.out.println(s);
			}*/
		}catch (Exception e){

		}finally {
			if(fileInputStream != null){
				fileInputStream.close();
			}
			if(bufferedInputStream != null){
				bufferedInputStream.close();
			}
			if(reader1 != null){
				reader1.close();
			}
			if(reader != null){
				reader.close();
			}
		}
	}
}
