package io.swagger.api;

import io.swagger.model.ServerData;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-24T15:24:29.451528149Z[GMT]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> apiV1ServerDeleteserverIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("server_id") String serverId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServerData> apiV1ServerIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("server_id") String serverId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServerData>(objectMapper.readValue("{\n  \"framework\" : \"framework\",\n  \"name\" : \"name\",\n  \"language\" : \"language\",\n  \"id\" : \"id\"\n}", ServerData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServerData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServerData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServerData> apiV1ServerNameGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("name") String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServerData>(objectMapper.readValue("{\n  \"framework\" : \"framework\",\n  \"name\" : \"name\",\n  \"language\" : \"language\",\n  \"id\" : \"id\"\n}", ServerData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServerData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServerData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1ServerPut(@Parameter(in = ParameterIn.DEFAULT, description = "Structure of a server", required=true, schema=@Schema()) @Valid @RequestBody ServerData body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
