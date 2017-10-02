package com.bbva.egpi.lib.r020.impl;

import com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PartyIdentification32IberpayV104;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PartyIdentification32IberpayV102;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PartyIdentification32IberpayV103;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.AccountIdentification4Choice;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.AccountSchemeName1Choice;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.BranchAndFinancialInstitutionIdentification4;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.CashAccount16;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.DateAndPlaceOfBirth;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.FinancialInstitutionIdentification7;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericAccountIdentification1;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericOrganisationIdentification1;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.GenericPersonIdentification1;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.OrganisationIdentification4;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.OrganisationIdentificationSchemeName1Choice;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.Party6Choice;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PartyIdentification32;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PersonIdentification5;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PersonIdentificationSchemeName1Choice;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00800102.PostalAddress6;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs02800101.BranchAndFinancialInstitutionIdentification5;
import com.bbva.egpi.dto.mensajeria.jaxb.common.pacs02800101.FinancialInstitutionIdentification8;
import com.bbva.egpi.lib.r020.impl.manualmapper.DateMapper;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-09-22T11:43:26+0200",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
public class SourcePACS008MapperImpl implements SourcePACS008Mapper {

    private final DateMapper dateMapper = new DateMapper();

    @Override
    public PartyIdentification32IberpayV104 dbtrPacs008Camt029(PartyIdentification32 source) {
        if ( source == null ) {
            return null;
        }

        PartyIdentification32IberpayV104 partyIdentification32IberpayV104 = new PartyIdentification32IberpayV104();

        partyIdentification32IberpayV104.setNm( source.getNm() );
        partyIdentification32IberpayV104.setPstlAdr( pstlAdrPacs008Camt029( source.getPstlAdr() ) );
        partyIdentification32IberpayV104.setId( idPacs008Camt029( source.getId() ) );

        return partyIdentification32IberpayV104;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.Party6Choice idPacs008Camt029(Party6Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.Party6Choice party6Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.Party6Choice();

        party6Choice_.setOrgId( orgIdPacs008Camt029( source.getOrgId() ) );
        party6Choice_.setPrvtId( prvtIdPacs008Camt029( source.getPrvtId() ) );

        return party6Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.OrganisationIdentification4 orgIdPacs008Camt029(OrganisationIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.OrganisationIdentification4 organisationIdentification4_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.OrganisationIdentification4();

        organisationIdentification4_.setBICOrBEI( source.getBICOrBEI() );
        organisationIdentification4_.setOthr( othrPacs008Camt029( source.getOthr() ) );

        return organisationIdentification4_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PersonIdentification5 prvtIdPacs008Camt029(PersonIdentification5 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PersonIdentification5 personIdentification5_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PersonIdentification5();

        personIdentification5_.setDtAndPlcOfBirth( dtAndPlcOfBirthPacs008Camt029( source.getDtAndPlcOfBirth() ) );
        personIdentification5_.setOthr( othrPacs008Camt029( source.getOthr() ) );

        return personIdentification5_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericOrganisationIdentification1 othrPacs008Camt029(GenericOrganisationIdentification1 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericOrganisationIdentification1 genericOrganisationIdentification1_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericOrganisationIdentification1();

        genericOrganisationIdentification1_.setId( source.getId() );
        genericOrganisationIdentification1_.setSchmeNm( schmeNmPacs008Camt029( source.getSchmeNm() ) );
        genericOrganisationIdentification1_.setIssr( source.getIssr() );

        return genericOrganisationIdentification1_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.OrganisationIdentificationSchemeName1Choice schmeNmPacs008Camt029(OrganisationIdentificationSchemeName1Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.OrganisationIdentificationSchemeName1Choice organisationIdentificationSchemeName1Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.OrganisationIdentificationSchemeName1Choice();

        if ( source.getCd() != null ) {
            organisationIdentificationSchemeName1Choice_.setCd( source.getCd().name() );
        }
        organisationIdentificationSchemeName1Choice_.setPrtry( source.getPrtry() );

        return organisationIdentificationSchemeName1Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.DateAndPlaceOfBirth dtAndPlcOfBirthPacs008Camt029(DateAndPlaceOfBirth source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.DateAndPlaceOfBirth dateAndPlaceOfBirth_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.DateAndPlaceOfBirth();

        dateAndPlaceOfBirth_.setBirthDt( dateMapper.localDateTimeToLocalDate( source.getBirthDt() ) );
        dateAndPlaceOfBirth_.setPrvcOfBirth( source.getPrvcOfBirth() );
        dateAndPlaceOfBirth_.setCityOfBirth( source.getCityOfBirth() );
        dateAndPlaceOfBirth_.setCtryOfBirth( source.getCtryOfBirth() );

        return dateAndPlaceOfBirth_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericPersonIdentification1 othrPacs008Camt029(GenericPersonIdentification1 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericPersonIdentification1 genericPersonIdentification1_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericPersonIdentification1();

        genericPersonIdentification1_.setId( source.getId() );
        genericPersonIdentification1_.setSchmeNm( schmeNmPacs008Camt029( source.getSchmeNm() ) );
        genericPersonIdentification1_.setIssr( source.getIssr() );

        return genericPersonIdentification1_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PersonIdentificationSchemeName1Choice schmeNmPacs008Camt029(PersonIdentificationSchemeName1Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PersonIdentificationSchemeName1Choice personIdentificationSchemeName1Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PersonIdentificationSchemeName1Choice();

        if ( source.getCd() != null ) {
            personIdentificationSchemeName1Choice_.setCd( source.getCd().name() );
        }
        personIdentificationSchemeName1Choice_.setPrtry( source.getPrtry() );

        return personIdentificationSchemeName1Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PostalAddress6 pstlAdrPacs008Camt029(PostalAddress6 value) {
        if ( value == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PostalAddress6 postalAddress6_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PostalAddress6();

        postalAddress6_.setCtry( value.getCtry() );
        if ( postalAddress6_.getAdrLine() != null ) {
            List<String> list = value.getAdrLine();
            if ( list != null ) {
                postalAddress6_.getAdrLine().addAll( list );
            }
        }

        return postalAddress6_;
    }

    @Override
    public PartyIdentification32IberpayV103 dbtrPacs008Pacs004(PartyIdentification32 source) {
        if ( source == null ) {
            return null;
        }

        PartyIdentification32IberpayV103 partyIdentification32IberpayV103 = new PartyIdentification32IberpayV103();

        partyIdentification32IberpayV103.setNm( source.getNm() );
        partyIdentification32IberpayV103.setPstlAdr( pstlAdrPacs008Pacs004( source.getPstlAdr() ) );
        partyIdentification32IberpayV103.setId( idPacs008Pacs004( source.getId() ) );

        return partyIdentification32IberpayV103;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.Party6Choice idPacs008Pacs004(Party6Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.Party6Choice party6Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.Party6Choice();

        party6Choice_.setOrgId( orgIdPacs008Pacs004( source.getOrgId() ) );
        party6Choice_.setPrvtId( prvtIdPacs008Pacs004( source.getPrvtId() ) );

        return party6Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.OrganisationIdentification4 orgIdPacs008Pacs004(OrganisationIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.OrganisationIdentification4 organisationIdentification4_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.OrganisationIdentification4();

        organisationIdentification4_.setBICOrBEI( source.getBICOrBEI() );
        organisationIdentification4_.setOthr( othrPacs008Pacs004( source.getOthr() ) );

        return organisationIdentification4_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PersonIdentification5 prvtIdPacs008Pacs004(PersonIdentification5 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PersonIdentification5 personIdentification5_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PersonIdentification5();

        personIdentification5_.setDtAndPlcOfBirth( dtAndPlcOfBirthPacs008Pacs004( source.getDtAndPlcOfBirth() ) );
        personIdentification5_.setOthr( othrPacs008Pacs004( source.getOthr() ) );

        return personIdentification5_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericOrganisationIdentification1 othrPacs008Pacs004(GenericOrganisationIdentification1 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericOrganisationIdentification1 genericOrganisationIdentification1_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericOrganisationIdentification1();

        genericOrganisationIdentification1_.setId( source.getId() );
        genericOrganisationIdentification1_.setSchmeNm( schmeNmPacs008Pacs004( source.getSchmeNm() ) );
        genericOrganisationIdentification1_.setIssr( source.getIssr() );

        return genericOrganisationIdentification1_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.OrganisationIdentificationSchemeName1Choice schmeNmPacs008Pacs004(OrganisationIdentificationSchemeName1Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.OrganisationIdentificationSchemeName1Choice organisationIdentificationSchemeName1Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.OrganisationIdentificationSchemeName1Choice();

        if ( source.getCd() != null ) {
            organisationIdentificationSchemeName1Choice_.setCd( source.getCd().name() );
        }
        organisationIdentificationSchemeName1Choice_.setPrtry( source.getPrtry() );

        return organisationIdentificationSchemeName1Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.DateAndPlaceOfBirth dtAndPlcOfBirthPacs008Pacs004(DateAndPlaceOfBirth source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.DateAndPlaceOfBirth dateAndPlaceOfBirth_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.DateAndPlaceOfBirth();

        dateAndPlaceOfBirth_.setBirthDt( dateMapper.localDateTimeToLocalDate( source.getBirthDt() ) );
        dateAndPlaceOfBirth_.setPrvcOfBirth( source.getPrvcOfBirth() );
        dateAndPlaceOfBirth_.setCityOfBirth( source.getCityOfBirth() );
        dateAndPlaceOfBirth_.setCtryOfBirth( source.getCtryOfBirth() );

        return dateAndPlaceOfBirth_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericPersonIdentification1 othrPacs008Pacs004(GenericPersonIdentification1 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericPersonIdentification1 genericPersonIdentification1_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericPersonIdentification1();

        genericPersonIdentification1_.setId( source.getId() );
        genericPersonIdentification1_.setSchmeNm( schmeNmPacs008Pacs004( source.getSchmeNm() ) );
        genericPersonIdentification1_.setIssr( source.getIssr() );

        return genericPersonIdentification1_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PersonIdentificationSchemeName1Choice schmeNmPacs008Pacs004(PersonIdentificationSchemeName1Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PersonIdentificationSchemeName1Choice personIdentificationSchemeName1Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PersonIdentificationSchemeName1Choice();

        if ( source.getCd() != null ) {
            personIdentificationSchemeName1Choice_.setCd( source.getCd().name() );
        }
        personIdentificationSchemeName1Choice_.setPrtry( source.getPrtry() );

        return personIdentificationSchemeName1Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PostalAddress6 pstlAdrPacs008Pacs004(PostalAddress6 value) {
        if ( value == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PostalAddress6 postalAddress6_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.PostalAddress6();

        postalAddress6_.setCtry( value.getCtry() );
        if ( postalAddress6_.getAdrLine() != null ) {
            List<String> list = value.getAdrLine();
            if ( list != null ) {
                postalAddress6_.getAdrLine().addAll( list );
            }
        }

        return postalAddress6_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PartyIdentification32IberpayV104 dbtrPacs008Camt056(PartyIdentification32 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PartyIdentification32IberpayV104 partyIdentification32IberpayV104 = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PartyIdentification32IberpayV104();

        partyIdentification32IberpayV104.setNm( source.getNm() );
        partyIdentification32IberpayV104.setPstlAdr( pstlAdrPacs008Camt056( source.getPstlAdr() ) );
        partyIdentification32IberpayV104.setId( idPacs008Camt056( source.getId() ) );

        return partyIdentification32IberpayV104;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.Party6Choice idPacs008Camt056(Party6Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.Party6Choice party6Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.Party6Choice();

        party6Choice_.setOrgId( orgIdPacs008Camt056( source.getOrgId() ) );
        party6Choice_.setPrvtId( prvtIdPacs008Camt056( source.getPrvtId() ) );

        return party6Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.OrganisationIdentification4 orgIdPacs008Camt056(OrganisationIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.OrganisationIdentification4 organisationIdentification4_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.OrganisationIdentification4();

        organisationIdentification4_.setBICOrBEI( source.getBICOrBEI() );
        organisationIdentification4_.setOthr( othrPacs008Camt056( source.getOthr() ) );

        return organisationIdentification4_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PersonIdentification5 prvtIdPacs008Camt056(PersonIdentification5 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PersonIdentification5 personIdentification5_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PersonIdentification5();

        personIdentification5_.setDtAndPlcOfBirth( dtAndPlcOfBirthPacs008Camt056( source.getDtAndPlcOfBirth() ) );
        personIdentification5_.setOthr( othrPacs008Camt056( source.getOthr() ) );

        return personIdentification5_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericOrganisationIdentification1 othrPacs008Camt056(GenericOrganisationIdentification1 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericOrganisationIdentification1 genericOrganisationIdentification1_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericOrganisationIdentification1();

        genericOrganisationIdentification1_.setId( source.getId() );
        genericOrganisationIdentification1_.setSchmeNm( schmeNmPacs008Camt056( source.getSchmeNm() ) );
        genericOrganisationIdentification1_.setIssr( source.getIssr() );

        return genericOrganisationIdentification1_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.OrganisationIdentificationSchemeName1Choice schmeNmPacs008Camt056(OrganisationIdentificationSchemeName1Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.OrganisationIdentificationSchemeName1Choice organisationIdentificationSchemeName1Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.OrganisationIdentificationSchemeName1Choice();

        if ( source.getCd() != null ) {
            organisationIdentificationSchemeName1Choice_.setCd( source.getCd().name() );
        }
        organisationIdentificationSchemeName1Choice_.setPrtry( source.getPrtry() );

        return organisationIdentificationSchemeName1Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.DateAndPlaceOfBirth dtAndPlcOfBirthPacs008Camt056(DateAndPlaceOfBirth source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.DateAndPlaceOfBirth dateAndPlaceOfBirth_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.DateAndPlaceOfBirth();

        dateAndPlaceOfBirth_.setBirthDt( dateMapper.localDateTimeToLocalDate( source.getBirthDt() ) );
        dateAndPlaceOfBirth_.setPrvcOfBirth( source.getPrvcOfBirth() );
        dateAndPlaceOfBirth_.setCityOfBirth( source.getCityOfBirth() );
        dateAndPlaceOfBirth_.setCtryOfBirth( source.getCtryOfBirth() );

        return dateAndPlaceOfBirth_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericPersonIdentification1 othrPacs008Camt056(GenericPersonIdentification1 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericPersonIdentification1 genericPersonIdentification1_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericPersonIdentification1();

        genericPersonIdentification1_.setId( source.getId() );
        genericPersonIdentification1_.setSchmeNm( schmeNmPacs008Camt056( source.getSchmeNm() ) );
        genericPersonIdentification1_.setIssr( source.getIssr() );

        return genericPersonIdentification1_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PersonIdentificationSchemeName1Choice schmeNmPacs008Camt056(PersonIdentificationSchemeName1Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PersonIdentificationSchemeName1Choice personIdentificationSchemeName1Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PersonIdentificationSchemeName1Choice();

        if ( source.getCd() != null ) {
            personIdentificationSchemeName1Choice_.setCd( source.getCd().name() );
        }
        personIdentificationSchemeName1Choice_.setPrtry( source.getPrtry() );

        return personIdentificationSchemeName1Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PostalAddress6 pstlAdrPacs008Camt056(PostalAddress6 value) {
        if ( value == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PostalAddress6 postalAddress6_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PostalAddress6();

        postalAddress6_.setCtry( value.getCtry() );
        if ( postalAddress6_.getAdrLine() != null ) {
            List<String> list = value.getAdrLine();
            if ( list != null ) {
                postalAddress6_.getAdrLine().addAll( list );
            }
        }

        return postalAddress6_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs008Camt056(BranchAndFinancialInstitutionIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.BranchAndFinancialInstitutionIdentification4();

        branchAndFinancialInstitutionIdentification4.setFinInstnId( mapfinInstnIdCamt056( source.getFinInstnId() ) );

        return branchAndFinancialInstitutionIdentification4;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.FinancialInstitutionIdentification7 mapfinInstnIdCamt056(FinancialInstitutionIdentification7 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.FinancialInstitutionIdentification7 financialInstitutionIdentification7_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.FinancialInstitutionIdentification7();

        financialInstitutionIdentification7_.setBIC( source.getBIC() );

        return financialInstitutionIdentification7_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs008Pac004(BranchAndFinancialInstitutionIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.BranchAndFinancialInstitutionIdentification4();

        branchAndFinancialInstitutionIdentification4.setFinInstnId( mapfinInstnIdPac004( source.getFinInstnId() ) );

        return branchAndFinancialInstitutionIdentification4;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.FinancialInstitutionIdentification7 mapfinInstnIdPac004(FinancialInstitutionIdentification7 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.FinancialInstitutionIdentification7 financialInstitutionIdentification7_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.FinancialInstitutionIdentification7();

        financialInstitutionIdentification7_.setBIC( source.getBIC() );

        return financialInstitutionIdentification7_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs008Camt029(BranchAndFinancialInstitutionIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.BranchAndFinancialInstitutionIdentification4();

        branchAndFinancialInstitutionIdentification4.setFinInstnId( mapfinInstnIdCamt029( source.getFinInstnId() ) );

        return branchAndFinancialInstitutionIdentification4;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.FinancialInstitutionIdentification7 mapfinInstnIdCamt029(FinancialInstitutionIdentification7 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.FinancialInstitutionIdentification7 financialInstitutionIdentification7_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.FinancialInstitutionIdentification7();

        financialInstitutionIdentification7_.setBIC( source.getBIC() );

        return financialInstitutionIdentification7_;
    }

    @Override
    public BranchAndFinancialInstitutionIdentification5 dbtrAgtPacs008Pacs028(BranchAndFinancialInstitutionIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        BranchAndFinancialInstitutionIdentification5 branchAndFinancialInstitutionIdentification5 = new BranchAndFinancialInstitutionIdentification5();

        branchAndFinancialInstitutionIdentification5.setFinInstnId( mapfinInstnIdPacs028( source.getFinInstnId() ) );

        return branchAndFinancialInstitutionIdentification5;
    }

    @Override
    public FinancialInstitutionIdentification8 mapfinInstnIdPacs028(FinancialInstitutionIdentification7 source) {
        if ( source == null ) {
            return null;
        }

        FinancialInstitutionIdentification8 financialInstitutionIdentification8_ = new FinancialInstitutionIdentification8();

        return financialInstitutionIdentification8_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs008Pacs002(BranchAndFinancialInstitutionIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4();

        branchAndFinancialInstitutionIdentification4.setFinInstnId( dbtrPacs008Pacs002( source.getFinInstnId() ) );

        return branchAndFinancialInstitutionIdentification4;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 dbtrPacs008Pacs002(FinancialInstitutionIdentification7 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 financialInstitutionIdentification7_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7();

        financialInstitutionIdentification7_.setBIC( source.getBIC() );

        return financialInstitutionIdentification7_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.CashAccount16 dbtrAcctPacs008Camt029(CashAccount16 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.CashAccount16 cashAccount16 = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.CashAccount16();

        cashAccount16.setId( idPacs008Camt029( source.getId() ) );

        return cashAccount16;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.AccountIdentification4Choice idPacs008Camt029(AccountIdentification4Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.AccountIdentification4Choice accountIdentification4Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.AccountIdentification4Choice();

        accountIdentification4Choice_.setIBAN( source.getIBAN() );
        accountIdentification4Choice_.setOthr( othrPacs008Camt029( source.getOthr() ) );

        return accountIdentification4Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericAccountIdentification1 othrPacs008Camt029(GenericAccountIdentification1 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericAccountIdentification1 genericAccountIdentification1_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.GenericAccountIdentification1();

        genericAccountIdentification1_.setId( source.getId() );
        genericAccountIdentification1_.setSchmeNm( schmeNmPacs008Camt029( source.getSchmeNm() ) );
        genericAccountIdentification1_.setIssr( source.getIssr() );

        return genericAccountIdentification1_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.AccountSchemeName1Choice schmeNmPacs008Camt029(AccountSchemeName1Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.AccountSchemeName1Choice accountSchemeName1Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.AccountSchemeName1Choice();

        accountSchemeName1Choice_.setCd( source.getCd() );
        accountSchemeName1Choice_.setPrtry( source.getPrtry() );

        return accountSchemeName1Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.CashAccount16 dbtrAcctPacs008Pacs004(CashAccount16 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.CashAccount16 cashAccount16 = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.CashAccount16();

        cashAccount16.setId( idPacs008Pacs004( source.getId() ) );

        return cashAccount16;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.AccountIdentification4Choice idPacs008Pacs004(AccountIdentification4Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.AccountIdentification4Choice accountIdentification4Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.AccountIdentification4Choice();

        accountIdentification4Choice_.setIBAN( source.getIBAN() );
        accountIdentification4Choice_.setOthr( othrPacs008Pacs004( source.getOthr() ) );

        return accountIdentification4Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericAccountIdentification1 othrPacs008Pacs004(GenericAccountIdentification1 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericAccountIdentification1 genericAccountIdentification1_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.GenericAccountIdentification1();

        genericAccountIdentification1_.setId( source.getId() );
        genericAccountIdentification1_.setSchmeNm( schmeNmPacs008Pacs004( source.getSchmeNm() ) );
        genericAccountIdentification1_.setIssr( source.getIssr() );

        return genericAccountIdentification1_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.AccountSchemeName1Choice schmeNmPacs008Pacs004(AccountSchemeName1Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.AccountSchemeName1Choice accountSchemeName1Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.AccountSchemeName1Choice();

        accountSchemeName1Choice_.setCd( source.getCd() );
        accountSchemeName1Choice_.setPrtry( source.getPrtry() );

        return accountSchemeName1Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.CashAccount16 dbtrAcctPacs008Camt056(CashAccount16 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.CashAccount16 cashAccount16 = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.CashAccount16();

        cashAccount16.setId( idPacs008Camt056( source.getId() ) );

        return cashAccount16;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.AccountIdentification4Choice idPacs008Camt056(AccountIdentification4Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.AccountIdentification4Choice accountIdentification4Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.AccountIdentification4Choice();

        accountIdentification4Choice_.setIBAN( source.getIBAN() );
        accountIdentification4Choice_.setOthr( othrPacs008Camt056( source.getOthr() ) );

        return accountIdentification4Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericAccountIdentification1 othrPacs008Camt056(GenericAccountIdentification1 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericAccountIdentification1 genericAccountIdentification1_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.GenericAccountIdentification1();

        genericAccountIdentification1_.setId( source.getId() );
        genericAccountIdentification1_.setSchmeNm( schmeNmPacs008Camt056( source.getSchmeNm() ) );
        genericAccountIdentification1_.setIssr( source.getIssr() );

        return genericAccountIdentification1_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.AccountSchemeName1Choice schmeNmPacs008Camt056(AccountSchemeName1Choice source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.AccountSchemeName1Choice accountSchemeName1Choice_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.AccountSchemeName1Choice();

        accountSchemeName1Choice_.setCd( source.getCd() );
        accountSchemeName1Choice_.setPrtry( source.getPrtry() );

        return accountSchemeName1Choice_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PartyIdentification32IberpayV103 ultmtDbtrPacs008Camt029(PartyIdentification32 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PartyIdentification32IberpayV103 partyIdentification32IberpayV103 = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.PartyIdentification32IberpayV103();

        partyIdentification32IberpayV103.setNm( source.getNm() );
        partyIdentification32IberpayV103.setId( idPacs008Camt029( source.getId() ) );

        return partyIdentification32IberpayV103;
    }

    @Override
    public PartyIdentification32IberpayV102 ultmtDbtrPacs008Pacs004(PartyIdentification32 source) {
        if ( source == null ) {
            return null;
        }

        PartyIdentification32IberpayV102 partyIdentification32IberpayV102 = new PartyIdentification32IberpayV102();

        partyIdentification32IberpayV102.setNm( source.getNm() );
        partyIdentification32IberpayV102.setId( idPacs008Pacs004( source.getId() ) );

        return partyIdentification32IberpayV102;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PartyIdentification32IberpayV103 ultmtDbtrPacs008Camt056(PartyIdentification32 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PartyIdentification32IberpayV103 partyIdentification32IberpayV103 = new com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.PartyIdentification32IberpayV103();

        partyIdentification32IberpayV103.setNm( source.getNm() );
        partyIdentification32IberpayV103.setId( idPacs008Camt056( source.getId() ) );

        return partyIdentification32IberpayV103;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 dbtrAgtPacs004Pacs002(com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.BranchAndFinancialInstitutionIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4();

        branchAndFinancialInstitutionIdentification4.setFinInstnId( finInstnIdPacs004Pacs002( source.getFinInstnId() ) );

        return branchAndFinancialInstitutionIdentification4;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 finInstnIdPacs004Pacs002(com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00400102.FinancialInstitutionIdentification7 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 financialInstitutionIdentification7_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7();

        financialInstitutionIdentification7_.setBIC( source.getBIC() );

        return financialInstitutionIdentification7_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 dbtrAgtCamt029Pacs002(com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.BranchAndFinancialInstitutionIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4();

        branchAndFinancialInstitutionIdentification4.setFinInstnId( finInstnIdCamt029Pacs002( source.getFinInstnId() ) );

        return branchAndFinancialInstitutionIdentification4;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 finInstnIdCamt029Pacs002(com.bbva.egpi.dto.mensajeria.jaxb.common.camt02900103.FinancialInstitutionIdentification7 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 financialInstitutionIdentification7_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7();

        financialInstitutionIdentification7_.setBIC( source.getBIC() );

        return financialInstitutionIdentification7_;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 dbtrAgtCamt056Pacs002(com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.BranchAndFinancialInstitutionIdentification4 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.BranchAndFinancialInstitutionIdentification4();

        branchAndFinancialInstitutionIdentification4.setFinInstnId( finInstnIdCamt056Pacs002( source.getFinInstnId() ) );

        return branchAndFinancialInstitutionIdentification4;
    }

    @Override
    public com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 finInstnIdCamt056Pacs002(com.bbva.egpi.dto.mensajeria.jaxb.common.camt05600101.FinancialInstitutionIdentification7 source) {
        if ( source == null ) {
            return null;
        }

        com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7 financialInstitutionIdentification7_ = new com.bbva.egpi.dto.mensajeria.jaxb.common.pacs00200103.FinancialInstitutionIdentification7();

        financialInstitutionIdentification7_.setBIC( source.getBIC() );

        return financialInstitutionIdentification7_;
    }
}
