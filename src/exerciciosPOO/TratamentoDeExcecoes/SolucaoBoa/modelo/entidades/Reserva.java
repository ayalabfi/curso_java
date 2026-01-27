package exerciciosPOO.TratamentoDeExcecoes.SolucaoBoa.modelo.entidades;

import exerciciosPOO.TratamentoDeExcecoes.SolucaoBoa.modelo.excecoes.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private int quarto;
    private Date checkIn;
    private Date checkOut;

    public Reserva(){
    }

    public Reserva(int quarto, Date checkIn, Date checkOut){
        this.quarto = quarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        if (!checkOut.after(checkIn)) {
            throw new DomainException("A data de check-out não pode ser anterior a data de check-in!");
        }
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao(){
        // O getTime traz a data em milisegundos, fazendo com que a operação abaixo calcule a diferença das datas.
        long diff = checkOut.getTime() - checkIn.getTime();
        // Converte o tempo em milisegundos para dias.
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas (Date checkIn, Date checkOut){

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("As datas de reserva não podem ser anteriores a data atual!");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("A data de check-out não pode ser anterior a data de check-in!");
        }

            this.checkIn = checkIn;
            this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Quarto "
                + quarto
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duracao()
                + " noites";
    }
}