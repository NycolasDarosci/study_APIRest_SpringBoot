package com.test.treino.service;

import java.util.List;

public interface MapperList<A, B> {

    List<B> map(List<A> input);
}
