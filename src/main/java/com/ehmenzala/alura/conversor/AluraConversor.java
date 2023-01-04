package com.ehmenzala.alura.conversor;

import java.util.stream.Stream;
import javax.swing.JOptionPane;

public class AluraConversor {

    public static void main(String[] args) {
        
        CurrencyConversion[] conversionsInstances = CurrencyConversion.values();
        String[] conversionsStatements = Stream.of(conversionsInstances)
            .map((el) -> el.getStatement()).toArray(String[]::new );
        
        double quantity = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir"));
        
        Object option = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Nazi", JOptionPane.QUESTION_MESSAGE, null, conversionsStatements, conversionsStatements[0]);
        
        
        CurrencyConversion selectedConversion = null;
        
        for (CurrencyConversion instance: conversionsInstances) {
            if (instance.getStatement().equals((String) option)) {
                selectedConversion = instance;
            }
        }
        
        double operation = Math.round(quantity * selectedConversion.getConvertFactor() * 100.0) / 100.0;
        
        String message = "Tienes " + operation + " " + selectedConversion.getToConvert();
        
        JOptionPane.showMessageDialog(null, message, "Conversión", JOptionPane.INFORMATION_MESSAGE);
        
        int userInput = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.YES_NO_OPTION);
        
        if (userInput == 1) System.exit(0);
    }
}
