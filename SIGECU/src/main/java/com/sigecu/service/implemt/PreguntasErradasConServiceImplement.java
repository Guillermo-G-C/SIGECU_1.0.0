/**
 * 
 */
package com.sigecu.service.implemt;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.converter.CursosConverter;
import com.sigecu.entity.Cursos;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.Respuestas;
import com.sigecu.model.CursoModel;
import com.sigecu.repository.CursosRepository;
import com.sigecu.service.PreguntasErradasConService;

/**
 * @author Dell
 *
 */
@Service("preErradasServiceImpl")
public class PreguntasErradasConServiceImplement implements PreguntasErradasConService{

	private static final Log LOG = LogFactory.getLog(PreguntasErradasConServiceImplement.class);
	@Autowired
	@Qualifier("cursoRepository")
	private CursosRepository cursoRepository;
	@Autowired
	@Qualifier("cursosConvertir")
	private CursosConverter cursosConverter;

	
	@Override
	public List<Respuestas> listarPreguntasHerradas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evaluaciones> listarEvaluaciones() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CursoModel> listaCursos() {
		List<Cursos> cursos = cursoRepository.findAll();
		List<CursoModel> cursoModel = new ArrayList<CursoModel>();
		for (Cursos curso : cursos) {
			cursoModel.add(cursosConverter.convertCursoToCursoModel(curso));
		}
		return cursoModel;
	}
}
