package com.DHbanco.model;


    public abstract class Cuenta{
        private Double saldo;

        public Cuenta(Double saldo) {
            this.saldo = saldo;
        }

        public void depositar(Double saldo){
            this.saldo += saldo;
            System.out.println("Su saldo es de: ");
        }

        public abstract void extraer(Double saldo);

        public Double informarSaldo() {
            return saldo;
        }
    }


