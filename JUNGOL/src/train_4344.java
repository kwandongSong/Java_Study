

/*
 * -배열-
 * 
 * 
 * 
 * 평균은 넘겠지
 * 
 * 
 * 
 * */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class train_4344{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCaseNum=Integer.parseInt(br.readLine());

		
		for(int i=0;i<testCaseNum;i++) {
			int totalPoint=0;
			int upperCount=0;
			String[] point=br.readLine().split(" ");
			int numOfStudent=Integer.parseInt(point[0]);	
			for(int j=1;j<numOfStudent+1;j++) {
				totalPoint+=Integer.parseInt(point[j]);
			}
			
			int avg=totalPoint/numOfStudent;
			for(int j=1;j<numOfStudent+1;j++) {
				if(Integer.parseInt(point[j])>avg) {
					upperCount++;
				}
			}
			double d_upperCount=upperCount;
			double d_numOfStudent=numOfStudent;
			
			double result=d_upperCount/d_numOfStudent;
			//result=Math.round(result*100000)/1000.0;
			bw.write(String.format("%.3f", result*100) + "%\n");
	
		}
		bw.flush();
		bw.close();	
	}
}
