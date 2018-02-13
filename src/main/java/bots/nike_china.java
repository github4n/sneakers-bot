/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bots;

import static bots.Common.LOGGER;
import java.util.logging.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author yueliliu
 */
public class nike_china extends nike{
    
    public nike_china() {
    enterTexts.add("提交订单");
    enterTexts.add("确定");
    enterTexts.add("确认");
    
    BASEURL = "https://www.nike.com/cn/launch/t/";
    loginText = "加入或登录";
    loginButtonText = "登录";
    okText = "确定";
    LOGGER.setLevel(Level.SEVERE); 
    }
    
    @Override
    public String getURL(){
        return BASEURL + productName + "?action=buy&id=" + sku + "&size=" + getSize();
        //https://www.nike.com/cn/launch/t/air-jordan-3-retro-og-cement-2018?id=854262-001&size=42
    }
    
    @Override
    void countrySelect(){
        
    }
    
    @Override
    void choosePayMethod(){
        waitforms(10000);
        //driver.get(getURL());
          
        /*
           choose AliPay
           */
        driver.get("https://www.nike.com/cn/launch/t/kyrie-4-parquet-legends?action=buy&id=AJ1691-001&size=42");     
        LOGGER.log(Level.SEVERE,"Waiting for ali pay");
        TryAndClick("//a[@data-provide='aliPayId']", driver);
        waitforms(5500);
        WebElement save = driver.findElements(By.partialLinkText("保存并继续")).get(2);
        save.click();
        waitforms(1500);
    }
//    void cop(String user){
//       
//        login(user);
//        /*
//        get back to product
//        */
//        driver.get(getURL());
//        
//       /*
//        ready to start
//        */
//       redayToStart();
//       
//       /*
//       start
//       */
//       long begin = System.currentTimeMillis();
//       driver.get(getURL());
//
//        while(true){
//           try{     
//            WebElement submit = driver.findElement(By.partialLinkText("提交订单"));
//            submit.click();
//            break;
//            }
//           catch(Exception e){
//               //e.printStackTrace();
//           }
//           try{
//               driver.findElement(By.partialLinkText("确定")).click();
//               driver.get(getURL());
//            }
//            catch(Exception e2){
//            }  
//        }
//           
//        //TryAndClick("//a[text()='提交订单']", driver);
//        
//        long end = System.currentTimeMillis();
//        
//        
//       int i=0;
//       int j=0;
//       while(i<200 && j<3000){
//            try{
//                WebElement retryele = driver.findElement(By.partialLinkText("请重试"));               
//                TryAndClick("//a[text()='提交订单']", driver);
//                i++;
//            }
//            catch(NoSuchElementException e){
//                System.out.println("retry");
//                waitforms(100);
//                j++;
//            }
//       }
//       System.out.println("try " + i + " times done");
//
//       System.out.println(end-begin);
//        //driver.quit();
//    
//    }
            
}
