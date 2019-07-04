package ru.malyshev.embedded.enums;
import  java.util.Arrays;
import java.util.stream.Collectors;

import static org.springframework.util.StringUtils.isEmpty;

public enum  VersionState {
    DESIGN ( "Проектирование"),
    PRODUCTION( "Промышленная эксплуатация");
    private String state;

    VersionState(String state) {
        this.state = state;
    }

    public String getState(){return state;}

    public static VersionState getByName(String name){
        if(!isEmpty(name)){
            return Arrays.stream(VersionState.values())
                    .filter(group -> name.equals(group.getState()))
                    .collect(Collectors.toList()).get(0);
        }
        return null;


    }
}
