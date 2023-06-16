package Qara.evo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @ManyToOne
    //referencedColumnName = "id"
    //o demekdiki men postmanda request atanda school:{id:1} yazanda 1 ci id uygun melumatlar getirsin
    @JoinColumn(name = "university_id",referencedColumnName = "id")
    private School school;

}
