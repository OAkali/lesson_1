public final class Lion extends Animals{
    private String commands;

    public Lion(String nameZoo, int countAnimals, int year, Color color, Deposit deposit, String commands) {
        super(nameZoo, countAnimals, year, color, deposit);
        this.commands = commands;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nCommands: "+commands;
    }

}
