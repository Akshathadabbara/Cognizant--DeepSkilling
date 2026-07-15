package week2.BuilderPattern;

public class BuilderPattern {

    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16 GB")
                .setStorage("512 GB SSD")
                .build();

        computer.display();
    }
}

class Computer {

    private String cpu;
    private String ram;
    private String storage;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public void display() {
        System.out.println("Computer Configuration");
        System.out.println("----------------------");
        System.out.println("CPU     : " + cpu);
        System.out.println("RAM     : " + ram);
        System.out.println("Storage : " + storage);
    }

    static class Builder {

        private String cpu;
        private String ram;
        private String storage;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}