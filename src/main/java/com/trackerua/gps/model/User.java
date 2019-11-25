package com.trackerua.gps.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "usr")
@EqualsAndHashCode(of = {"id"})
public class User implements Serializable {
    @Id
    @JsonView(View.Id.class)
    private String id;

    @JsonView(View.IdName.class)
    private String name;

    private String email;

    private String picture;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group_id;

    private Boolean is_admin;

    private Long pos_x;

    private Long pos_y;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastVisit;
}
