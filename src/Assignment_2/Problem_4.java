package Assignment_2;

// 1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. Find total price and total quantity using regular expression

public class Problem_4 {
    public static void main(String[] args) {
        String str = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^\\d]"," ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr =(str.split(" "));
        int saree_quantity = Integer.parseInt(arr[0]);
        int shirt_quantity = Integer.parseInt(arr[2]);
        int pant_quantity = Integer.parseInt(arr[4]);
        int total_quantity = (saree_quantity+shirt_quantity+pant_quantity);
        double saree_price = Double.parseDouble(arr[1]);
        double shirt_price = Double.parseDouble(arr[3]);
        double pant_price = Double.parseDouble(arr[5]);
        double total_price = (saree_price+shirt_price+pant_price);
        System.out.println("Total quantity: "+total_quantity);
        System.out.println("Total price: "+total_price);
    }
}