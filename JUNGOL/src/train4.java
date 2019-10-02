/*
 * 
 * BufferedReader, Writer String고정, 엔터만 경계로 인식 하지만 속도가 더 빠르다.
 * 때문에 띄어쓰기는 처리해줘야함 
 * 버퍼가 더 빠른 이유, 하드웨어가 느려서 입출력을 모았다 보내는게 더 빠름.
 * 
 * */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class train4{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int howManyNum = Integer.parseInt(br.readLine());
		//처음 입력 숫자 몇 줄인지
		
		for(int i=0; i<howManyNum; i++) {
			String[] inputNums =br.readLine().split(" "); 
			int a= Integer.parseInt(inputNums[0]);
			int b= Integer.parseInt(inputNums[1]);
			bw.write((a+b)+"\n");
		}
		bw.flush();
		bw.close();
		
		//		String[][] inputNums = new String[howManyNum][];
//		int[] result = new int[howManyNum];
//		for(int i=0; i<howManyNum; i++) {
//			inputNums[i]=bf.readLine().split(" ");
//			if (inputNums.length>=2) {
//				int a= Integer.parseInt(inputNums[i][0]);
//				int b= Integer.parseInt(inputNums[i][1]);											
//				result[i] = a+b;
//				System.out.println(result[i]);
//			}
//		}
//		for(int j=0; j<howManyNum; j++) {
//			System.out.println(result[j]);
//		}		
	}
}