import axios from "axios";

const baseUrl = "http://localhost:8080"

export const findAllOrdered = async () => {
    try{
        const response = await axios.get(baseUrl); //npm i axios  //await es para consultas asincronas, haya que marcar el método con "async"
        return response;
    }catch(error){
        console.error(error);
    }

    return null;
}