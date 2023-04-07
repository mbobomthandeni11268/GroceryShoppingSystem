package domain;

import java.util.Date;

public class Delivery {
    private int id;
    private String address;
    private Date deliveryDate;
    private String deliveredBy;
    private String description;
    private String type;
    private Customer customer;

    public Delivery(Builder builder) {
        this.id = builder.id;
        this.address = builder.address;
        this.deliveryDate = builder.deliveryDate;
        this.deliveredBy = builder.deliveredBy;
        this.description = builder.description;
        this.type = builder.type;
        this.customer = builder.customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(String deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static class Builder {
        private int id;
        private String address;
        private Date deliveryDate;
        private String deliveredBy;
        private String description;
        private String type;
        private Customer customer;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setDeliveryDate(Date deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        public Builder setDeliveredBy(String deliveredBy) {
            this.deliveredBy = deliveredBy;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder copy(int id, String address, Date deliveryDate, String deliveredBy, String description, String type, Customer customer) {
            this.id = id;
            this.address = address;
            this.deliveryDate = deliveryDate;
            this.deliveredBy = deliveredBy;
            this.description = description;
            this.type = type;
            this.customer = customer;
            return this;
        }

        public Delivery build(){
            return new Delivery(this);
        }
    }
}