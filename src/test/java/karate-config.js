function fn(){
    var config = {
        name : "Robin",
        baseURL : 'https://reqres.in/api'
    };

    //how to set environment variable
    var env = karate.env
    karate.log('The value of env is : ',env)

    if(env== 'qa'){
        config.baseURL = 'https://reqres.in/api/qa'
    }
    else if(env=='dev'){
        config.baseURL = 'https://reqres.in/api/dev'
    }
    else{
        config.baseURL = 'https://reqres.in/api/default'
    }

    karate.configure('connectTimeout', 50000 );
    karate.configure('readTimeout', 50000)

    return config;
}