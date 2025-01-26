package single_inheritance.smart_home;

class Device{
    int deviceID;
    String status;
    Device(int deviceID,String status){
        this.deviceID=deviceID;
        this.status=status;
    }
    public void displayStatus(){
        System.out.println("ID of Device:"+deviceID);
        System.out.println("Status of device:"+status);
    }
}