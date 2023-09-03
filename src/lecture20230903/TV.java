package lecture20230903;

class TV {
    private String brand;
    private int year;
    private int inches;

    public TV(String brand, int year, int inches) {
        this.brand = brand;
        this.year = year;
        this.inches = inches;
    }

    public void show() {
        System.out.println(brand + "에서 만든 " + year + "년형 " + inches + "인치 TV");
    }

    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}




