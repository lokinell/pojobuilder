package net.karneim.pojobuilder.processor.with.copymethod;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class AddressBuilder
    implements Cloneable {
  protected AddressBuilder self;
  protected String value$street$java$lang$String;
  protected boolean isSet$street$java$lang$String;
  protected String value$city$java$lang$String;
  protected boolean isSet$city$java$lang$String;
  protected String value$postCode$java$lang$String;
  protected boolean isSet$postCode$java$lang$String;

  /**
   * Creates a new {@link AddressBuilder}.
   */
  public AddressBuilder() {
    self = (AddressBuilder)this;
  }

  /**
   * Sets the default value for the {@link Address#street} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AddressBuilder withStreet(String value) {
    this.value$street$java$lang$String = value;
    this.isSet$street$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Address#city} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AddressBuilder withCity(String value) {
    this.value$city$java$lang$String = value;
    this.isSet$city$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Address#postCode} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AddressBuilder withPostCode(String value) {
    this.value$postCode$java$lang$String = value;
    this.isSet$postCode$java$lang$String = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      AddressBuilder result = (AddressBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  public AddressBuilder but() {
    return (AddressBuilder)clone();
  }

  /**
   * Copies the values from the given pojo into this builder.
   *
   * @param pojo
   * @return this builder
   */
  public AddressBuilder copy(Address pojo) {
    withStreet(pojo.getStreet());
    withCity(pojo.getCity());
    withPostCode(pojo.getPostCode());
    return self;
  }

  /**
   * Creates a new {@link Address} based on this builder's settings.
   *
   * @return the created Address
   */
  public Address build() {
    try {
      Address result = new Address();
      if (isSet$street$java$lang$String) {
        result.setStreet(value$street$java$lang$String);
      }
      if (isSet$city$java$lang$String) {
        result.setCity(value$city$java$lang$String);
      }
      if (isSet$postCode$java$lang$String) {
        result.setPostCode(value$postCode$java$lang$String);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
