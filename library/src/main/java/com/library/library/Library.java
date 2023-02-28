package com.library.library;

public class Library {
    private String libraryName;
    private  String libraryAddress;
    private int libraryNumber;
    private  String libraryFacilities;

    public Library(String libraryName, String libraryAddress, int libraryNumber, String libraryFacilities) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.libraryNumber = libraryNumber;
        this.libraryFacilities = libraryFacilities;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    public int getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(int libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getLibraryFacilities() {
        return libraryFacilities;
    }

    public void setLibraryFacilities(String libraryFacilities) {
        this.libraryFacilities = libraryFacilities;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", libraryAddress='" + libraryAddress + '\'' +
                ", libraryNumber=" + libraryNumber +
                ", libraryFacilities='" + libraryFacilities + '\'' +
                '}';
    }
}
