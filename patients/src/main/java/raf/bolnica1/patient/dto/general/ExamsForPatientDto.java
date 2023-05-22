package raf.bolnica1.patient.dto.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExamsForPatientDto {

    private List<ExamForPatientDto> exams;

}