package com.udemycourse.springsecuritybasic.constants;

public interface SecurityConstants {
    //en un eambiente de produccion ideal debes pedir a devops inyectar este valor en runtime durante el deplyment
    //como variable de entorno usando herramientos CICD como github o jenkins
    //o podes configurarlas como variables de entorno dentro del servidor de produccion
    public static final String JWT_KEY = "jxgEQeXHuPq8VdbyYFNkANdudQ53YUn4";
    public static final String JWT_HEADER = "Authorization";
}
