package com.trackerua.gps.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "usr")
@EqualsAndHashCode(of = {"id"})
public class Group {

    @Id
    @JsonView(View.Id.class)
    private String id;

    @OneToMany(mappedBy = "group_id", fetch = FetchType.EAGER/*, cascade = CascadeType.ALL*/)
    private List<User> user_id;
    //private Message message_id;

}
