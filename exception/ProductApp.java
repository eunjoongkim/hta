import java.io.*;

public class ProductApp {

	// ��ǰ���� �ؽ�Ʈ �� ���� ���޹޾Ƽ�
	// �� �߶� Product�� ��Ƽ� ��ȯ�ϴ� �޼ҵ�
	public static Product parseData(String text) {
	
		String[] arr = text.split(",");
		Product product = new Product(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));

		return product;
	}
	public static void main(String[] args) throws Exception {
		Product[] products = new Product[4];
		BufferedReader reader = new BufferedReader(new FileReader("Product.txt"));
		
		for (int i=0; i < products.length; i++) {
			products[i] = parseData(reader.readLine()); 
		}
		for (Product a : products) {
			System.out.printf("%s %s %d %f\n", a.getName(), a.getMaker(), a.getPrice(), a.getDiscount());
		}
		

	}
}