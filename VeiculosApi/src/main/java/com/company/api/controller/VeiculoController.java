package com.company.api.controller;

import com.company.api.model.VeiculoModel;
import com.company.api.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/veiculos", produces = MediaType.APPLICATION_JSON_VALUE)
public class VeiculoController {
    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    @ResponseBody
    public VeiculoModel created(@RequestBody VeiculoModel veiculo){
        return veiculoService.created(veiculo);
    }

    @PutMapping("/{veiculoId}")
    @ResponseBody
    public VeiculoModel updated(@PathVariable("veiculoId") Long veiculoId,
                                @RequestBody VeiculoModel veiculo){
        return veiculoService.updated(veiculo, veiculoId);
    }

    @DeleteMapping("/{veiculoId}")
    @ResponseBody
    public String deleted(@PathVariable("veiculoId") Long veiculoId){
        return veiculoService.deleted(veiculoId);
    }

    @GetMapping("/{veiculoId}")
    @ResponseBody
    public VeiculoModel getById(@PathVariable("veiculoId") Long veiculoId){
        return veiculoService.getById(veiculoId);
    }

    @GetMapping
    @ResponseBody
    public List<VeiculoModel> getAll(){
        return veiculoService.getAll();
    }






}
