package mate.jdbc.model;

public class Driver {
    private Long id;
    private String name;
    private String licenceNumber;

    public Driver() {
    }

    public Driver(Long id, String name, String licenceNumber) {
        this.id = id;
        this.name = name;
        this.licenceNumber = licenceNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    @Override
    public String toString() {
        return "Driver{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", licenceNumber='" + licenceNumber + '\''
                + '}';
    }
}
