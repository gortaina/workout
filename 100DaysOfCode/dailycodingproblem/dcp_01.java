import java.util.Arrays;


public class dcp_01 {

	/**
	 *This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
	 */
	public static void main(String[] args) {
		dcp_01 cl1 = new dcp_01();
		cl1.init();
		System.out.println("END RunTime");
	}
	
	public void init(){
		//this.initMeasure();
		this.initMeasure2();
		//this.factorialFor(new int[]{1,2,3,4,5});
	}
	
	public void initMeasure(){
		int[] a = {1,15,3,7};
		int[] b = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//factorialFor        
		System.out.println("\nfactorialFor - Fatorial com LOOP For - BIG O ?");
		System.out.println("Sem modificação do Array.");
		System.currentTimeMillis();
		this.factorialFor(b);
		System.out.println("FIM \n");


		
		//factorialRecursivaVariavel
		System.out.println("factorialRecursivaVariavel - Fatorial com recursividade, com variável externa - BIG O ?");
		System.out.println("Sem modificação do Array.");
		System.currentTimeMillis();		
		this.factorialRecursivaVariavel(b, b.length-1);
		System.out.println("FIM \n");

		
		//factorialRecursivaVariavel2
		System.out.println("factorialRecursivaVariavel2 - Fatorial com recursividade, com variável externa - BIG O ?");
		System.out.println("Sem modificação do Array.");
		System.currentTimeMillis();		
		this.factorialRecursivaVariavel2(b, b.length-1);
		System.out.println("FIM \n");		
		
		//factorialRecursiva		
		System.out.println("factorialRecursiva - Fatorial com recursividade, sem variável externa - BIG O ?");
		System.out.println("SEM modificação do Array.");		
		System.currentTimeMillis();
		
		System.out.println(this.factorialRecursiva(b, b.length-1));
		
		System.out.println("FIM \n");
		
		System.currentTimeMillis();
	}	
	
	
	public int factorialFor(int[] a){
		int temp = 1;
		for (int i = 0; i < a.length; i++) {
			temp = temp*a[i];
		}
	    System.out.println(temp);
	    System.out.println(Arrays.toString(a));
		return temp;
	}
	

	public int fora = 1;
	
	public int factorialRecursivaVariavel(int[] a, int index){
		if(index == 0){
			System.out.println(fora);
			System.out.println(Arrays.toString(a));;
			return fora;
		}
		fora=fora*a[index];
		return factorialRecursivaVariavel(a, index-1);
	}

	public int factorialRecursivaVariavel2(int[] a, int index){

		if(index == 0){
			System.out.println(a[index]);
			System.out.println(Arrays.toString(a));			
			return a[index];
		}else{
			System.out.println(a[index]);
			fora = factorialRecursivaVariavel2(a, index-1);
			fora = a[index]*fora;
			return fora;
		}
	}
	

	public int factorialRecursiva(int[] a, int index){
		if(index == 0){
			System.out.println(a[index]);
			System.out.println(Arrays.toString(a));			
			return a[index];
		}else{
			return a[index]*factorialRecursiva(a, index-1);
		}
	}		
		
	
	
	public int fatorial2(int[] a, int index){
		if(index == 0){
			return a[index];
		}else{
			return a[index]*fatorial2(a, index-1);
		}
	}
	
	
	
	
	
	public void initMeasure2(){
		System.out.println("\n\n\n InitMeasure2 \n\n\n");
		int[] a = {1,15,3,7};
		System.out.println(Arrays.toString(a));
		
		//multiplicarArray
		//System.out.println("\nmultiplicarArray - Multiplicação de array D1 por uma constante - BIG O ?");
		//System.out.println("Com modificação do Array.");		
		//System.currentTimeMillis();
		//this.multiplicarArray(a, 17);
		//System.out.println("FIM \n");
		
		System.out.println("\nmultiplicarArray2 - Multiplicação de array D1 por uma constante - BIG O ?");		
		this.multiplicarArray2(a, 17);
		System.out.println("FIM \n");
	}
		
	
	public void multiplicarArray(int a [], int k){
		System.out.println("Constante: "+k);
    	for (int i = 0; i < a.length; i++) {
			a[i] = k*a[i];
		}
		System.out.println(Arrays.toString(a));
	}	
	
	
	public void multiplicarArray2(int a [], int k){
		System.out.println("Constante: "+k);
    	for (int i : a) {
			System.out.print(" "+i*k);;
		}
		System.out.println("\n"+Arrays.toString(a));
	}
	
}
