package raf.bolnica1.laboratory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import raf.bolnica1.laboratory.domain.lab.AnalysisParameter;

import java.util.List;

@Repository
public interface AnalysisParameterRepository extends JpaRepository<AnalysisParameter, Long> {

    @Query("SELECT ap FROM AnalysisParameter ap WHERE ap.labAnalysis.id=:analysisId AND ap.parameter.id=:parameterId")
    AnalysisParameter findAnalysisParameterByAnalysisIdAndParameterId(@Param("analysisId")Long analysisId,@Param("parameterId")Long parameterId);

    @Query("SELECT ap.parameter.parameterName FROM AnalysisParameter ap WHERE ap.labAnalysis.id=:analysisId")
    List<String> findAnalysisParameterByAnalysisId(@Param("analysisId")Long analysisId);

    @Query("SELECT ap FROM AnalysisParameter ap WHERE ap.id=:id")
    AnalysisParameter findAnalysisParameterById(@Param("id")Long id);


}

