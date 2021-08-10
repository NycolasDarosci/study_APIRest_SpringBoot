package com.test.treino.service;

/* 
    interface para criar um método que: 
    recebe um objeto qualquer
    e devolve um objeto qualquer
*/
public interface Mapper<A, B> {

    B map(A input);
}
