package io.swagger.api;

import io.swagger.model.Profile;
import io.swagger.model.ProfileResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-22T22:15:12.014Z")

@Controller
public class ProfileApiController implements ProfileApi {

    private static final Logger log = LoggerFactory.getLogger(ProfileApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProfileApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ProfileResponse> addProfile(@ApiParam(value = "create new profile" ,required=true )  @Valid @RequestBody Profile body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("<null>  <message>aeiou</message>  <code>123</code></null>", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("{  \"code\" : 0,  \"profile\" : [ {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  }, {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  } ],  \"message\" : \"message\"}", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileResponse> deleteProfile(@ApiParam(value = "applicantId  to delete",required=true) @PathVariable("applicantId") Long applicantId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("<null>  <message>aeiou</message>  <code>123</code></null>", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("{  \"code\" : 0,  \"profile\" : [ {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  }, {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  } ],  \"message\" : \"message\"}", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileResponse> queryProfile() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("<null>  <message>aeiou</message>  <code>123</code></null>", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("{  \"code\" : 0,  \"profile\" : [ {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  }, {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  } ],  \"message\" : \"message\"}", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileResponse> readProfile(@ApiParam(value = "applicant ID of profile",required=true) @PathVariable("applicantId") Long applicantId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("<null>  <message>aeiou</message>  <code>123</code></null>", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("{  \"code\" : 0,  \"profile\" : [ {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  }, {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  } ],  \"message\" : \"message\"}", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileResponse> updateProfile(@ApiParam(value = "update profile" ,required=true )  @Valid @RequestBody Profile body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("<null>  <message>aeiou</message>  <code>123</code></null>", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileResponse>(objectMapper.readValue("{  \"code\" : 0,  \"profile\" : [ {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  }, {    \"professionalDetails\" : {      \"totalYearsOfExperience\" : 10,      \"primarySkill\" : \"java\",      \"role/designation\" : \"software engineer\"    },    \"personalDetails\" : {      \"firstName\" : \"Manish\",      \"lastName\" : \"singhal\",      \"phoneNumber\" : \"8767676756\",      \"address\" : [ {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      }, {        \"zipcode\" : 3181,        \"country\" : \"Australia\",        \"unit\" : \"U1103\",        \"street\" : \"7K high street windsor\",        \"addressType\" : \"home\",        \"state\" : \"VIC\"      } ],      \"emailId\" : \"yaml@gmail.com\",      \"applicantID\" : 4567677    },    \"skiilsList\" : {      \"yearsOfExperience\" : 1,      \"recentlyUsed\" : true,      \"monthsOfExperience\" : 6,      \"skillCategory\" : \"programming\",      \"toolName\" : \"swagger\"    }  } ],  \"message\" : \"message\"}", ProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
