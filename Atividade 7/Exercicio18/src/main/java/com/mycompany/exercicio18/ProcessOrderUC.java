/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio18;

/**
 *
 * @author Rever
 */
public class ProcessOrderUC
{

    private Validator validator;
    private TransportService service;
    private EmailSender emailSender;
    private Repository repo;

    public ProcessOrderUC(Validator validator, Repository repo)
    {
        this.validator = validator;
        this.repo = repo;
    }

    public void setService(TransportService service)
    {
        this.service = service;
    }

    public void setEmailSender(EmailSender emailSender)
    {
        this.emailSender = emailSender;
    }

    public int[] process(Order order)
    {
        //1
        var errors = validator.validateBasicData(order);
        //2
        if (!errors.isEmpty())
        {
            //3
            var errorMsg = String.join(",", errors);
            throw new IllegalArgumentException(errorMsg);
        }
        //4,5
        if (service.isDown() || emailSender.isOffline())
        {
            //6
            throw new RuntimeException("Services offline. Try again later.");
        }
        int orderedProds = 0, unorderedProds = 0;
        //7
        for (int prodId : order.getProdIds())
        {
            //8
            var success = repo.orderProduct(prodId);
            if (success)
            {
                //9
                orderedProds++;
            }
            else
            {
                //10
                unorderedProds++;
            }
        }
        //11
        var transportId = service.makeTag(order.getCode(), order.getAddress());
        var emailId = emailSender.sendEmail(order.getEmail(), "Your order", order.getDesc());
        int[] ret =
        {
            transportId, emailId, orderedProds, unorderedProds
        };
        return ret;
    }
}
