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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-18cce717-d397-4f65-b873-c7e0e949bd8b` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-32116098-e01f-4082-9a74-213c5d97e1a1` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-50d8b0ec-46b1-4e9f-b8e8-400bd1f2807f` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-e11f83be-957b-4c0d-b814-dc7eb4c726d3` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-427dd519-933f-4d63-8439-d1efd60babd1` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-92485820-3bdd-4642-bbc5-8284ef56db33` |
| 7 | `POST /v1/auth/token` | 200 | 16 | `qa-64220682-7877-431c-b2c9-4974b44d49fb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b94a0e81-7b74-48d4-bd10-1abb3fcd96da` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-7763f33a-74c4-492c-9598-47d2372168ab` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-0ffeb91d-8b3e-45c4-b513-76a67cf11f2d` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-10d099c7-e808-4944-be2a-6cf57682d92b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18cce717-d397-4f65-b873-c7e0e949bd8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18cce717-d397-4f65-b873-c7e0e949bd8b
Content-Type: application/json

--- request body ---
{"handle":"qa-5f987680534e","displayName":"QA 5f987680534e","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-18cce717-d397-4f65-b873-c7e0e949bd8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-5f987680534e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_468573d6-9d32-473a-b656-73cc1cad9af9","handle":"qa-5f987680534e","displayName":"QA 5f987680534e","region":"eu","role":"user","createdAt":"2026-11-07T08:55:04.410100890Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-32116098-e01f-4082-9a74-213c5d97e1a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32116098-e01f-4082-9a74-213c5d97e1a1
Content-Type: application/json

--- request body ---
{"handle":"qa-7337f6936add","displayName":"QA 7337f6936add","password":"****","region":"us"}

--- response: 201 in 15 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-32116098-e01f-4082-9a74-213c5d97e1a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-7337f6936add
X-Served-Region: us
Content-Length: 181

{"id":"acc_327d4517-cbd9-4b78-8465-25d630a6e021","handle":"qa-7337f6936add","displayName":"QA 7337f6936add","region":"us","role":"user","createdAt":"2026-11-07T08:55:04.437964453Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-50d8b0ec-46b1-4e9f-b8e8-400bd1f2807f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50d8b0ec-46b1-4e9f-b8e8-400bd1f2807f
Content-Type: application/json

--- request body ---
{"handle":"qa-5f987680534e","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-50d8b0ec-46b1-4e9f-b8e8-400bd1f2807f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_468573d6-9d32-473a-b656-73cc1cad9af9"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-7337f6936add
correlation: qa-e11f83be-957b-4c0d-b814-dc7eb4c726d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e11f83be-957b-4c0d-b814-dc7eb4c726d3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e11f83be-957b-4c0d-b814-dc7eb4c726d3
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

{"handle":"qa-7337f6936add","displayName":"QA 7337f6936add","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-7337f6936add
correlation: qa-427dd519-933f-4d63-8439-d1efd60babd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-427dd519-933f-4d63-8439-d1efd60babd1
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-427dd519-933f-4d63-8439-d1efd60babd1
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

{"handle":"qa-7337f6936add","displayName":"QA 7337f6936add","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-7337f6936add
correlation: qa-92485820-3bdd-4642-bbc5-8284ef56db33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92485820-3bdd-4642-bbc5-8284ef56db33
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-92485820-3bdd-4642-bbc5-8284ef56db33
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

{"handle":"qa-7337f6936add","displayName":"QA 7337f6936add","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-64220682-7877-431c-b2c9-4974b44d49fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64220682-7877-431c-b2c9-4974b44d49fb
Content-Type: application/json

--- request body ---
{"handle":"qa-7337f6936add","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-64220682-7877-431c-b2c9-4974b44d49fb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_327d4517-cbd9-4b78-8465-25d630a6e021"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b94a0e81-7b74-48d4-bd10-1abb3fcd96da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b94a0e81-7b74-48d4-bd10-1abb3fcd96da
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b94a0e81-7b74-48d4-bd10-1abb3fcd96da
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
correlation: qa-7763f33a-74c4-492c-9598-47d2372168ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7763f33a-74c4-492c-9598-47d2372168ab
Content-Type: application/json

--- request body ---
{"handle":"qa-7337f6936add","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7763f33a-74c4-492c-9598-47d2372168ab
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7763f33a-74c4-492c-9598-47d2372168ab"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ffeb91d-8b3e-45c4-b513-76a67cf11f2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ffeb91d-8b3e-45c4-b513-76a67cf11f2d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ffeb91d-8b3e-45c4-b513-76a67cf11f2d
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
correlation: qa-10d099c7-e808-4944-be2a-6cf57682d92b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10d099c7-e808-4944-be2a-6cf57682d92b
Content-Type: application/json

--- request body ---
{"handle":"qa-5f987680534e","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10d099c7-e808-4944-be2a-6cf57682d92b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10d099c7-e808-4944-be2a-6cf57682d92b"}
```
