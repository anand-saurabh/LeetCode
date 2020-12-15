class Cashier {
    int n;
    int discount;
    int[] products;
    int[] prices;
    Map<Integer, Integer> priceMap = new HashMap<>();
    int counter;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        for(int i =0; i< products.length; i++)
            this.priceMap.put(products[i], prices[i]);
    }

    public double getBill(int[] product, int[] amount) {
        ++counter; double total =0, discount = 0;
        for(int i = 0; i< product.length; i++){
            total += (priceMap.get(product[i]) * amount[i]);
        }
        if(counter == n){
            discount = total *(this.discount/100d);
            counter =0;
        }
        return total - discount;
    }
}