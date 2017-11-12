package ivanloy.cosas;

public class Text {

	char[] text;
	
	public Text(String text) {
		
		this.text = text.toCharArray();
		
	}
	
	public void letterByLetter(int delay) throws InterruptedException{
		
		for(int i = 0; i < text.length; i++) {
			
			Thread.sleep(delay);
			
			
			
			if(i != text.length-2 && text[i] == '%' && text[i+1] == 'p') {
				
				Thread.sleep(delay*5);
				i += 2;
				
			}
			
			System.out.print(text[i]);
			
		}
		
	}
	
	
}
