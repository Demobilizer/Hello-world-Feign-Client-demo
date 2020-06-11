package com.demo.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDTO {

  private String id;

    @JsonProperty("id_persona")
    private String personId;

    @JsonProperty("id_externo")
    private String externalId;

    @JsonProperty("id_empresa")
    private String companyId;

    @JsonProperty("empresa")
    private String company;

    @JsonProperty("nombre")
    private String name;

    @JsonProperty("apellido_paterno")
    private String paternalName;

    @JsonProperty("apellido_materno")
    private String maternalName;

    @JsonProperty("id_tipo_documento")
    private String documentTypeid;

    @JsonProperty("nombre_tipo_documento")
    private String documentTypeName;

    @JsonProperty("nro_documento")
    private String document;

    @JsonProperty("id_tipo_empleado")
    private String employeeTypeId;

    @JsonProperty("nombre_tipo_empleado")
    private String employeeTypeName;

    @JsonProperty("fecha_ingreso_empleado")
    private String employeeEnteringDate;

    @JsonProperty("fecha_prevista_fin_contrato")
    private String endContractExpectedDate;

    @JsonProperty("fecha_cese_empleado")
    private String email;

    @JsonProperty("correo_electronico")
    private String employeeTerminationDate;

    @JsonProperty("telefono")
    private String telephone;

    @JsonProperty("id_pais")
    private String countryId;

    @JsonProperty("nombre_pais")
    private String countryName;

    @JsonProperty("id_sexo")
    private String sexId;

    @JsonProperty("nombre_sexo")
    private String sexName;

    @JsonProperty("fecha_nacimiento")
    private String birthDate;

    @JsonProperty("id_puesto")
    private String postId;

    @JsonProperty("nombre_puesto")
    private String postName;

    @JsonProperty("fecha_inicio_puesto")
    private String postStartDate;

    @JsonProperty("fecha_fin_puesto")
    private String postEndDate;

    @JsonProperty("id_categoria_puesto")
    private String categoryPostId;

    @JsonProperty("nombre_categoria_puesto")
    private String postCategoryName;

    @JsonProperty("id_tipo_contrato")
    private String contractTypeId;

    @JsonProperty("nombre_tipo_contrato")
    private String contractTypeName;

    @JsonProperty("id_responsable_directo")
    private String responsibleDirectId;

    @JsonProperty("id_rh_responsable_uo")
    private String rhResponsableUoId;

    @JsonProperty("id_centro_coste")
    private String centerCostId;

    @JsonProperty("nombre_centro_coste")
    private String centerCostName;

    @JsonProperty("id_ubicacion")
    private String locationId;

    @JsonProperty("nombre_ubicacion")
    private String locationName;

    @JsonProperty("id_tipo_banco")
    private String bankTypeId;

    @JsonProperty("nombre_tipo_banco")
    private String bankTypeName;

    @JsonProperty("id_banco")
    private String bankId;

    @JsonProperty("nombre_banco")
    private String bankName;

    @JsonProperty("nro_cuenta")
    private String accountNumber;

    @JsonProperty("id_especialidad")
    private String specialtyId;

    @JsonProperty("nombre_especialidad")
    private String specialtyName;

    @JsonProperty("id_titulo_carrera")
    private String raceTitleId;

    @JsonProperty("fecha_inicio_ubicacion")
    private String dateStartLocation;

    @JsonProperty("fecha_fin_ubicacion")
    private String dateEndLocation;

    @JsonProperty("unidad_organizativa")
    private String organizationalUnit;

    @JsonProperty("fin")
    private String end;
    
    @JsonProperty("fecha_fin_periodo")
    private String endDatePeriod;
    
    @JsonProperty("motivo_baja")
    private String lowReason;
    
    

    
    public String getEndDatePeriod() {
		return endDatePeriod;
	}

	public void setEndDatePeriod(String endDatePeriod) {
		this.endDatePeriod = endDatePeriod;
	}

	public String getLowReason() {
		return lowReason;
	}

	public void setLowReason(String lowReason) {
		this.lowReason = lowReason;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaternalName() {
        return paternalName;
    }

    public void setPaternalName(String paternalName) {
        this.paternalName = paternalName;
    }

    public String getMaternalName() {
        return maternalName;
    }

    public void setMaternalName(String maternalName) {
        this.maternalName = maternalName;
    }

    public String getDocumentTypeid() {
        return documentTypeid;
    }

    public void setDocumentTypeid(String documentTypeid) {
        this.documentTypeid = documentTypeid;
    }

    public String getDocumentTypeName() {
        return documentTypeName;
    }

    public void setDocumentTypeName(String documentTypeName) {
        this.documentTypeName = documentTypeName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmployeeTypeId() {
        return employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getEmployeeTypeName() {
        return employeeTypeName;
    }

    public void setEmployeeTypeName(String employeeTypeName) {
        this.employeeTypeName = employeeTypeName;
    }

    public String getEmployeeEnteringDate() {
        return employeeEnteringDate;
    }

    public void setEmployeeEnteringDate(String employeeEnteringDate) {
        this.employeeEnteringDate = employeeEnteringDate;
    }

    public String getEndContractExpectedDate() {
        return endContractExpectedDate;
    }

    public void setEndContractExpectedDate(String endContractExpectedDate) {
        this.endContractExpectedDate = endContractExpectedDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeTerminationDate() {
        return employeeTerminationDate;
    }

    public void setEmployeeTerminationDate(String employeeTerminationDate) {
        this.employeeTerminationDate = employeeTerminationDate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getSexId() {
        return sexId;
    }

    public void setSexId(String sexId) {
        this.sexId = sexId;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostStartDate() {
        return postStartDate;
    }

    public void setPostStartDate(String postStartDate) {
        this.postStartDate = postStartDate;
    }

    public String getPostEndDate() {
        return postEndDate;
    }

    public void setPostEndDate(String postEndDate) {
        this.postEndDate = postEndDate;
    }

    public String getCategoryPostId() {
        return categoryPostId;
    }

    public void setCategoryPostId(String categoryPostId) {
        this.categoryPostId = categoryPostId;
    }

    public String getPostCategoryName() {
        return postCategoryName;
    }

    public void setPostCategoryName(String postCategoryName) {
        this.postCategoryName = postCategoryName;
    }

    public String getContractTypeId() {
        return contractTypeId;
    }

    public void setContractTypeId(String contractTypeId) {
        this.contractTypeId = contractTypeId;
    }

    public String getContractTypeName() {
        return contractTypeName;
    }

    public void setContractTypeName(String contractTypeName) {
        this.contractTypeName = contractTypeName;
    }

    public String getResponsibleDirectId() {
        return responsibleDirectId;
    }

    public void setResponsibleDirectId(String responsibleDirectId) {
        this.responsibleDirectId = responsibleDirectId;
    }

    public String getRhResponsableUoId() {
        return rhResponsableUoId;
    }

    public void setRhResponsableUoId(String rhResponsableUoId) {
        this.rhResponsableUoId = rhResponsableUoId;
    }

    public String getCenterCostId() {
        return centerCostId;
    }

    public void setCenterCostId(String centerCostId) {
        this.centerCostId = centerCostId;
    }

    public String getCenterCostName() {
        return centerCostName;
    }

    public void setCenterCostName(String centerCostName) {
        this.centerCostName = centerCostName;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getBankTypeId() {
        return bankTypeId;
    }

    public void setBankTypeId(String bankTypeId) {
        this.bankTypeId = bankTypeId;
    }

    public String getBankTypeName() {
        return bankTypeName;
    }

    public void setBankTypeName(String bankTypeName) {
        this.bankTypeName = bankTypeName;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(String specialtyId) {
        this.specialtyId = specialtyId;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public String getRaceTitleId() {
        return raceTitleId;
    }

    public void setRaceTitleId(String raceTitleId) {
        this.raceTitleId = raceTitleId;
    }

    public String getDateStartLocation() {
        return dateStartLocation;
    }

    public void setDateStartLocation(String dateStartLocation) {
        this.dateStartLocation = dateStartLocation;
    }

    public String getDateEndLocation() {
        return dateEndLocation;
    }

    public void setDateEndLocation(String dateEndLocation) {
        this.dateEndLocation = dateEndLocation;
    }

    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CustomerDTO employeeDTO = (CustomerDTO) o;
        if (employeeDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), employeeDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
            "id=" + getId() +
            ", personId='" + getPersonId() + "'" +
            ", externalId='" + getExternalId() + "'" +
            ", companyId='" + getCompanyId() + "'" +
            ", company='" + getCompany() + "'" +
            ", name='" + getName() + "'" +
            ", paternalName='" + getPaternalName() + "'" +
            ", maternalName='" + getMaternalName() + "'" +
            ", documentTypeid='" + getDocumentTypeid() + "'" +
            ", documentTypeName='" + getDocumentTypeName() + "'" +
            ", document='" + getDocument() + "'" +
            ", employeeTypeId='" + getEmployeeTypeId() + "'" +
            ", employeeTypeName='" + getEmployeeTypeName() + "'" +
            ", employeeEnteringDate='" + getEmployeeEnteringDate() + "'" +
            ", endContractExpectedDate='" + getEndContractExpectedDate() + "'" +
            ", email='" + getEmail() + "'" +
            ", employeeTerminationDate='" + getEmployeeTerminationDate() + "'" +
            ", telephone='" + getTelephone() + "'" +
            ", countryId='" + getCountryId() + "'" +
            ", countryName='" + getCountryName() + "'" +
            ", sexId=" + getSexId() +
            ", sexName='" + getSexName() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", postId=" + getPostId() +
            ", postName='" + getPostName() + "'" +
            ", postStartDate='" + getPostStartDate() + "'" +
            ", postEndDate='" + getPostEndDate() + "'" +
            ", categoryPostId=" + getCategoryPostId() +
            ", postCategoryName='" + getPostCategoryName() + "'" +
            ", contractTypeId=" + getContractTypeId() +
            ", contractTypeName='" + getContractTypeName() + "'" +
            ", responsibleDirectId='" + getResponsibleDirectId() + "'" +
            ", rhResponsableUoId='" + getRhResponsableUoId() + "'" +
            ", centerCostId='" + getCenterCostId() + "'" +
            ", centerCostName='" + getCenterCostName() + "'" +
            ", locationId=" + getLocationId() +
            ", locationName='" + getLocationName() + "'" +
            ", bankTypeId=" + getBankTypeId() +
            ", bankTypeName='" + getBankTypeName() + "'" +
            ", bankId=" + getBankId() +
            ", bankName='" + getBankName() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", specialtyId='" + getSpecialtyId() + "'" +
            ", specialtyName='" + getSpecialtyName() + "'" +
            ", raceTitleId='" + getRaceTitleId() + "'" +
            ", dateStartLocation='" + getDateStartLocation() + "'" +
            ", dateEndLocation='" + getDateEndLocation() + "'" +
            ", organizationalUnit='" + getOrganizationalUnit() + "'" +
            ", lowReason='" + getLowReason() + "'" +
            ", endDatePeriod='" + getEndDatePeriod() + "'" +
            ", end='" + getEnd() + "'" +
            "}";
    }
  
}

