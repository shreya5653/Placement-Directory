package Placements.PlacementDirectory.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "placement")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "internship_or_job", nullable = false)
    private String internshipOrJob;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "salary", nullable = false)
    private double salary;

    @Column(name = "hr_name")
    private String hrName;

    @Column(name = "person_placed", nullable = false)
    private String personPlaced;

    @Column(name = "contact_person_placed", nullable = false)
    private String contactPersonPlaced;

    public Placement() {}

    public Placement(String companyName, String internshipOrJob, String role, double salary, String hrName, String personPlaced, String contactPersonPlaced) {
        this.companyName = companyName;
        this.internshipOrJob = internshipOrJob;
        this.role = role;
        this.salary = salary;
        this.hrName = hrName;
        this.personPlaced = personPlaced;
        this.contactPersonPlaced = contactPersonPlaced;
    }

    // Add getters and setters for all fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInternshipOrJob() {
        return internshipOrJob;
    }

    public void setInternshipOrJob(String internshipOrJob) {
        this.internshipOrJob = internshipOrJob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public String getPersonPlaced() {
        return personPlaced;
    }

    public void setPersonPlaced(String personPlaced) {
        this.personPlaced = personPlaced;
    }

    public String getContactPersonPlaced() {
        return contactPersonPlaced;
    }

    public void setContactPersonPlaced(String contactPersonPlaced) {
        this.contactPersonPlaced = contactPersonPlaced;
    }

    // Add a toString() method
    @Override
    public String toString() {
        return "Placement{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", internshipOrJob='" + internshipOrJob + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", hrName='" + hrName + '\'' +
                ", personPlaced='" + personPlaced + '\'' +
                ", contactPersonPlaced='" + contactPersonPlaced + '\'' +
                '}';
    }
}
