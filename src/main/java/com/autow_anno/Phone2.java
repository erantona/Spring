package com.autow_anno;

public class Phone2 {
    private String phoneName;
    private String phoneMenu;

    public String getPhoneName() {
        return phoneName;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + phoneName + '\'' +
                ", phoneMenu='" + phoneMenu + '\'' +
                '}';
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneMenu() {
        return phoneMenu;
    }

    public void setPhoneMenu(String phoneMenu) {
        this.phoneMenu = phoneMenu;
    }
}
