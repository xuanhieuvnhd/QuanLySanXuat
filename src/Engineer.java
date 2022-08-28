public class Engineer extends Officer{
    private String branch;
    public Engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Ky su{" +
                "Chi Nhanh: '" + branch + '\'' +
                ", Ten: " + name + '\'' +
                ", Tuoi: " + age +
                ", Gioi tinh: '" + gender + '\'' +
                ", Dia chi: '" + address + '\'' +
                '}';
    }
}
