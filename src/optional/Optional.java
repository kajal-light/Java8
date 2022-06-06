package optional;
//
//public class Optional {
//
//    Customer cus=new Customer(101,null,jdkkd,456);
//
//    //empty
//    //of
//    //OfNullable
//{

//Optional<Object> ans=Optional.empty();out//
//ans=optional.empty
//******************************************************


    //Optional<String> ans=Optional.of(cus.getName);
//out----nullpointer Exception
//use this method when you required your filed


//*************************************************************
//Optional<String> ans2=Optional.ofNullable(cus.getName);
//out----optional.empty---if nulll
//out----optional[abc]---if present
//it is the combination of of and empty method

//***********get the vaule
//we can not call get method directly because it give noSuch element exception
//Optional<String> ans2=Optional.ofNullable(cus.getName);
//if(ans2.isPresent()){
//
// ans.get();//
//
//
// }{
//
// flase;
// }
//**************************return default value

//ans2.orElse("any");

//out----any---if filed is null
//************************throw exception

//ans2.orElseThrow(new serrviceException("not runng"));

//******************************orElseGet

//ans2.map(e->e.toUppser().orElseGET(()-.>"ANY");


//*****************************STREAM

//public static getCustomerbyId(String email){
//
// List<customer> list=database.getall();
//list.stream().filter(e->e.getemia()..equal(email)).findANy().OrElse("  ");
//
//
//
// }


//}




