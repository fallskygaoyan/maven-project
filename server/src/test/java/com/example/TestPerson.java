package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestPerson {

  private Person person;

  @Before
  public void setup() {
	  person = new Person();
  }

  @Test
  public void personShouldInclude() {
    String someone = "World";

    assertThat(person.person(someone), containsString(someone));
  }

  @Test
  public void personShouldThePhrase() {
    String someone = "World";

    assertThat(person.person(someone).length(), is(greaterThan(someone.length())));
  }
}
