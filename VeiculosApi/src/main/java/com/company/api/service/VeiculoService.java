package com.company.api.service;

import com.company.api.model.VeiculoModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VeiculoService {
    private static final Map<Long, VeiculoModel> veiculos = new HashMap<>();

    public VeiculoModel created(VeiculoModel veiculo){
        Long proximoId = veiculos.keySet().size() + 1L;
        veiculo.setId(proximoId);
        veiculos.put(proximoId, veiculo);
        return veiculo;
    }

    public VeiculoModel updated(VeiculoModel veiculo, Long veiculoId){
        veiculos.put(veiculoId, veiculo);
        return veiculo;
    }

    public String deleted(Long veiculoId){
        veiculos.remove(veiculoId);
        return "Deleted";
    }

    public VeiculoModel getById(Long veiculoId){
        return veiculos.get(veiculoId);
    }

    public List<VeiculoModel> getAll(){
        return new ArrayList<>(veiculos.values());
    }




}
