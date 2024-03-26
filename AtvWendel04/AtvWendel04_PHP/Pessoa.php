<?php
class Pessoa {
    private $name;
    private $birth;
    public $surname = "";
    public $age;

    public function __construct($name, $birthDate) {
        $this->name = $name;
        $this->birth = new DateTime($birthDate);
        $this->calcAge();
    }

    private function calcAge() {
        $now = new DateTime();
        $interval = $this->birth->diff($now);
        $this->age = $interval->y;
    }

    public function getAge() {
        return $this->age;
    }

    public function hello() {
        $times = "";
        $hour = (int)date("H");

        if ($hour >= 5 && $hour <= 11) {
            $times = "dia";
        } else if ($hour >= 12 && $hour <= 18) {
            $times = "tarde";
        } else if ($hour >= 19 && $hour <= 23) {
            $times = "noite";
        } else if ($hour >= 0 && $hour <= 4) {
            $times = "madrugada";
        }

        return "Boa $times, me chamo $this->name, mas meu apelido é $this->surname, tenho {$this->getAge()} anos.";
    }
}
?>
