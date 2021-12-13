package net.mouseinc.employeespringbootapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    private String name;

    private String jurusan;

    @Version
    @Column(columnDefinition = "") //integer DEFAULT 0
    private Integer version;

    public Employee(String name, String jurusan) {
        this.name = name;
        this.jurusan = jurusan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getName() {
        return name;
    }

    public String getJurusan() {
        return jurusan;
    }
}
