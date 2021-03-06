
package com.electronicpanopticon.potemkin.example;

import java.lang.Object;
import java.lang.String;
import java.lang.Double;

/**
 * Immutable implementation of {@link Example}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExample.builder()}.
 */
@SuppressWarnings({"all"})
@javax.annotation.Generated({"Immutables.generator", "Example"})
public final class ImmutableExample extends com.electronicpanopticon.potemkin.example.Example {
  private final java.lang.String id;
  private final java.lang.String firstName;
  private final java.lang.String lastName;
  private final int age;
  private final double height;
  private final double weight;

  private ImmutableExample(
      java.lang.String id,
      java.lang.String firstName,
      java.lang.String lastName,
      int age,
      double height,
      double weight) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.lang.String id() {
    return id;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("firstName")
  @Override
  public java.lang.String firstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastName")
  @Override
  public java.lang.String lastName() {
    return lastName;
  }

  /**
   * @return The value of the {@code age} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("age")
  @Override
  public int age() {
    return age;
  }

  /**
   * @return The value of the {@code height} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("height")
  @Override
  public double height() {
    return height;
  }

  /**
   * @return The value of the {@code weight} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("weight")
  @Override
  public double weight() {
    return weight;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withId(java.lang.String value) {
    if (this.id.equals(value)) return this;
    java.lang.String newValue = com.google.common.base.Preconditions.checkNotNull(value, "id");
    return new ImmutableExample(newValue, this.firstName, this.lastName, this.age, this.height, this.weight);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#firstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withFirstName(java.lang.String value) {
    if (this.firstName.equals(value)) return this;
    java.lang.String newValue = com.google.common.base.Preconditions.checkNotNull(value, "firstName");
    return new ImmutableExample(this.id, newValue, this.lastName, this.age, this.height, this.weight);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#lastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withLastName(java.lang.String value) {
    if (this.lastName.equals(value)) return this;
    java.lang.String newValue = com.google.common.base.Preconditions.checkNotNull(value, "lastName");
    return new ImmutableExample(this.id, this.firstName, newValue, this.age, this.height, this.weight);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#age() age} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withAge(int value) {
    if (this.age == value) return this;
    return new ImmutableExample(this.id, this.firstName, this.lastName, value, this.height, this.weight);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#height() height} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for height
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withHeight(double value) {
    if (Double.doubleToLongBits(this.height) == Double.doubleToLongBits(value)) return this;
    return new ImmutableExample(this.id, this.firstName, this.lastName, this.age, value, this.weight);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#weight() weight} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for weight
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withWeight(double value) {
    if (Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(value)) return this;
    return new ImmutableExample(this.id, this.firstName, this.lastName, this.age, this.height, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExample} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExample
        && equalTo((ImmutableExample) another);
  }

  private boolean equalTo(ImmutableExample another) {
    return id.equals(another.id)
        && firstName.equals(another.firstName)
        && lastName.equals(another.lastName)
        && age == another.age
        && Double.doubleToLongBits(height) == Double.doubleToLongBits(another.height)
        && Double.doubleToLongBits(weight) == Double.doubleToLongBits(another.weight);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code firstName}, {@code lastName}, {@code age}, {@code height}, {@code weight}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + id.hashCode();
    h = h * 17 + firstName.hashCode();
    h = h * 17 + lastName.hashCode();
    h = h * 17 + age;
    h = h * 17 + com.google.common.primitives.Doubles.hashCode(height);
    h = h * 17 + com.google.common.primitives.Doubles.hashCode(weight);
    return h;
  }

  /**
   * Prints the immutable value {@code Example} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return com.google.common.base.MoreObjects.toStringHelper("Example")
        .omitNullValues()
        .add("id", id)
        .add("firstName", firstName)
        .add("lastName", lastName)
        .add("age", age)
        .add("height", height)
        .add("weight", weight)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json extends com.electronicpanopticon.potemkin.example.Example {
    java.lang.String id;
    java.lang.String firstName;
    java.lang.String lastName;
    int age;
    boolean ageIsSet;
    double height;
    boolean heightIsSet;
    double weight;
    boolean weightIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.lang.String id) {
      this.id = id;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    public void setFirstName(java.lang.String firstName) {
      this.firstName = firstName;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    public void setLastName(java.lang.String lastName) {
      this.lastName = lastName;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("age")
    public void setAge(int age) {
      this.age = age;
      this.ageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("height")
    public void setHeight(double height) {
      this.height = height;
      this.heightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    public void setWeight(double weight) {
      this.weight = weight;
      this.weightIsSet = true;
    }
    @Override
    public java.lang.String id() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String firstName() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String lastName() { throw new UnsupportedOperationException(); }
    @Override
    public int age() { throw new UnsupportedOperationException(); }
    @Override
    public double height() { throw new UnsupportedOperationException(); }
    @Override
    public double weight() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExample fromJson(Json json) {
    ImmutableExample.Builder builder = ImmutableExample.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.firstName != null) {
      builder.firstName(json.firstName);
    }
    if (json.lastName != null) {
      builder.lastName(json.lastName);
    }
    if (json.ageIsSet) {
      builder.age(json.age);
    }
    if (json.heightIsSet) {
      builder.height(json.height);
    }
    if (json.weightIsSet) {
      builder.weight(json.weight);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Example} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Example instance
   */
  public static ImmutableExample copyOf(Example instance) {
    if (instance instanceof ImmutableExample) {
      return (ImmutableExample) instance;
    }
    return ImmutableExample.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableExample ImmutableExample}.
   * @return A new ImmutableExample builder
   */
  public static ImmutableExample.Builder builder() {
    return new ImmutableExample.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableExample ImmutableExample}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_FIRST_NAME = 0x2L;
    private static final long INIT_BIT_LAST_NAME = 0x4L;
    private static final long INIT_BIT_AGE = 0x8L;
    private static final long INIT_BIT_HEIGHT = 0x10L;
    private static final long INIT_BIT_WEIGHT = 0x20L;
    private long initBits = 0x3fL;

    private java.lang.String id;
    private java.lang.String firstName;
    private java.lang.String lastName;
    private int age;
    private double height;
    private double weight;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Example} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Example instance) {
      com.google.common.base.Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      firstName(instance.firstName());
      lastName(instance.lastName());
      age(instance.age());
      height(instance.height());
      weight(instance.weight());
      return this;
    }

    /**
     * Initializes the value for the {@link Example#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.lang.String id) {
      this.id = com.google.common.base.Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Example#firstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    public final Builder firstName(java.lang.String firstName) {
      this.firstName = com.google.common.base.Preconditions.checkNotNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Example#lastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    public final Builder lastName(java.lang.String lastName) {
      this.lastName = com.google.common.base.Preconditions.checkNotNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Example#age() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("age")
    public final Builder age(int age) {
      this.age = age;
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Initializes the value for the {@link Example#height() height} attribute.
     * @param height The value for height 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("height")
    public final Builder height(double height) {
      this.height = height;
      initBits &= ~INIT_BIT_HEIGHT;
      return this;
    }

    /**
     * Initializes the value for the {@link Example#weight() weight} attribute.
     * @param weight The value for weight 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    public final Builder weight(double weight) {
      this.weight = weight;
      initBits &= ~INIT_BIT_WEIGHT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableExample ImmutableExample}.
     * @return An immutable instance of Example
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableExample build() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableExample(id, firstName, lastName, age, height, weight);
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = com.google.common.collect.Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
      if ((initBits & INIT_BIT_HEIGHT) != 0) attributes.add("height");
      if ((initBits & INIT_BIT_WEIGHT) != 0) attributes.add("weight");
      return "Cannot build Example, some of required attributes are not set " + attributes;
    }
  }
}
