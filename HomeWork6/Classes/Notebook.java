package HomeWork6.Classes;

import java.util.Objects;

public class Notebook implements Comparable<Notebook> {

    private String name;
    private Double sizeDiagonal;
    private Double weight;
    private String cpu;
    private String os;
    private Integer ram;
    private Integer ramChannel;
    private Integer hdd;
    private Integer ssd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSizeDiagonal() {
        return sizeDiagonal;
    }

    public void setSizeDiagonal(Double sizeDiagonal) {
        this.sizeDiagonal = sizeDiagonal;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRamChannel() {
        return ramChannel;
    }

    public void setRamChannel(Integer ramChannel) {
        this.ramChannel = ramChannel;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public Notebook(String name, Double sizeDiagonal, Double weight ,String os,String cpu, Integer ram, Integer hdd) {
        this.name = name;
        this.sizeDiagonal = sizeDiagonal;
        this.weight = weight;
        this.os = os;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(name, notebook.name) && sizeDiagonal.equals(notebook.sizeDiagonal) && weight.equals(notebook.weight) && Objects.equals(cpu, notebook.cpu) && Objects.equals(os, notebook.os) && ram.equals(notebook.ram) && ramChannel.equals(notebook.ramChannel) && hdd.equals(notebook.hdd) && ssd.equals(notebook.ssd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sizeDiagonal, weight, cpu, os, ram, ramChannel, hdd, ssd);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", sizeDiagonal=" + sizeDiagonal +
                ", weight=" + weight +
                ", cpu='" + cpu + '\'' +
                ", os='" + os + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

    @Override
    public int compareTo(Notebook o) {
        return name.compareTo(o.getName());
    }
}
