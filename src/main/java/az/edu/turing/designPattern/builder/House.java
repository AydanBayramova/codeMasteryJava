package az.edu.turing.designPattern.builder;

public class House {
    private int windows;
    private int doors;
    private String roof;

    private House(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.roof = builder.roof;
    }

    public static class HouseBuilder {
        private int windows;
        private int doors;
        private String roof;

        public HouseBuilder windows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House with " + windows + " windows, " + doors + " doors, and " + roof + " roof.";
    }
    public static void main(String[] args) {
        House house = new House.HouseBuilder().windows(10).doors(20).build();
    }
}
