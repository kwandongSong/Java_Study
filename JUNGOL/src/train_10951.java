

/*
 * -while-
 * 
 * 
 * 
 * 원래의 수로 돌아가기
 * 
 * 
 * 
 * */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class train_10951{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count=0;
		int input=Integer.parseInt(br.readLine());
		int result=input;
		
		while(true) {
			int firstNum=result/10;
			int lastNum=result%10;
			int newNum=firstNum+lastNum;
			
			result=lastNum*10+newNum%10;
			count++;
			
			if(input==result) {		
				break;
			}
		}
		bw.write(count+"\n");
		bw.flush();
		bw.close();	
	}
}
