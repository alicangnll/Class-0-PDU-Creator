/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.alicangonullu.denemeprojesi;

/**
 *
 * @author Ali Can Gönüllü
 */

public class DenemeProjesi {
    public static void main(String[] args) {
        System.out.println(PDUConverter.encode("to", "from", "Merhaba, bu bir GSM denemesidir.").getPduCommand());
    }
 }

