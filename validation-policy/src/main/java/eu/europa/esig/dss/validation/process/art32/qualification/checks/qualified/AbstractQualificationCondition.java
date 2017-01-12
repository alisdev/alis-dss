package eu.europa.esig.dss.validation.process.art32.qualification.checks.qualified;

import eu.europa.esig.dss.validation.process.art32.qualification.checks.Condition;

public abstract class AbstractQualificationCondition implements QualificationStrategy, Condition {

	@Override
	public boolean check() {
		return QualifiedStatus.isQC(getQualifiedStatus());
	}

}
