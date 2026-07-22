package com.tuan.coursemanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "enrollments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studen_name", nullable = false, length = 100)
    private String studentName;

    @Column(name = "course_id", nullable = false)
    private Long courseId; // khóa ngoại tham chiếu đến Course
}
