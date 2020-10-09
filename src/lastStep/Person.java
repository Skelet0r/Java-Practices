package lastStep;

public class Person
{
    private String name = "";
    private int years = 0;

    public Person (String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public int getYears()	{
        return years;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }

}
