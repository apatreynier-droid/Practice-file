package Building;

class Building {
    private String address;
    private int numberOfFloors;
    private double totalArea;

    public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    
    public String getAddress() { return address; }
    public int getNumberOfFloors() { return numberOfFloors; }
    public double getTotalArea() { return totalArea; }

    public double calculateTotalRent() {
        return 0.0; 
    }

    public void displayInfo() {
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sq.m");
    }
}

class ResidentialBuilding extends Building {
    private int numberOfApartments;
    private double rentPerApartment;

    public ResidentialBuilding(String address, int numberOfFloors, double totalArea,
                               int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    @Override
    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Residential");
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: ₱" + rentPerApartment);
        System.out.println("Total Rent: ₱" + calculateTotalRent());
        System.out.println();
    }
}

class CommercialBuilding extends Building {
    private double officeSpace; 
    private double rentPerSqMeter;

    public CommercialBuilding(String address, int numberOfFloors, double totalArea,
                              double officeSpace, double rentPerSqMeter) {
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSqMeter = rentPerSqMeter;
    }

    @Override
    public double calculateTotalRent() {
        return officeSpace * rentPerSqMeter;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Commercial");
        System.out.println("Office Space: " + officeSpace + " sq.m");
        System.out.println("Rent per sq.m: ₱" + rentPerSqMeter);
        System.out.println("Total Rent: ₱" + calculateTotalRent());
        System.out.println();
    }
}

