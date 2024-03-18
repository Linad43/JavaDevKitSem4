/*
Табельный номер
Номер телефона
Имя
Стаж
 */
public class Employee {
    private int tabNum;
    private String numPhone;
    private String name;
    private int exp;

    public Employee(int tabNum, String numPhone, String name, int exp) {
        this.tabNum = tabNum;
        this.numPhone = numPhone;
        this.name = name;
        this.exp = exp;
    }
    public int getTabNum() {
        return tabNum;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public String getName() {
        return name;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tabNum=" + tabNum +
                ", numPhone='" + numPhone + '\'' +
                ", name='" + name + '\'' +
                ", exp=" + exp +
                '}';
    }
}
