
public class Books
{
    //Kitap nesnesini tanımlayan nesne
    private String name;        //Her kitabın ismi,
    private int id;             //ayırt edici id bilgisi
    private boolean flag;       //ve flagı tanımlanır

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public boolean isFlag()
    {
        return flag;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }

    public Books(String name, int id, boolean flag)
    {
        this.setName(name);
        this.setId(id);
        this.setFlag(flag);
    }

}
