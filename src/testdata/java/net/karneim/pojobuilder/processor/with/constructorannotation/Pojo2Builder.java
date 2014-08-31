package net.karneim.pojobuilder.processor.with.constructorannotation;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class Pojo2Builder
    implements Cloneable {
  protected Pojo2Builder self;
  protected String value$firstname$java$lang$String;
  protected boolean isSet$firstname$java$lang$String;
  protected String value$surname$java$lang$String;
  protected boolean isSet$surname$java$lang$String;

  /**
   * Creates a new {@link Pojo2Builder}.
   */
  public Pojo2Builder() {
    self = (Pojo2Builder)this;
  }

  /**
   * Sets the default value for the {@link Pojo2#firstname} property.
   *
   * @param value the default value
   * @return this builder
   */
  public Pojo2Builder withFirstname(String value) {
    this.value$firstname$java$lang$String = value;
    this.isSet$firstname$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Pojo2#surname} property.
   *
   * @param value the default value
   * @return this builder
   */
  public Pojo2Builder withSurname(String value) {
    this.value$surname$java$lang$String = value;
    this.isSet$surname$java$lang$String = true;
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
      Pojo2Builder result = (Pojo2Builder)super.clone();
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
  public Pojo2Builder but() {
    return (Pojo2Builder)clone();
  }

  /**
   * Creates a new {@link Pojo2} based on this builder's settings.
   *
   * @return the created Pojo2
   */
  public Pojo2 build() {
    try {
      Pojo2 result = new Pojo2(value$firstname$java$lang$String, value$surname$java$lang$String);
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Throwable t) {
      throw new java.lang.reflect.UndeclaredThrowableException(t);
    }
  }
}