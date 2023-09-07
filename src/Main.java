public class Main {
    public static void main(String[] args) {
        Deposit deposit=new Deposit("Африканский");
        Animals animals= new Animals("Живая экзотика ",4,10,Color.BROWN,deposit);
        System.out.println(animals.getInfo());
        System.out.println(animals.makeVoice());


        Deposit deposit1=new Deposit("Африканский");
        Lion lean1= new Lion("Африканский зоопарк",10,15,Color.BLACK,deposit1,"Лижать ");
        System.out.println(lean1.getInfo());

        Deposit deposit3=new Deposit("Южна Африканский ");
        Lion lion2= new Lion("Южная Африканский",20,14,Color.RED,deposit3,"Пригать ");
        System.out.println(lion2.getInfo());
    }
}