package com.example.lombok.intro;

/*
    created by Atiye Mousavi
    Date: 2/28/2022
    Time: 5:44 PM
*/

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class UserEvent implements Serializable {

    private @Id @Setter(AccessLevel.PROTECTED) Long id;

    @ManyToOne
    private User user;

    public UserEvent(User user) {
        this.user = user;
    }
}
