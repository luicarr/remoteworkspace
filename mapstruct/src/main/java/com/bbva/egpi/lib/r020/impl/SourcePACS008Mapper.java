package com.bbva.egpi.lib.r020.impl;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bbva.egpi.lib.r020.impl.manualmapper.DateMapper;

@Mapper(uses=DateMapper.class)
public interface SourcePACS008Mapper {
	
	SourcePACS008Mapper INSTANCE = Mappers.getMapper(SourcePACS008Mapper.class); 

	/**
	 * Dbtr/Cdtr PACS008ToCAMT029
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PartyIdentification32IberpayV104 dbtrPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PartyIdentification32 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.Party6Choice idPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.Party6Choice source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.OrganisationIdentification4 orgIdPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.OrganisationIdentification4 source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PersonIdentification5 prvtIdPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PersonIdentification5 source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericOrganisationIdentification1 othrPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericOrganisationIdentification1 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.OrganisationIdentificationSchemeName1Choice schmeNmPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.OrganisationIdentificationSchemeName1Choice source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.DateAndPlaceOfBirth dtAndPlcOfBirthPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.DateAndPlaceOfBirth source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericPersonIdentification1 othrPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericPersonIdentification1 source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PersonIdentificationSchemeName1Choice schmeNmPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PersonIdentificationSchemeName1Choice source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PostalAddress6 pstlAdrPacs008Camt029
	(com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PostalAddress6 value);
	
	/**
	 * 	Dbtr/Cdtr PACS008ToPACS004
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PartyIdentification32IberpayV103 dbtrPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PartyIdentification32 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.Party6Choice idPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.Party6Choice source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.OrganisationIdentification4 orgIdPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.OrganisationIdentification4 source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PersonIdentification5 prvtIdPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PersonIdentification5 source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericOrganisationIdentification1 othrPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericOrganisationIdentification1 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.OrganisationIdentificationSchemeName1Choice schmeNmPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.OrganisationIdentificationSchemeName1Choice source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.DateAndPlaceOfBirth dtAndPlcOfBirthPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.DateAndPlaceOfBirth source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericPersonIdentification1 othrPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericPersonIdentification1 source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PersonIdentificationSchemeName1Choice schmeNmPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PersonIdentificationSchemeName1Choice source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PostalAddress6 pstlAdrPacs008Pacs004
	(com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PostalAddress6 value);
	
	/**
	 * 	Dbtr/Cdtr PACS008ToCAMT056
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PartyIdentification32IberpayV104 dbtrPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PartyIdentification32 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.Party6Choice idPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.Party6Choice source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.OrganisationIdentification4 orgIdPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.OrganisationIdentification4 source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PersonIdentification5 prvtIdPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PersonIdentification5 source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericOrganisationIdentification1 othrPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericOrganisationIdentification1 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.OrganisationIdentificationSchemeName1Choice schmeNmPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.OrganisationIdentificationSchemeName1Choice source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.DateAndPlaceOfBirth dtAndPlcOfBirthPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.DateAndPlaceOfBirth source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericPersonIdentification1 othrPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericPersonIdentification1 source);

	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PersonIdentificationSchemeName1Choice schmeNmPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PersonIdentificationSchemeName1Choice source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PostalAddress6 pstlAdrPacs008Camt056
	(com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PostalAddress6 value);
	
	/**
	 * 	DbtrAgt/CdtrAgt PACS008ToCAMT056	
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.BranchAndFinancialInstitutionIdentification4 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.FinancialInstitutionIdentification7 mapfinInstnIdCamt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.FinancialInstitutionIdentification7 source);
	
	/**	
	 * DbtrAgt/CdtrAgt PACS008ToPac004
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs008Pac004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.BranchAndFinancialInstitutionIdentification4 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.FinancialInstitutionIdentification7 mapfinInstnIdPac004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.FinancialInstitutionIdentification7 source);
	
	/**	
	 * DbtrAgt/CdtrAgt PACS008ToCamt029
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.BranchAndFinancialInstitutionIdentification4 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.FinancialInstitutionIdentification7 mapfinInstnIdCamt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.FinancialInstitutionIdentification7 source);
	
	/**	
	 * DbtrAgt/CdtrAgt PACS008ToPacs028
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs02800101.BranchAndFinancialInstitutionIdentification5 dbtrAgtPacs008Pacs028(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.BranchAndFinancialInstitutionIdentification4 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs02800101.FinancialInstitutionIdentification8 mapfinInstnIdPacs028(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.FinancialInstitutionIdentification7 source);
	
	/**
	 * 	DbtrAgt/CdtrAgt PACS008ToPacs002 (CdtrAgt)
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs008Pacs002(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.BranchAndFinancialInstitutionIdentification4 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 dbtrPacs008Pacs002(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.FinancialInstitutionIdentification7 source);
	
	/**
	 * 	DbtrAcct/CdtrAcct PACS008ToCamt029	
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.CashAccount16 dbtrAcctPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.CashAccount16 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.AccountIdentification4Choice idPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.AccountIdentification4Choice source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericAccountIdentification1 othrPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericAccountIdentification1 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.AccountSchemeName1Choice schmeNmPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.AccountSchemeName1Choice source);
	
	/**
	 * 	DbtrAcct/CdtrAcct PACS008ToPacs004	
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.CashAccount16 dbtrAcctPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.CashAccount16 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.AccountIdentification4Choice idPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.AccountIdentification4Choice source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericAccountIdentification1 othrPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericAccountIdentification1 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.AccountSchemeName1Choice schmeNmPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.AccountSchemeName1Choice source);
	
	/**
	 * DbtrAcct/CdtrAcct PACS008ToCamt056
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.CashAccount16 dbtrAcctPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.CashAccount16 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.AccountIdentification4Choice idPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.AccountIdentification4Choice source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericAccountIdentification1 othrPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericAccountIdentification1 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.AccountSchemeName1Choice schmeNmPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.AccountSchemeName1Choice source);
	
	/**
	 * 	UltmtDbtr/UltmtCdtr PACS008ToCAMT029
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PartyIdentification32IberpayV103 ultmtDbtrPacs008Camt029(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PartyIdentification32 source);
	
	/**
	 * 	UltmtDbtr/UltmtCdtr PACS008ToPACS004
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PartyIdentification32IberpayV102 ultmtDbtrPacs008Pacs004(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PartyIdentification32 source);
	
	/**
	 * 	UltmtDbtr/UltmtCdtr PACS008ToCAMT056
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PartyIdentification32IberpayV103 ultmtDbtrPacs008Camt056(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PartyIdentification32 source);
	
	/**
	 * 	DbtrAgt PACS004ToPACS002	
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs004Pacs002(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.BranchAndFinancialInstitutionIdentification4 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 finInstnIdPacs004Pacs002(
			com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.FinancialInstitutionIdentification7 source);
	
	/**
	 * 	DbtrAgt CAMT029ToPACS002	
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 dbtrAgtCamt029Pacs002(
			com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.BranchAndFinancialInstitutionIdentification4 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 finInstnIdCamt029Pacs002(
			com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.FinancialInstitutionIdentification7 source);
	
	/**
	 * 	DbtrAgt CAMT056ToPACS002	
	 * 
	 * @param source
	 * @return
	 */
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 dbtrAgtCamt056Pacs002(
			com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.BranchAndFinancialInstitutionIdentification4 source);
	
	com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 finInstnIdCamt056Pacs002(
			com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.FinancialInstitutionIdentification7 source);
}