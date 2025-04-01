package post;

public class test1 {

	public static void main(String[] args) throws Exception{
		String str = "210821,강원도,강릉시,강동면,모전리,,,";	//0~4
		//String str = "380600,충청북도,충주시,,,,,충주우체국사서함";	//0~7
		//String str = "380966,충청북도,충주시,호암동,,,1~200,";	//0~6
		String[] array = str.split(",");
		
		System.out.println(array.length);
		
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
			System.out.println(array[3]);
			System.out.println(array[4]);
			
			if(array[5] == null) {
				System.out.println("aa");				
			}else {
				System.out.println(array[5]);
			}
	}
}
