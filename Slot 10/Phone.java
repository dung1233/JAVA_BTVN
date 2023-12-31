package demo;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public abstract class Phone {
    abstract void insertPhone(String name, String phone);

    abstract void removePhone(String name);

    abstract void updatePhone(String name, String oldPhone, String newPhone);

    abstract PhoneNumber searchPhone(String name);

    abstract void sort();
}

