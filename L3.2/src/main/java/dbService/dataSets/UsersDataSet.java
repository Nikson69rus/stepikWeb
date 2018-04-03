package dbService.dataSets;

/**
 * @author v.chibrikov
 *         <p>
 *         Пример кода для курса на https://stepic.org/
 *         <p>
 *         Описание курса и лицензия: https://github.com/vitaly-chibrikov/stepic_java_webserver
 */
@SuppressWarnings("UnusedDeclaration")
public class UsersDataSet {
    private long id;
    private String name;
    private String pass;

    public UsersDataSet(long id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getPass(){
        return pass;
    }

    @Override
    public String toString() {
        return "UsersDataSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
