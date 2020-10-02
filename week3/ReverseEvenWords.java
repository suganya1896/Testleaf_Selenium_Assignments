package javabasics1;


public class ReverseEvenWords {

	public static void main(String[] args) {
		
		
		String test = "I am a software tester";
		
		System.out.println("Original String:"+test);
		// split the string into words like {"i","am","a","software","tester"}
		String[] arr=test.split(" ");
		//storing length of string array into variable called length
		int length=arr.length;
		//printing length
		System.out.println("length of string array:"+length);
		//printing string array
		for (String eachvalue : arr) {
			
			System.out.println(eachvalue);
			
			}
		
		StringBuilder sb = new StringBuilder();
		
        for(int i = 0 ; i< arr.length; i++){ // loop over array length
        	//check index is even
            if(i%2 == 0)  
            {
            	//adding word to string builder if it is present in odd position
                sb.append(arr[i]);
            }
            else 
            	{
            	// else  reverse even position words using StringBuilder revrese() method 
            sb.append(new StringBuilder(arr[i]).reverse()); 
            	}
            
            sb.append(" ");// add a whitespace in between words
        }
        System.out.println("Reversed String :"+sb.toString().trim()); //remove extra whitespace from the end and convert StringBuilder to String

	
	}
}
