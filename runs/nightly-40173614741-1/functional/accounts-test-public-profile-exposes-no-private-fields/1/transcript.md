# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-a188fdf3-97eb-4369-ac98-83480e082ee9` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-27457b78-0a68-4dbe-aef7-3526d4b6f02d` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-aaeccc92-7bcd-4375-857d-c752dd9d3b15` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-d14c2644-0fd3-488d-993b-ed40f5d5964e` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 23 | `qa-852f5bbe-63e1-4b81-a0d5-b01b6d79fc51` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-b91a687d-0bdd-4e39-a1fe-b47a0a0b7541` |
| 7 | `POST /v1/auth/token` | 200 | 14 | `qa-85c8a2f6-917b-4c70-bdb4-2a922a3c5fe0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a57d78a4-6148-4fc9-9659-47ce3628c6a5` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-b28cf534-1d49-47a9-a518-160bf3e9a60a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e389d73d-562a-4576-b8cd-1652381af69f` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-e93327ae-19b9-4147-bcc3-71b5f999e574` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a188fdf3-97eb-4369-ac98-83480e082ee9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a188fdf3-97eb-4369-ac98-83480e082ee9
Content-Type: application/json

--- request body ---
{"handle":"qa-e3519afc5388","displayName":"QA e3519afc5388","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a188fdf3-97eb-4369-ac98-83480e082ee9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-e3519afc5388
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a9a79dc-9572-41af-9099-d7c692004ea8","handle":"qa-e3519afc5388","displayName":"QA e3519afc5388","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.271344455Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-27457b78-0a68-4dbe-aef7-3526d4b6f02d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27457b78-0a68-4dbe-aef7-3526d4b6f02d
Content-Type: application/json

--- request body ---
{"handle":"qa-ed073a446135","displayName":"QA ed073a446135","password":"****","region":"us"}

--- response: 201 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-27457b78-0a68-4dbe-aef7-3526d4b6f02d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-ed073a446135
X-Served-Region: us
Content-Length: 181

{"id":"acc_ae889d20-a6ac-4981-b379-64794fd5bba9","handle":"qa-ed073a446135","displayName":"QA ed073a446135","region":"us","role":"user","createdAt":"2026-10-25T07:40:27.300541911Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-aaeccc92-7bcd-4375-857d-c752dd9d3b15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaeccc92-7bcd-4375-857d-c752dd9d3b15
Content-Type: application/json

--- request body ---
{"handle":"qa-e3519afc5388","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaeccc92-7bcd-4375-857d-c752dd9d3b15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a9a79dc-9572-41af-9099-d7c692004ea8"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-ed073a446135
correlation: qa-d14c2644-0fd3-488d-993b-ed40f5d5964e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d14c2644-0fd3-488d-993b-ed40f5d5964e
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-d14c2644-0fd3-488d-993b-ed40f5d5964e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-ed073a446135","displayName":"QA ed073a446135","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-ed073a446135
correlation: qa-852f5bbe-63e1-4b81-a0d5-b01b6d79fc51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-852f5bbe-63e1-4b81-a0d5-b01b6d79fc51
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-852f5bbe-63e1-4b81-a0d5-b01b6d79fc51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-ed073a446135","displayName":"QA ed073a446135","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-ed073a446135
correlation: qa-b91a687d-0bdd-4e39-a1fe-b47a0a0b7541

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b91a687d-0bdd-4e39-a1fe-b47a0a0b7541
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b91a687d-0bdd-4e39-a1fe-b47a0a0b7541
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-ed073a446135","displayName":"QA ed073a446135","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-85c8a2f6-917b-4c70-bdb4-2a922a3c5fe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85c8a2f6-917b-4c70-bdb4-2a922a3c5fe0
Content-Type: application/json

--- request body ---
{"handle":"qa-ed073a446135","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-85c8a2f6-917b-4c70-bdb4-2a922a3c5fe0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae889d20-a6ac-4981-b379-64794fd5bba9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a57d78a4-6148-4fc9-9659-47ce3628c6a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a57d78a4-6148-4fc9-9659-47ce3628c6a5
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a57d78a4-6148-4fc9-9659-47ce3628c6a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-b28cf534-1d49-47a9-a518-160bf3e9a60a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b28cf534-1d49-47a9-a518-160bf3e9a60a
Content-Type: application/json

--- request body ---
{"handle":"qa-ed073a446135","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b28cf534-1d49-47a9-a518-160bf3e9a60a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b28cf534-1d49-47a9-a518-160bf3e9a60a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e389d73d-562a-4576-b8cd-1652381af69f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e389d73d-562a-4576-b8cd-1652381af69f
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e389d73d-562a-4576-b8cd-1652381af69f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-e93327ae-19b9-4147-bcc3-71b5f999e574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e93327ae-19b9-4147-bcc3-71b5f999e574
Content-Type: application/json

--- request body ---
{"handle":"qa-e3519afc5388","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e93327ae-19b9-4147-bcc3-71b5f999e574
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e93327ae-19b9-4147-bcc3-71b5f999e574"}
```
