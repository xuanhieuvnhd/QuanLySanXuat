public class Worker extends Officer{
    private int level;

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Cong nhan{" +
                "Bac nghe: " + level +
                ", Ten: '" + name + '\'' +
                ", Tuoi: " + age +
                ", Gioi tinh: '" + gender + '\'' +
                ", Dia chi: " + address + '\'' +
                '}';
    }
}
