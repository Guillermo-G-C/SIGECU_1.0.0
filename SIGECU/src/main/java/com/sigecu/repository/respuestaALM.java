package com.sigecu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigecu.entity.RespuestaALMEntity;

@Repository("respuestasALM")
public interface respuestaALM  extends JpaRepository<RespuestaALMEntity,Serializable>{

	public abstract RespuestaALMEntity findidrespuestaALM(int idrespuestaALM);
}
