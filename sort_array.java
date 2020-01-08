class sort_array{
	public static void main(String args[]){
		int array[];	
		int temp;
		array =new int[]{4,2,5,8,7,1,3,9,0};
		for (int i=0;i<array.length;i++){
			for (int j=i+1; j<array.length;j++){
				if(array[i]>array[j]){
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for (int i=0; i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
