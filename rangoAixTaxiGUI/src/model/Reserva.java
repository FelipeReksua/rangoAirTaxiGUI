package model;

import java.io.Serializable;

public class Reserva implements Serializable {

    private Aeronave aeronave;

    private Piloto piloto;

    private Heliporto origem;
    private Heliporto destino;

    private String idReserva;
    private String cliente;

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Heliporto getOrigem() {
        return origem;
    }

    public void setOrigem(Heliporto origem) {
        this.origem = origem;
    }

    public Heliporto getDestino() {
        return destino;
    }

    public void setDestino(Heliporto destino) {
        this.destino = destino;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Reserva() {
    }

    public Reserva(Aeronave aeronave, Piloto piloto, Heliporto origem, Heliporto destino, String idReserva, String cliente) {
        this.aeronave = aeronave;
        this.piloto = piloto;
        this.origem = origem;
        this.destino = destino;
        this.idReserva = idReserva;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "aeronave=" + aeronave + ", piloto=" + piloto + ", origem=" + origem + ", destino=" + destino + ", idReserva=" + idReserva + ", cliente=" + cliente + '}';
    }

}
