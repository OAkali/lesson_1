public class Animals extends Zoo{
    private int year;
    private Color color;
    private Deposit deposit;


    public Animals(String nameZoo, int countAnimals, int year, Color color, Deposit deposit) {
        super(nameZoo, countAnimals);
        this.year = year;
        this.color = color;
        this.deposit = deposit;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public Deposit getDeposit() {
        return deposit;
    }
    public String getInfo(){

        return "Name zoo: "+getNameZoo()+
                "\nCount animals: "+getCountAnimals()+
                "\nYear: "+year+
                "\nColor: "+color+
                "\nDeposit: "+ deposit.getName();
    }

    public final String makeVoice(){
        return "Звук животного";
    }
}
