<template>
  <Todo />
</template>

<script lang="ts">
import Vue from 'vue'
import Todo from '../components/pages/Todo.vue'

export default Vue.extend({
  components: {
    Todo,
  },
})
</script>
