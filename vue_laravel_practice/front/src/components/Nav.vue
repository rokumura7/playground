<template>
  <div
    class="flex font-bold text-white bg-gradient-to-r from-green-400 to-blue-500 text-center px-10 py-5"
  >
    <h1 class="ml-5">Vue Laravel Practice</h1>
    <div class="m-auto">
      <router-link to="/">Signin</router-link> |
      <router-link to="/home">Home</router-link> |
      <router-link to="/signup">Signup</router-link>
    </div>
    <span class="mr-5">User Name</span>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'Nav',
})
</script>
